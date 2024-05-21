import java.util.List;

public class CalculadoraImpl implements Calculadora {
    @Override
    public float calculaTotal(List<Produto> produtos, float desconto) {
        float resultado = 0;
        for(Produto produto: produtos) {
            resultado += produto.getValor();
        }
        return resultado - desconto;
    }
}
