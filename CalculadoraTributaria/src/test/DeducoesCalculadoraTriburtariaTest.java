package test;

import app.calculadora.Deducao;
import app.calculadora.CalculadoraTributaria;
import app.tratamentos.DescricaoEmBrancoException;
import app.tratamentos.ValorDeducaoInvalidoException;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Dictionary;
import java.util.Hashtable;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class DeducoesCalculadoraTriburtariaTest {
    @Test
    public void testCadastrarDeducoes () {
        CalculadoraTributaria calculadora = new CalculadoraTributaria();
        ArrayList<Deducao> deducoes = new ArrayList<Deducao>();
        deducoes.add(new Deducao("Funpresp", 10000f));
        calculadora.cadastrarDeducoes(deducoes);
        assertEquals(calculadora.getValorDeducoes(), 10000f);
    }

    @Test
    public void testCadastrarDeducoesDuplicacao () {
        CalculadoraTributaria calculadora = new CalculadoraTributaria();
        ArrayList<Deducao> deducoes = new ArrayList<Deducao>();
        deducoes.add(new Deducao("Previdencia Privada", 10000f));
        deducoes.add(new Deducao("Cirilo de Jesus", "01/01/2005"));
        calculadora.cadastrarDeducoes(deducoes);
        assertEquals(calculadora.getValorDeducoes(), 10000f+189.59f);
    }

}
