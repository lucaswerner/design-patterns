package br.com.patterns.observer;

public class DescontoPorMaisDeQuinhentosReais extends TemplateDeDescontoCondicional {

    @Override
    protected boolean deveAplicarDesconto(Orcamento orcamento) {
        return orcamento.getValor() > 500;
    }

    @Override
    protected double calcularValorDesconto(Orcamento orcamento) {
        return orcamento.getValor() * 0.07;
    }

}
