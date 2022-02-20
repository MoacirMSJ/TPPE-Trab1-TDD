package app.calcauladora;

import java.util.Dictionary;
import java.util.Hashtable;

public class Deducao {
    private String descricao;
    private Float valor;
    private String nomeDependente = "";
    private String dataNascimentoDependente = "";

    public Deducao(String descricao, Float valor) {
        this.descricao = descricao;
        this.valor = valor;
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
        dependenteInfo.put("nome", "João Pedro");
        dependenteInfo.put("dataNascimento", "01/01/2005");
        return dependenteInfo;
    }
}
