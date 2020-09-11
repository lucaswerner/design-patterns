package br.com.patterns.decorator;

public class IKCV extends TemplateDeImpostoCondicional {

    public IKCV(Imposto outroImposto) {
        super(outroImposto);
    }

    public IKCV() {
        super();
    }

    @Override
    public boolean deveUsarMaximaTaxacao(Orcamento orcamento) {
        return orcamento.getValor() > 500 && temItemMaiorQue100ReaisNo(orcamento);
    }

    @Override
    public double maximaTaxacao(Orcamento orcamento) {
        return orcamento.getValor() * 0.1;
    }

    @Override
    public double minimaTaxacao(Orcamento orcamento) {
        return orcamento.getValor() * 0.06;
    }

    private boolean temItemMaiorQue100ReaisNo(Orcamento orcamento) {
        return orcamento.getItens().stream().anyMatch(item -> item.getValor() > 100);
    }
}
