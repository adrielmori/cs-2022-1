package questao04;

public class SaldoInsuficienteException extends Exception {
    
    public SaldoInsuficienteException(){
        super("Saldo em conté insuficiente.");
    }
    
}
