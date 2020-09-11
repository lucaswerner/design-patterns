package br.com.patterns.strategy.investimento;

import java.util.Random;

public class InvestimentoModerado implements Investimento {

    @Override
    public double calculaRetorno(ContaBancaria contaBancaria) {
        final double saldo = contaBancaria.getSaldo();
        final boolean receberMaiorInvestimento = new Random().nextDouble() > 0.5;
        if (receberMaiorInvestimento) {
            return saldo * 0.025;
        }

        return saldo * 0.007;
    }
}
