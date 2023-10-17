package Temaclass;

public class Camisa extends Produto {
	String cor;
	String tecido;
	char tamanho;
	public String getCor() {
		return cor;
	}
	public void setCor(String cor) {
		this.cor = cor;
	}
	public String getTecido() {
		return tecido;
	}
	public void setTecido(String tecido) {
		this.tecido = tecido;
	}
	public char getTamanho() {
		return tamanho;
	}
	public void setTamanho(char tamanho) {
		this.tamanho = tamanho;
	}
	public Camisa(long id, String nome, double preco, String cor, String tecido, char tamanho) {
		super(id, nome, preco);
		this.cor = cor;
		this.tecido = tecido;
		this.tamanho = tamanho;
	}

}
