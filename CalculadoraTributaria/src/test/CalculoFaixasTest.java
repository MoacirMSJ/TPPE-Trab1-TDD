package test;

import app.calculadora.Faixa;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Before;

public class CalculoFaixasTest {
    /*CALCULOS DAS FAIXAS*/
	Faixa faixa;
	
	@Before
	public void setup () {
		faixa = new Faixa();
	}
	
    //falsificao
    @Test
    public void testFaixas(){
    	Faixa faixa = new Faixa("Faixa UM", 10000f, 1903.98f, 8620.82f);
    	assertEquals(faixa.getNomeFaixa(),faixa.getValorRendimento(),faixa.getValorDeducao(),faixa.getValorFaixa());
    }
    
    //duplicacao
    @Test
    public void testDuplicaoFaixas(){
    	Faixa faixa = new Faixa("Faixa UM", 10000f, 1903.98f, 8620.82f);
    	assertEquals(faixa.getValorDeducao(), 1903.98f, 0f);
    	
    	Faixa faixa2 = new Faixa("Faixa DOIS", 10000f, 922.67f, 8620.82f);
    	assertEquals(faixa2.getValorDeducao(), 922.67f, 0f);
    }
    
    /*triangulacao parametrizado
    @Parameters
    public static Collection<Object[]> get Parameters(){

    }
    */
 
}