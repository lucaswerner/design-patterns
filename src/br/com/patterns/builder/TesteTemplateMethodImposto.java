package br.com.patterns.builder;

public class TesteTemplateMethodImposto {

    public static void main(String[] args) {

        final CalculadorDeImposto calculadorDeImposto = new CalculadorDeImposto();

        final Item itemA = new Item("NOTEBOOK", 1500);
        final Item itemB = new Item("TABLE", 400);

        Orcamento orcamentoA = new Orcamento(1900);
        orcamentoA.adicionaItem(itemA);
        orcamentoA.adicionaItem(itemB);

        Imposto icpp = new ICPP();
        Imposto ikcv = new IKCV();

        calculadorDeImposto.realizaCalculo(orcamentoA, icpp);
        calculadorDeImposto.realizaCalculo(orcamentoA, ikcv);
    }
}