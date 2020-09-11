package br.com.patterns.strategy.orcamento;

public class CalculadorDeImposto {

    public void realizaCalculo(Orcamento orcamento, Imposto impostoQualquer) {

        double valorImposto = impostoQualquer.calcula(orcamento);
        System.out.println(valorImposto);
    }
}
