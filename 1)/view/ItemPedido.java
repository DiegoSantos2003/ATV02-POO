package view;

public class ItemPedido {
        public Produto produto;
        public int quantidade;
    
        public ItemPedido(Produto produto, int quantidade) {
            this.produto = produto;
            this.quantidade = quantidade;
        }
    
        public int getQuantidade() {
            return quantidade;
        }
    
        public void setQuantidade(int quantidade) {
            this.quantidade = quantidade;
        }
    
        public Produto getProduto() {
            return produto;
        }
    }
    
