package secao14_tratamento_excecoes.exercicios.model.exceptions;


public class DomainException extends RuntimeException {
    private static final long serialVersionUID = 1L;

    public DomainException(String msg) {
        super(msg);
    }
}
