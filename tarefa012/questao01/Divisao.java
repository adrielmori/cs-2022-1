package questao01;

import java.util.InputMismatchException;
import java.util.Scanner;


public class Divisao {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        double x, y;
           
        try{
            System.out.println("Informe o dividendo: ");
            x = input.nextDouble();
            System.out.println("Informe o divisor: ");
            y = input.nextDouble();
            
            if(y==0){
                input.close();
                throw new ArithmeticException("Divisão por 0");
            }
            else {
                System.out.println(x/y);
            }          

        }
        catch(InputMismatchException error){
            System.out.println("Erro: "+ error);
        }  
        input.close();
        
    }
}
