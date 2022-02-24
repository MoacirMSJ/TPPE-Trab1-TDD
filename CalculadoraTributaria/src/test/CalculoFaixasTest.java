package test;

import app.calculadora.Faixa;
import org.junit.Test;
import static org.junit.Assert.*;

public class CalculoFaixasTest {
    /*CALCULOS DAS FAIXAS*/
    /*falsificao*/
    @Test
    public void testFaixas(){
    	Faixa faixa = new Faixa("Faixa UM", 10000f, 1903.98f, 8620.82f);
    	assertEquals(faixa.getNomeFaixa(),faixa.getValorRendimento(),faixa.getValorDeducao(),faixa.getValorFaixa());
    }
    
    /*duplicacao
    @Test
    public void testDuplicaoFaixas(){
    	
    }
    
    triangulacao parametrizado
    @Parameters
    public static Collection<Object[]> get Parameters(){

    }
    */
 
}