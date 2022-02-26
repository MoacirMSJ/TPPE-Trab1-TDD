package test;

import app.calculadora.Aliquota;
import org.junit.Test;
import static org.junit.Assert.*;

public class AliquotaTest {
    /*CALCULO ALIQUOTA*/
    /*falsificacao*/
	@Test
    public void testAliquota(){
    	Aliquota aliq = new Aliquota(69.20f);
    	assertEquals(aliq.getValorEfetivo(), 69.20f ,0f);
    }

    /*duplicacao*/
    @Test
    public void testDuplicaoAliquota(){
    	Aliquota aliq = new Aliquota(69.20f);
    	assertEquals(aliq.getValorEfetivo(), 69.20f ,0f);
    	
    	Aliquota aliq2 = new Aliquota(138.66f);
    	assertEquals(aliq2.getValorEfetivo(), 138.66f ,0f);
    	
    }  
}