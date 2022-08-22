// classe não refatorada

class Pessoa{
    private string nome;
    private string modeloCarro;
    private string corCarro;

    //... contextualmente os getters e setters são implementados mas pulei essa parte para focar a implementação necessária

}

// classe refatorada


class PessoaRefatorada {
    private string nome;
    private Carro carro;
}

class Carro {
    private string modelo;
    private string cor;
}

