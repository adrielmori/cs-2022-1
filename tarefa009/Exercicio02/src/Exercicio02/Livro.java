package Exercicio02;

public class Livro extends Produto{

    private String autor;

	public Livro(String nomeLoja, int preco, String descricao, String autor) {
		super(nomeLoja, preco, descricao);
		this.autor = autor;
	}
    
	 public String getDescricao() {
	        
	        super.getDescricao();
	        return "Descrição: "+this.getDescricao()+" Autor: "+this.autor;
	    }

	@Override
	public String toString() {
		return super.toString() + "Livro [autor=" + autor + "]";
	}
}
