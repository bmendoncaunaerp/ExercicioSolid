public class Main {
    public static void main(String[] args) {
        Produto produto1 = new Produto(1, "Tenis", 100);
        Produto produto2 = new Produto(2, "Camiseta", 50);

        CarrinhoProduto carrinho = new CarrinhoProduto();
        carrinho.adicionar(produto1);
        carrinho.adicionar(produto2);
        carrinho.alteraNome(produto1, "Bota");
        carrinho.imprimir();
        carrinho.calcularTotal();
    }
}
