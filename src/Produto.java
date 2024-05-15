public class Produto {
    private final int codigo;
    private String nome;
    private final float valor;

    public Produto(int codigo, String nome, float valor) {
        this.codigo = codigo;
        this.nome = nome;
        this.valor = valor;
    }

    public int getCodigo() {
        return codigo;
    }

    public String getNome() {
        return nome;
    }

    public float getValor() {
        return valor;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
