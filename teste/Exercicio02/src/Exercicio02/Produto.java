package Exercicio02;

public class Produto {
    private String nomeLoja;
    private int preco;
    private String descricao;
    
	public Produto(String nomeLoja, int preco, String descricao) {
		this.nomeLoja = nomeLoja;
		this.preco = preco;
		this.descricao = descricao;
	}

	public String getNomeLoja() {
		return nomeLoja;
	}



	public void setNomeLoja(String nomeLoja) {
		this.nomeLoja = nomeLoja;
	}



	public int getPreco() {
		return preco;
	}



	public void setPreco(int preco) {
		this.preco = preco;
	}



	String getDescricao() {
		return descricao;
	}



	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}


	@Override
	public String toString() {
		return "Produto [nomeLoja=" + nomeLoja + ", preco=" + preco + ", descricao=" + descricao + "]";
	} 
}
