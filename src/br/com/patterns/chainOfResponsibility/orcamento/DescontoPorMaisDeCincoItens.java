package br.com.patterns.chainOfResponsibility.orcamento;

public class DescontoPorMaisDeCincoItens implements Desconto {

    private Desconto proximoDesconto;

    @Override
    public double desconta(Orcamento orcamento) {
        if (orcamento.getItens().size() > 5)
            return orcamento.getValor() * 0.1;

        return proximoDesconto.desconta(orcamento);
    }

    @Override
    public void setProximo(Desconto desconto) {
        this.proximoDesconto = desconto;
    }
}
