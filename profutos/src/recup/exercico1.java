package recup;

import java.util.ArrayList;
import java.util.Scanner;

public class exercico1 {
	public static void main(String[] args) {
		ArrayList<Integer> numeros = new ArrayList<>();
		Scanner ler = new Scanner(System.in);
		int numero = 1;
		
		while (numero != 0) {
			System.out.println("Digite um numero inteiro "+
		             "ou (0 para sair) :");
			numero = ler.nextInt();
			numeros.add(numero);
		}
		
		ArrayList<Integer> numerosPares = new ArrayList<>();
		for (int num : numeros) {
			if (num % 2 == 0) {
				numerosPares.add(num);
			}
			
		}
		System.out.println("Números pares:" + numerosPares);
		ler.close();
	}

}
