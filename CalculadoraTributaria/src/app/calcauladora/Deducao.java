package app.calcauladora;

public class Deducao {
    private String descricao;
    private Float valor;

    public Deducao(String descricao, Float valor) {
        this.descricao = descricao;
        this.valor = valor;
    }

    public Float getValor() {
        return this.valor;
    }

    public String getDescricao() {
        return this.descricao;
    }
}
