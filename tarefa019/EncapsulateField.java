// Classe não refatorada
class Pessoa{
    public string nome;
    public string cpf;
}

//classe refatorada
class PessoaRefatorada {
    private string nome;
    private string cpf;
    
    public string getNome() {
        return nome;
    }
    public void setNome(string nome) {
        this.nome = nome;
    }
    public string getCpf() {
        return cpf;
    }
    public void setCpf(string cpf) {
        this.cpf = cpf;
    }
}