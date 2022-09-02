package questao03;

public class Main {
    public static void main(String[] args) {
        Login login = new Login();
        login.setUsuario("AdrielMori");
        login.setSenha("12345");

        System.out.println(login.fazerLogin("Adriel", "123"));
    }
    
}
