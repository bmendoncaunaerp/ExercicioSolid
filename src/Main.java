import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        var produtos = new ArrayList<Produto>();
        var impressora = new ImpressoraTerminal();
        var calculadora = new CalculadoraImpl();

        // Dependency Injection
        var carrinho = new CarrinhoProduto(produtos, impressora, calculadora);

        Produto produto1 = new Produto(1, "Tenis", 100);
        Produto produto2 = new Produto(2, "Camiseta", 50);

        carrinho.adicionar(produto1);
        carrinho.adicionar(produto2);
        produto1.setNome("Bota");
        carrinho.imprimir();
        carrinho.calcularTotal();
    }
}
