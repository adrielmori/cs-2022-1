package Exercicio02;

import java.util.ArrayList;
import java.util.List;

public class ProdutoTeste {
    public static void main(String[] args) {

    	List<Produto> compra = new ArrayList<>();    
    	
        Produto produto1 = new Livro("Super Zé", 200, "Padaria", "Pão francês");
        Produto produto2 = new Mouse("Carrefur", 20, "Lanchonete", "Quitandas variadas");
            
        compra.add(produto1);
        compra.add(produto2);
        
        for (Produto auxCompra: compra){
            System.out.println(auxCompra.toString());
        }
    }
}

