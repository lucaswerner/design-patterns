package br.com.patterns.strategy.investimento;

import java.util.Random;

public class InvestimentoConservador implements Investimento {
    @Override
    public double calculaRetorno(ContaBancaria contaBancaria) {
        return contaBancaria.getSaldo() * 0.008;
    }
}
