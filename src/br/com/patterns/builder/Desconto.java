package br.com.patterns.builder;

public interface Desconto {
    double desconta(Orcamento orcamento);
    void setProximo(Desconto desconto);
}