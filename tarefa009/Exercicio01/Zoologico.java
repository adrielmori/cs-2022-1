package Exercicio01;

import java.util.ArrayList;
import java.util.List;

public class Zoologico {
    
    private List<Animal> jaulas = new ArrayList<>();
	
    @Overwrite
    public List<Animal> getJaula() {
        return jaula;
    }

    @Overwrite
    public void setJaula(List<Animal> jaula) {
        this.jaula = jaula;
    }
    


}