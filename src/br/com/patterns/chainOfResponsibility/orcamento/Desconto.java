package br.com.patterns.chainOfResponsibility.orcamento;

public interface Desconto {
    double desconta(Orcamento orcamento);
    void setProximo(Desconto desconto);
}