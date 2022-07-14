package questao02;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Vetor {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        int[] vetor = new int[10];
        int i=0;
        try{

        while(true){

            vetor[i] = input.nextInt();
            i++;

            if(vetor[i-1]==0){
                input.close();
                break;
            }
        }

        }catch(InputMismatchException error ){
            System.out.println(error);
        }
        catch(ArrayIndexOutOfBoundsException error){
            System.out.println(error);
        }
        input.close();
        
    }
    
}
