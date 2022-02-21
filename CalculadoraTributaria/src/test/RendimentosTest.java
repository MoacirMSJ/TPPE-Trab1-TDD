package test;

import app.cadastroRendimentos.CadastroRendimentos;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class RendimentosTest {

    @Test()
    public void testeCadastroRendimento () {
        CadastroRendimentos rendimento = new CadastroRendimentos("Salario");
        assertEquals(rendimento.getDescricao(), "Salario" );
    }
}
