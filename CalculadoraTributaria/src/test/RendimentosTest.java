package test;

import app.cadastroRendimentos.CadastroRendimentos;
import app.tratamentos.ValorNaoInformadoException;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class RendimentosTest {



    @Test()
    public void testeCadastroRendimentoComValor () {
        CadastroRendimentos rendimento = new CadastroRendimentos("Salario", 3500f);
        assertEquals(rendimento.getDescricao(), "Salario" );
        assertEquals(rendimento.getValor(), 3500f );
    }
    @Test()
    public void testeCadastroRendimentoValorNegativo () {
        assertThrows(ValorNaoInformadoException.class, ()-> new CadastroRendimentos("Salario", -10f), "Valor deve ser maior do que zero");
    }
}
