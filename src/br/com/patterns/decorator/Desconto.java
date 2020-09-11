package br.com.patterns.decorator;

public interface Desconto {
    double desconta(Orcamento orcamento);
    void setProximo(Desconto desconto);
}