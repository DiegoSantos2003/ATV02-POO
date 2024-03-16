package model;

import view.Pedido;
import view.Produto;
import view.ItemPedido;

public class Principal {
  public static void main(String[] args) {

        Produto produto1 = new Produto(1, 10.50, "Produto 1");
        Produto produto2 = new Produto(2, 20.75, "Produto 2");

    
        ItemPedido item1 = new ItemPedido(produto1, 2);
        ItemPedido item2 = new ItemPedido(produto2, 3);

       
        Pedido pedido = new Pedido();
        pedido.adicionarItem(item1);
        pedido.adicionarItem(item2);

    
        System.out.println("Número da Nota: " + pedido.getNumeroNota());
        System.out.println("Valor Total: R$" + pedido.getValorTotal());
    }
}

