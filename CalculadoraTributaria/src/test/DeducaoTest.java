package test;

import app.calcauladora.Deducao;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


import static org.junit.jupiter.api.Assertions.assertEquals;


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
}
