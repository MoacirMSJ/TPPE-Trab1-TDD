package test;

import app.calcauladora.CalculadoraTributaria;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculadoraTriburtariaTest {


    @Test
    public void testCadastroUmRendimento () {
        CalculadoraTributaria calc = new CalculadoraTributaria();
        calc.CadastrarRendimentos("salario", 10000f);
        assertEquals( calc.getTotalRendimento(), 10000f);
    }

    @Test
    public void testCadastroDoisRendimento () {
        CalculadoraTributaria calc = new CalculadoraTributaria();
        calc.CadastrarRendimentos("salario", 10000f);
        calc.CadastrarRendimentos("aluguel", 2000f);
        assertEquals( calc.getTotalRendimento(), 12000f);
    }
}
