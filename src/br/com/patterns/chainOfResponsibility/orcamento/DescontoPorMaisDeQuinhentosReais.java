package br.com.patterns.chainOfResponsibility.orcamento;

public class DescontoPorMaisDeQuinhentosReais implements Desconto {

    private Desconto proximoDesconto;

    @Override
    public double desconta(Orcamento orcamento) {
        final double valorOrcamento = orcamento.getValor();
        if (valorOrcamento > 500)
            return valorOrcamento * 0.07;

        return proximoDesconto.desconta(orcamento);
    }

    @Override
    public void setProximo(Desconto desconto) {
        this.proximoDesconto = desconto;
    }
}
