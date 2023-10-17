package Heranca;

public class PessoaFisica extends Pessoa {
	private String cpf;
	private String rg;
	
	public PessoaFisica(String nome, String telefone, String cpf, String rg) {
		super(nome, telefone);
		this.cpf = cpf;
		this.rg = rg;
	}
	public String getcpf() {
		return cpf;
	}
	public void setcpf(String cpf) {
		this.cpf = cpf;
	}
	public String getrg() {
		return rg;
	}
	public void setnome(String rg) {
		this.rg = rg;
	}



}
