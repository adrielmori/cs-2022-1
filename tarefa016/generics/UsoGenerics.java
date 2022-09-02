import animais.*;
import java.util.ArrayList;
import java.util.List;

public class UsoGenerics {
    public void visualization(List<? extends Animal> animal){
        for(Animal list: animal){
            System.out.println(list.toString());
        }
    }

    public static void main(String[] args) {
        List<Animal> animal = new ArrayList<>();
        List<Arara> arara = new ArrayList<>();
        List<Baleia> baleia = new ArrayList<>();
        List<Cavalo> cavalo = new ArrayList<>();

        UsoGenerics genericos = new UsoGenerics();
        
        for(int i=0;i<3;i++){
            baleia.add(new Baleia());
            cavalo.add(new Cavalo());
            arara.add(new Arara());
            animal.add(new Animal());
        }

        genericos.visualization(animal);
        genericos.visualization(cavalo);
        genericos.visualization(baleia);
        genericos.visualization(arara);
        
    }
    
}
