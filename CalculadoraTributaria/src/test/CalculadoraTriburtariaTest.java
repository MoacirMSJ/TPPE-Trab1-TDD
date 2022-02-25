package test;

import app.calcauladora.CalculadoraTributaria;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

import java.util.Arrays;
import java.util.Collection;

import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class CalculadoraTriburtariaTest {

    CalculadoraTributaria simul;

    Object[][] rendimentos;
    float valorEsperado;

    public CalculadoraTriburtariaTest(Object[][] rendimentos, float valorEsperado) {
        this.rendimentos = rendimentos;
        this.valorEsperado = valorEsperado;
    }

    @Parameters
    public static Collection<Object[]> getParameters() {

        Object[][] respostas = new Object[][]{
                {new Object[][]{
                        {"salario", 15000f},
                }, 15000f},
                {new Object[][]{
                        {"salario", 8000f},
                        {"dividendo", 3500f}
                }, 11500f},
                {new Object[][]{
                        {"salario", 5000f},
                        {"dividendo", 300f},
                        {"nota fiscal ", 4000f}
                }, 9300f}
        };

        return Arrays.asList(respostas);
    }

    @Before
    public void setup() {
        simul = new CalculadoraTributaria();
    }

    @Test
    public void testCadastroRendimentosParametrizado() {
        for (Object[] o : rendimentos) {
            simul.CadastrarRendimentos((String) o[0], (float) o[1]);
        }
        assertEquals(valorEsperado, simul.getTotalRendimento(), 0f);
    }
}
