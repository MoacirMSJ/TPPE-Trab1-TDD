package test;

import app.calculadora.Aliquiota;
import org.junit.Test;
import static org.junit.Assert.*;

public class AliquiotaTest {
    /*CALCULO ALIQUIOTA*/
    /*falsificacao*/
	@Test
    public void testAliquiota(){
    	Aliquiota aliq = new Aliquiota(69.20f);
    	assertEquals(aliq.getValorEfetivo(), 69.20f ,0f);
    }

    /*duplicacao*/
    @Test
    public void testDuplicaoAliquiota(){
    	Aliquiota aliq = new Aliquiota(69.20f);
    	assertEquals(aliq.getValorEfetivo(), 69.20f ,0f);
    	
    	Aliquiota aliq2 = new Aliquiota(138.66f);
    	assertEquals(aliq2.getValorEfetivo(), 138.66f ,0f);
    	
    }
    
    /*triangulacao parametrizado
    @Parameters
    public static Collection<Object[]> get Parameters(){

    }*/
    
}