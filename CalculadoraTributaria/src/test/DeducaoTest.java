package test;

import app.calcauladora.Deducao;
import app.tratamentos.ValorDeducaoInvalidoException;
import org.junit.jupiter.api.Test;
import java.util.Dictionary;
import java.util.Hashtable;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class DeducaoTest {
    @Test
    public void testCadastrarDeducao () {
        Deducao deducao = new Deducao("Salario", 10000f);
        assertEquals( deducao.getValor(), 10000f);
        assertEquals( deducao.getDescricao(), "Salario");
    }

    @Test
    public void testDuplicacaoCadastratarDeducao () {
        Deducao deducao = new Deducao("Funpresp", 480.20f);
        assertEquals( deducao.getValor(), 480.20f);
        assertEquals( deducao.getDescricao(), "Funpresp");
    }

    @Test
    public void testTriangulacaoCadastratarDeducao () {
        Deducao deducaoFunpresp = new Deducao("Funpresp", 480.20f);
        assertEquals( deducaoFunpresp.getValor(), 480.20f);
        assertEquals( deducaoFunpresp.getDescricao(), "Funpresp");

        Deducao deducaoAluguel = new Deducao("Aluguel", 1940.10f);
        assertEquals( deducaoAluguel.getValor(), 1940.10f);
        assertEquals( deducaoAluguel.getDescricao(), "Aluguel");

        Deducao deducaoSalario = new Deducao("Salario", 10831f);
        assertEquals( deducaoSalario.getValor(), 10831f);
        assertEquals( deducaoSalario.getDescricao(), "Salario");
    }

    @Test
    public void testCadastroDeducaoDependente() {
        Deducao dependente = new Deducao("João Pedro",  "01/01/2005");
        Dictionary dependenteInfo = new Hashtable();
        dependenteInfo.put("nome", "João Pedro");
        dependenteInfo.put("dataNascimento", "01/01/2005");
        assertEquals( dependente.getDependenteInfo(), dependenteInfo);
        assertEquals( dependente.getValor(), 189.59f);
        assertEquals( dependente.getDescricao(), "Dependente");
    }

    @Test
    public void testDuplicacaoCadastroDeducaoDependente() {
        Deducao dependente = new Deducao("Maria Joaquina",  "05/05/2010");
        Dictionary dependenteInfo = new Hashtable();
        dependenteInfo.put("nome", "Maria Joaquina");
        dependenteInfo.put("dataNascimento", "05/05/2010");
        assertEquals( dependente.getDependenteInfo(), dependenteInfo);
        assertEquals( dependente.getValor(), 189.59f);
        assertEquals( dependente.getDescricao(), "Dependente");
    }

    @Test
    public void testTriangulacaoCadastroDeducaoDependente() {
        Deducao dependente = new Deducao("Cirilo da Silva",  "28/11/2010");
        Dictionary dependenteInfo = new Hashtable();
        dependenteInfo.put("nome", "Cirilo da Silva");
        dependenteInfo.put("dataNascimento", "28/11/2010");
        assertEquals( dependente.getDependenteInfo(), dependenteInfo);
        assertEquals( dependente.getValor(), 189.59f);
        assertEquals( dependente.getDescricao(), "Dependente");
    }

    @Test()
    public void testCadastroDeducaoValorNegativo () {
            assertThrows(ValorDeducaoInvalidoException.class, ()-> new Deducao("Funpresp", -480.20f), "Valor deve ser maior do que zero");
    }

    @Test()
    public void testCadastroDeducaoValorZero () {
        assertThrows(ValorDeducaoInvalidoException.class, ()-> new Deducao("Funpresp", 0f), "Valor deve ser maior do que zero");
    }
}
