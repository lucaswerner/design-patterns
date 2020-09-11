package br.com.patterns.strategy.investimento;

public class RelizadorDeInvestimentos {

    public void realizaInvestimento(ContaBancaria contaBancaria, Investimento investimento) {
        final double retorno = investimento.calculaRetorno(contaBancaria);
        final double imposto = retorno * 0.25;
        final double ganhos = retorno - imposto;

        contaBancaria.deposita(ganhos);

        System.out.println("Retorno: " + retorno);
        System.out.println("Imposto: " + imposto);
        System.out.println("Ganhos: " + ganhos);
        System.out.println("Saldo final: " + contaBancaria.getSaldo());
    }
}
