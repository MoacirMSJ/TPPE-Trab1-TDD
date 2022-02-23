package app.cadastroRendimentos;

import app.tratamentos.DescricaoEmBrancoException;
import app.tratamentos.ValorRendimentoInvalidoException;

public class CadastroRendimentos {
    private String descricao;
    private Double valor;

    public CadastroRendimentos(String descricao, Double valor) {

        if (descricao.equals("")){
            throw new DescricaoEmBrancoException("Descrição não informada");
        }
        if (valor <= 0.0){
            throw new ValorRendimentoInvalidoException("Valor deve ser maior do que zero");
        }
        this.descricao = descricao;
        this.valor = valor;
    }

    public Double getValor() {
        return this.valor;
    }

    public String getDescricao() {
        return this.descricao;
    }


}
