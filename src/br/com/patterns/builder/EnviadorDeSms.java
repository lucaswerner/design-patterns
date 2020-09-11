package br.com.patterns.builder;

public class EnviadorDeSms implements AcaoAposGerarNota {
    @Override
    public void executa(NotaFiscal nf) {
        System.out.println("Enviando por sms");
    }
}
