package br.com.patterns.templateMethod;

public class SemDesconto implements Desconto {
    @Override
    public double desconta(Orcamento orcamento) {
        return 0;
    }

    @Override
    public void setProximo(Desconto desconto) {
        // nao tem
    }
}
