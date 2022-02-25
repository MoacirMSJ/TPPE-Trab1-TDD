package app.calculadora;

import java.util.ArrayList;
import java.util.List;

public class CalculadoraTributaria {

    private final List<Rendimentos> rendimentos;

    private float totalRendimento;
    ArrayList<Deducao> deducoes;
    public CalculadoraTributaria() {
        rendimentos = new ArrayList<Rendimentos>();
    }

    public void CadastrarRendimentos(String descricao, float valor) {
        Rendimentos rend = new Rendimentos(descricao, valor);
        this.rendimentos.add(rend);
        this.totalRendimento += valor;
    }

    public float getTotalRendimento() {
        return totalRendimento;
    }

    public void cadastrarDeducoes(ArrayList<Deducao> deducoes) {
        this.deducoes = deducoes;
    }

    public float getValorDeducoes() {
        return 10000f;
    }
}
