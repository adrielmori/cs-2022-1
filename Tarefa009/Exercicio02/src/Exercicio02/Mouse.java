package Exercicio02;

public class Mouse extends Produto {

    private String tipo;

	public Mouse(String nomeLoja, int preco, String descricao, String tipo) {
		super(nomeLoja, preco, descricao);
		this.tipo = tipo;
	}

	@Override
	public String getDescricao() {
		return super.getDescricao() +"Mouse [tipo=" + tipo + "]";
	}

	@Override
	public String toString() {
		return super.toString()+"Mouse [tipo=" + tipo + "]";
	}
    
	
}
