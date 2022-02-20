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
}
