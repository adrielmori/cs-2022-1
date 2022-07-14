
package Exercicio01;

public class AnimalTest {
    public static void main(String[] args) {
       
        Animal animal1 = new Cachorro("Pluto",3, "late", "corre");
        Animal animal2 = new Cavalo("Betoven",3, "relincha", "cavalga");
        Animal animal3 = new Preguica("Peao", 7, "grita", "escala parede");
            
        System.out.println("O som do cachorro: " + animal1.getSom());
        System.out.println("O som do cavalo: " + animal2.getSom());
        System.out.println("O som da preguica: " + animal3.getSom());
        
        Veterinario veterinario = new Veterinario();

        veterinario.examinar(animal1);
        veterinario.examinar(animal2);
        veterinario.examinar(animal3);

        Animal animal4 = new Cachorro("Leao", 8, "late", "corre");
        Animal animal5 = new Cavalo("Ponei", 45. "relincha", "cavalga");
        Animal animal6 = new Preguica("Lerdo", 100, "grita", "escala parede");
        Animal animal7 = new Cachorro("Valente", 12, "late", "corre");
        Animal animal8 = new Cavalo("Alazão", 2, "relincha", "cavalga");
        Animal animal9 = new Preguica("Sonolento", 23, "grita", "escala parede");
        Animal animal10 = new Cachorro("Pretão", 34, "late", "corre");
        
        Zoologico zoo = new Zoologico();

        zoo.getJaula().add(animal1);
        zoo.getJaula().add(animal2);
        zoo.getJaula().add(animal3);
        zoo.getJaula().add(animal4);
        zoo.getJaula().add(animal5);
        zoo.getJaula().add(animal6);
        zoo.getJaula().add(animal7);
        zoo.getJaula().add(animal8);
        zoo.getJaula().add(animal9);
        zoo.getJaula().add(animal10);
        

        for (Animal a:zoo.getJaula()){
            System.out.println(a.getSom());
        }

    }
}