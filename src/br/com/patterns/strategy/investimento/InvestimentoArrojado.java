package br.com.patterns.strategy.investimento;

import java.util.Random;

public class InvestimentoArrojado implements Investimento {
    @Override
    public double calculaRetorno(ContaBancaria contaBancaria) {
        final double saldo = contaBancaria.getSaldo();
        final double randomDouble = new Random().nextDouble();

        if (randomDouble > 0.8) {
            return saldo * 0.05;
        }

        if (randomDouble > 0.5) {
            return saldo * 0.03;
        }

        return saldo * 0.006;
    }
}
