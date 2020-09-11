package br.com.patterns.builder;

public class NotaFiscalDao implements AcaoAposGerarNota {
    @Override
    public void executa(NotaFiscal nf) {
        System.out.println("Salvando no banco!");
    }
}
