// não refatorado

class Estagiario {
    private string nome;
    private string curso;
}

class Senior {
    private string nome;
    private string cargo;
    private double salario;
}

//refatorado
class Empregado {
    private string nome;
}

class Estagiario extends Empregado {

    private string curso;
}

class Senior extends Empregado {
    
    private string cargo;
    private double salario;
}
