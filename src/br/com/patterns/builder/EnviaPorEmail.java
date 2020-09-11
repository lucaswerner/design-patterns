package br.com.patterns.builder;

public class EnviaPorEmail implements AcaoAposGerarNota {
    @Override
    public void executa(NotaFiscal nf) {
        System.out.println("Enviando por e-mail!");
    }
}
