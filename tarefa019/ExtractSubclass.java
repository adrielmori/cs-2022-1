//Não refatorado
class Pessoa {
    private string nome;
    private string modeloVeiculo;
}

//refatorado

class PessoaRefatorada{
    private string nome;

}

class Piloto extends PessoaRefatorada{
    private string modeloVeiculo;
}