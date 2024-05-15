import java.util.List;

public class Calculadora {
    float calculaTotal(List<Produto> produtos, float desconto) {
        float resultado = 0;
        for(Produto produto: produtos) {
            resultado += produto.getValor();
        }
        return resultado - desconto;
    }
}
