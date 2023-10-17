package Heranca;

public class Pessoa {
	private String nome;
	private String telefone;
	
	public Pessoa(String nome, String telefone) {
	this.nome = nome;
	this.telefone = telefone;

}
public String getNome() {
	return nome;
}
public void setnome(String nome) {
	this.nome = nome;
}
public String gettelefone() {
	return telefone;
}
public void settelefone(String telefone) {
	this.telefone = telefone;
}
}

