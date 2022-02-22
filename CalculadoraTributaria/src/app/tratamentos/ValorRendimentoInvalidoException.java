package app.tratamentos;

public class ValorRendimentoInvalidoException extends RuntimeException {
    public ValorRendimentoInvalidoException(String mensagem) {
        super(mensagem);
    }
}