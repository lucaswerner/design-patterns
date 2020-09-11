package br.com.patterns.decorator;

public abstract class TemplateDeDescontoCondicional implements Desconto {
    private Desconto proximoDesconto;

    protected abstract boolean deveAplicarDesconto(Orcamento orcamento);

    protected abstract double calcularValorDesconto(Orcamento orcamento);

    @Override
    public final double desconta(Orcamento orcamento) {
        if (deveAplicarDesconto(orcamento))
            return calcularValorDesconto(orcamento);

        return proximoDesconto.desconta(orcamento);
    }

    @Override
    public final void setProximo(Desconto desconto) {
        this.proximoDesconto = desconto;
    }
}
