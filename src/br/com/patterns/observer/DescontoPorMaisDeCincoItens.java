package br.com.patterns.observer;

public class DescontoPorMaisDeCincoItens extends TemplateDeDescontoCondicional {

    @Override
    protected boolean deveAplicarDesconto(Orcamento orcamento) {
        return orcamento.getItens().size() > 5;
    }

    @Override
    protected double calcularValorDesconto(Orcamento orcamento) {
        return orcamento.getValor() * 0.1;
    }

}
