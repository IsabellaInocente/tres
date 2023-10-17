package Temaclass;

public class Tema {

	private int id;
	private String nome;
	private double valorAluguel;
	private String cor;
	
	public Tema() {
		id = 1;
		nome = "nome";
		valorAluguel = 12.0;
		cor = "branca";
	}
	public Tema( int id, String nome, double valorAluguel, String cor) {
		this.nome = nome;
		this.cor = cor;
		this.valorAluguel = valorAluguel;
		this.id = id;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public double getValorAluguel() {
		return valorAluguel;
	}
	public void setValorAluguel(double valorAluguel) {
		this.valorAluguel = valorAluguel;
	}
	public String getCor() {
		return cor;
	}
	public void setCor(String cor) {
		this.cor = cor;
	}
	
}
