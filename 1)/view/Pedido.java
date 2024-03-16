package view;

import java.util.ArrayList;
import java.util.List;

public class Pedido {
    public int numeroNota;
    public double valorTotal;
    public List<ItemPedido> itens;

    public Pedido() {
        this.itens = new ArrayList<>();
    }

    public int getNumeroNota() {
        return numeroNota;
    }

    public void setNumeroNota(int numeroNota) {
        this.numeroNota = numeroNota;
    }

    public double getValorTotal() {
        return valorTotal;
    }

    public void adicionarItem(ItemPedido item) {
        itens.add(item);
        calcularValorTotal();
    }

    public void calcularValorTotal() {
        valorTotal = 0;
        for (ItemPedido item : itens) {
            valorTotal += item.getQuantidade() * item.getProduto().getValor();
        }
    }
}