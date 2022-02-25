package app.calcauladora;

import java.util.ArrayList;
import java.util.List;

public class CalculadoraTributaria {

    private float totalRendimento;
    private List<Rendimentos> rendimentos;

    public CalculadoraTributaria() {
        rendimentos = new ArrayList<Rendimentos>();
    }

    public void CadastrarRendimentos (String descricao, float valor){
        Rendimentos rend = new Rendimentos(descricao, valor);
        this.rendimentos.add(rend);
        this.totalRendimento += valor;
    }

    public float getTotalRendimento() {
        return totalRendimento;
    }

}
