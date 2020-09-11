package br.com.patterns.state;

public abstract class TemplateDeImpostoCondicional implements Imposto {

    @Override
    public final double calcula(Orcamento orcamento) {

        if (deveUsarMaximaTaxacao(orcamento))
            return maximaTaxacao(orcamento);

        return minimaTaxacao(orcamento);
    }

    protected abstract boolean deveUsarMaximaTaxacao(Orcamento orcamento);

    protected abstract double maximaTaxacao(Orcamento orcamento);

    protected abstract double minimaTaxacao(Orcamento orcamento);
}
