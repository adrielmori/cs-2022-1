package logging;
import java.io.IOException;
import java.util.Scanner;

import org.apache.log4j.Logger;
import org.apache.log4j.LogManager;

public class App {
    final static Logger logger = LogManager.getLogger(App.class.getName());
    
    public static void main( String[] args )
    {
        
        logger.trace("Iniciando logg");
        Scanner ler = new Scanner(System.in);
        try{
            System.out.print("Informe um numero: ");
            int num = ler.nextInt();
            App app = new App();
            
        }catch(Exception ex){
            logger.error("Error: "+ex);
        }
    }

    public static void contagem(int num){
        for(int i=num;i>=0;i--){
            System.out.println(i);
        }
    }

    public static void dividir(int num){
        int i= 13 / num;
    }

    
}


