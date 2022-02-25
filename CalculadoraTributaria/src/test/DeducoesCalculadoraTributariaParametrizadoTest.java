package test;

import app.calculadora.CalculadoraTributaria;
import app.calculadora.Deducao;
import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNull;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

import static org.junit.Assert.assertEquals;


@RunWith(Parameterized.class)
public class DeducoesCalculadoraTributariaParametrizadoTest {

    CalculadoraTributaria simul;

    Object[][] deducoes;
    float valorEsperado;

    public DeducoesCalculadoraTributariaParametrizadoTest(Object[][] deducoes, float valorEsperado) {
        this.deducoes = deducoes;
        this.valorEsperado = valorEsperado;
    }


    @Contract(pure = true)
    @Parameters
    public static @NotNull
    Collection<Object[]> getParameters() {
        Object[][] respostas = new Object[][]{
                {new Object[][]{
                        {"Funpresp", 480.20f},
                }, 480.20f},
                {new Object[][]{
                        {"Previdencia Privada", 1000f},
                        {"Funpresp", 3500f}
                }, 4500f},
                {new Object[][]{
                        {"Matheus", "01/01/2012"},
                        {"Lucas", "01/01/2012"},
                        {"Renan", "01/01/2012"}
                }, 3*189.59f}
        };

        return Arrays.asList(respostas);
    }

    @Before
    public void setup() {
        simul = new CalculadoraTributaria();
    }

    @Test
    public void testCadastroRendimentosParametrizado() {
        ArrayList<Deducao> deducaosList = new ArrayList<Deducao>();
        for (Object[] o : deducoes) {
            if(o[1] instanceof String){
                deducaosList.add( new Deducao((String) o[0], (String) o[1] ));
            }
            else {
                deducaosList.add( new Deducao((String) o[0], (float) o[1] ));
            }
        }
        simul.cadastrarDeducoes(deducaosList);
        assertEquals(valorEsperado, simul.getValorDeducoes(), 0f);
    }
}