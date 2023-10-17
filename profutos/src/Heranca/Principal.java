package Heranca;

public class Principal {
	public static void main(String[] args) {
		
		Pessoa pessoa = new Pessoa("João", "11 9988-0990");
		System.out.println("Pessoa:");
		System.out.println("nome:" + pessoa.getNome());
		System.out.println("telefone:" + pessoa.gettelefone());
		
		PessoaFisica pessoaFisica = new PessoaFisica("João", "11 9988-0990", "009.816.543-21", "400.368-x");
		System.out.println("\nPessoa fisica:");
		System.out.println("nomw:" +pessoaFisica.getNome());
		System.out.println("telefone:"+ pessoaFisica.gettelefone());
		System.out.println("cpf:"+ pessoaFisica.getcpf());
		System.out.println("rg:" + pessoaFisica.getrg());
		
		PessoaJuridica pessoaJuridica = new PessoaJuridica("João", "11 9988-0990", "009.816.543-21", "400.368-x", "14.550/0222-40");
		System.out.println("\nPessoa juridica:");
		System.out.println("nomw:" +pessoaJuridica.getNome());
		System.out.println("telefone:"+ pessoaJuridica.gettelefone());
		System.out.println("cnpj:" + pessoaJuridica.getCnpj());
	}

}
