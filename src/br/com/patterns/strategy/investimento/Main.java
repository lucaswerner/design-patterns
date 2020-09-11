package br.com.patterns.strategy.investimento;

import br.com.patterns.strategy.orcamento.*;

public class Main {

    public static void main(String[] args) {

        final Investimento conservador = new InvestimentoConservador();
        final Investimento moderado = new InvestimentoModerado();
        final Investimento arrojado = new InvestimentoArrojado();

        final RelizadorDeInvestimentos relizadorDeInvestimentos = new RelizadorDeInvestimentos();

        ContaBancaria contaBancariaConservadora = new ContaBancaria(100);
        ContaBancaria contaBancariaModerada = new ContaBancaria(100);
        ContaBancaria contaBancariaArrojada = new ContaBancaria(100);

        relizadorDeInvestimentos.realizaInvestimento(contaBancariaConservadora, conservador);
        relizadorDeInvestimentos.realizaInvestimento(contaBancariaModerada, moderado);
        relizadorDeInvestimentos.realizaInvestimento(contaBancariaArrojada, arrojado);
    }
}
