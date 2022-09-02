package questao04;

public class Main {
    public static void main(String[] args) {
        
        ContaBancaria conta = new ContaBancaria();
        
        conta.depositar(1000);

        System.out.println(conta.sacar(2000));
    }
    
}
