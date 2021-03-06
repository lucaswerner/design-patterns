package br.com.patterns.builder;

public class TesteObserver {

    public static void main(String[] args) {
        NotaFiscalBuilder builder = new NotaFiscalBuilder();
        builder.adicionaAcao(new EnviaPorEmail());
        builder.adicionaAcao(new NotaFiscalDao());
        builder.adicionaAcao(new EnviadorDeSms());
        builder.adicionaAcao(new Impressora());

        NotaFiscal notaFiscal = builder.paraEmpresa("Caelum")
                .comCnpj("123.456.789/0001-10")
                .comItem(new ItemDaNota("item 1", 100.0))
                .comItem(new ItemDaNota("item 2", 200.0))
                .comItem(new ItemDaNota("item 3", 300.0))
                .comObservacoes("entregar notaFiscal pessoalmente")
                .naDataAtual()
                .constroi();
    }
}
