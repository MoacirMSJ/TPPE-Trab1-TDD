package test;

import app.cadastroRendimentos.CadastroRendimentos;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class RendimentosTest {

    @Test()
    public void testeCadastroRendimentoComValor () {
        CadastroRendimentos rendimento = new CadastroRendimentos("Salario", 3500F);
        assertEquals(rendimento.getDescricao(), "Salario" );
        assertEquals(rendimento.getValor(), 3500 );
    }
}
