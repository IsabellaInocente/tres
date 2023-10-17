package Temaclass;

import java.io.ObjectInputStream.GetField;

public class Objetotres {
	public static void main(String[] args) {
		
		Produto prod = new Produto(4,"garrafa",10);
		Sorvete sorvete = new Sorvete(1,"menta",1.50,5.0);
		Camisa camisa = new Camisa(10.50,"preta","algodao","m");
		
		System.out.println(prod.getId());
		System.out.println(prod.getNome());
		System.out.println(prod.getPreco());
		
		
		System.out.println(sorvete.getNome());
		System.out.println(sorvete.getPreco());
		System.out.println(sorvete.getTempAdequ());
		
		System.out.println(camisa.getCor());
		System.out.println(camisa.getNome());
		System.out.println(camisa.getTamanho());
		System.out.println(camisa.getTecido());
		
	}

}
