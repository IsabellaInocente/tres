package recup;

public class ObjetoPessoa {
	public static void main(String[] args) {
		Pessoa pessoa1 = new Pessoa();
		
		pessoa1.setNome("Max");
		pessoa1.setIdade(25);
		pessoa1.setEndereco("Hasselt, Bélgica");
		pessoa1.setProfissao("piloto de f1");
		
		System.out.println("objeto 1");
		System.out.println(pessoa1.getNome());
		System.out.println(pessoa1.getIdade());
		System.out.println(pessoa1.getEndereco());
		System.out.println(pessoa1.getProfissao());
	}

}
