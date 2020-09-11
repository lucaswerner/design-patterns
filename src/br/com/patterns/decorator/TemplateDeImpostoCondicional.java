package br.com.patterns.decorator;

public abstract class TemplateDeImpostoCondicional extends Imposto {

    public TemplateDeImpostoCondicional(Imposto outroImposto) {
        super(outroImposto);
    }

    public TemplateDeImpostoCondicional() {
        super();
    }

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
