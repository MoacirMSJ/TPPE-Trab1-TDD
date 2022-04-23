package app.calculadora;

import app.tratamentos.DescricaoEmBrancoException;
import app.tratamentos.ValorDeducaoInvalidoException;

import java.util.Dictionary;
import java.util.Hashtable;

public class Deducao {
    private String descricao;
    private Float valor;
    private String nomeDependente = "";
    private String dataNascimentoDependente = "";

    public Deducao(String descricao, Float valor) {
        this.validarDeducao(descricao,valor);
        this.descricao = descricao;
        this.valor = valor;
    }

    private void validarDeducao(String descricao, Float valor) {
        if (valor <= 0){
            throw new ValorDeducaoInvalidoException("Valor deve ser maior do que zero");
        }
        if (descricao.isEmpty()){
            throw new DescricaoEmBrancoException("Descrição não informada");
        }
    }

    public Deducao(String nomeDependente, String dataNascimento) {
        this.descricao = "Dependente";
        this.nomeDependente = nomeDependente;
        this.dataNascimentoDependente = dataNascimento;
        this.valor = 189.59f;
    }

    public Float getValor() {
        return this.valor;
    }

    public String getDescricao() {
        return this.descricao;
    }

    public Dictionary getDependenteInfo() {
        Dictionary dependenteInfo = new Hashtable();
        dependenteInfo.put("nome", nomeDependente);
        dependenteInfo.put("dataNascimento", dataNascimentoDependente);
        return dependenteInfo;
    }
}
