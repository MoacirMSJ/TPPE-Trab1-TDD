package app.cadastroRendimentos;

public class CadastroRendimentos {
    private String descricao;
    private Float valor;

    public CadastroRendimentos(String descricao, Float valor) {
        this.descricao = descricao;
        this.valor = valor;
    }

    public Float getValor() {
        return valor;
    }

    public String getDescricao() {
        return descricao;
    }
}
