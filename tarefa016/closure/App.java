
public class App {
    public static void main(String[] args) {
        Somar obj = (n1, n2) -> n1 + n2;

        System.out.println("A soma de 3.5 + 4.9 = " + obj.somatorio(4.9, 3.5));
    }
}
