import java.util.ArrayList;
import java.util.List;

public class CarrinhoProduto {
    private final List<Produto> produtos = new ArrayList<>();
    private final Impressora impressora = new ImpressoraTerminal();
    private final Calculadora calculadora = new Calculadora();

    void adicionar(Produto produto) {
        produtos.add(produto);
    }

    void imprimir() {
        impressora.imprimir(produtos);
    }

    void calcularTotal() {
        System.out.println(calculadora.calculaTotal(produtos, 10));
    }

    void alteraNome(Produto produto, String novoNome) {
        produto.setNome(novoNome);
    }
}
