package test;

import app.calculadora.*;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import static org.junit.Assert.assertEquals;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

@RunWith(Parameterized.class)
public class AliquotaParametrizado {
	float aliquota;
	CalculadoraTributaria aliq;
	Object[][] deducoes;
	Object[][] rendimentos;
	
	public AliquotaParametrizado(Object[][] deducoes, Object[][] rendimentos) {
		this.deducoes = deducoes;
		this.rendimentos = rendimentos;
	}
	
    @Parameters
    public static Collection<Object[]> getParameters() {
        Object[][] resp = new Object[][]{
                {new Object[][]{
                        {"deducao", 480.20f},
                }, 480.20f},
                {new Object[][]{
                        {"Rendimento", 1000f},
                        {"Rendimento", 3500f}
                }, 4500f}
        };

        return Arrays.asList(resp);
    }
    @Before
    public void setup() {
        aliq = new CalculadoraTributaria();
    }

    @Test
    public void testAliquotaParametrizado() {
        assertEquals(aliquota, (aliq.getTotalRendimento() - aliq.getValorDeducoes()), 0f);
    }
	
	
}
