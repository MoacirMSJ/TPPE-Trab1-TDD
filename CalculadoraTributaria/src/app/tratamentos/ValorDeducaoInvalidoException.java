package app.tratamentos;

public class ValorDeducaoInvalidoException extends RuntimeException {
    public ValorDeducaoInvalidoException(String mensagem) {
        super(mensagem);
    }
}