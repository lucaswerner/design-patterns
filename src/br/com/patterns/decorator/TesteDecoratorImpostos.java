package br.com.patterns.decorator;

public class TesteDecoratorImpostos {

    public static void main(String[] args) {
        Imposto impostos = new ISS(new ICMS());

        Imposto ikcvPlusIcpp = new IKCV(new ICPP());

        Orcamento orcamento = new Orcamento(500.0);

        System.out.println(impostos.calcula(orcamento));
        System.out.println(ikcvPlusIcpp.calcula(orcamento));
    }
}
