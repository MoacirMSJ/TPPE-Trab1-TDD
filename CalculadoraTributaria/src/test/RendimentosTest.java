package test;

import app.calculadora.Rendimentos;
import app.tratamentos.DescricaoEmBrancoException;
import app.tratamentos.ValorRendimentoInvalidoException;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class RendimentosTest {

    @Test
    public void testeCadastroRendimentoComValor() {
        Rendimentos rendimento = new Rendimentos("Salario", 3500f);
        assertEquals(rendimento.getDescricao(), "Salario");
        assertEquals(rendimento.getValor(), 3500f);
    }

    @Test
    public void testeCadastroRendimentoValorNegativo() {
        assertThrows(ValorRendimentoInvalidoException.class, () -> new Rendimentos("Salario", -10f), "Valor deve ser maior do que zero");
    }

    @Test
    public void testeCadastroRendimentoSemDescricao() {
        assertThrows(DescricaoEmBrancoException.class, () -> new Rendimentos("", 10f), "Descrição não informada");
    }

    @Test
    public void testeCadastroRendimentoValorZero() {
        assertThrows(ValorRendimentoInvalidoException.class, () -> new Rendimentos("Salario", 0f), "Valor deve ser maior do que zero");
    }

}
