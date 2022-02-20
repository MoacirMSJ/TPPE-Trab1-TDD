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
}
