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
    	equals(69.20);
    }
    
    /*duplicacao
    @Test
    public void testDuplicaoAliquiota(){

    }
    
    triangulacao parametrizado
    @Parameters
    public static Collection<Object[]> get Parameters(){

    }
    */
    

}