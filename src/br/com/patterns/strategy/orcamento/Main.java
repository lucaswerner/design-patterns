package br.com.patterns.strategy.orcamento;

public class Main {

    public static void main(String[] args) {
        Imposto iss = new ISS();
        Imposto icms = new ICMS();

        Orcamento orcamento = new Orcamento(500.0);

        CalculadorDeImposto calculadorDeImposto = new CalculadorDeImposto();

        calculadorDeImposto.realizaCalculo(orcamento, iss);
        calculadorDeImposto.realizaCalculo(orcamento, icms);
    }
}
