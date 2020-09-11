package br.com.patterns.observer;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Orcamento {

    protected double valor;
    protected EstadoDeUmOrcamento estadoAtual;
    private final List<Item> itens;

    public Orcamento(double valor) {
        this.valor = valor;
        this.itens = new ArrayList<Item>();
        this.estadoAtual = new EmAprovacao();
    }

    public Orcamento() {
        this.estadoAtual = new EmAprovacao();
        this.itens = new ArrayList<Item>();
    }

    public double getValor() {
        return valor;
    }

    public List<Item> getItens() {
        return Collections.unmodifiableList(itens);
    }

    public void adicionaItem(Item item) {
        itens.add(item);
    }

    public void aplicaDescontoExtra() {
        estadoAtual.aplicaDescontoExtra(this);
    }

    public void aprova() {
        estadoAtual.aprova(this);
    }

    public void reprova() {
        estadoAtual.reprova(this);
    }

    public void finaliza() {
        estadoAtual.finaliza(this);
    }

}
