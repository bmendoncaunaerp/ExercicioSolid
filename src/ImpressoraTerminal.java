import java.util.List;

public class ImpressoraTerminal implements Impressora {
    @Override
    public void imprimir(List<Produto> produtos) {
        for(Produto produto: produtos) {
            System.out.println(produto.getNome());
        }
    }
    // Interface Segregation
}
