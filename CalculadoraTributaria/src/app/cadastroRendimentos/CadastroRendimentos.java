package app.cadastroRendimentos;

import app.tratamentos.DescricaoEmBrancoException;
import app.tratamentos.ValorRendimentoInvalidoException;

public class CadastroRendimentos {
    private String descricao;
    private Float valor;

    public CadastroRendimentos(String descricao, Float valor) {

        if (descricao.equals("")){
            throw new DescricaoEmBrancoException("Descrição não informada");
        }
        if (valor < 0){
            throw new ValorRendimentoInvalidoException("Valor deve ser maior do que zero");
        }
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
