import java.util.ArrayList;
import java.util.List;

public class CarrinhoProduto {
    // Dependency Inversion
    private final List<Produto> produtos;
    private final Impressora impressora;
    private final Calculadora calculadora;

    public CarrinhoProduto(List<Produto> produtos, Impressora impressora, Calculadora calculadora) {
        this.produtos = produtos;
        this.impressora = impressora;
        this.calculadora = calculadora;
    }

    void adicionar(Produto produto) {
        produtos.add(produto);
    }

    void imprimir() {
        impressora.imprimir(produtos);
    }

    void calcularTotal() {
        // Open Closed
        System.out.println(calculadora.calculaTotal(produtos, 10));
    }
    // Single Responsibility
}
