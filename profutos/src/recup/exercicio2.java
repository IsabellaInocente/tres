package recup;

import java.util.ArrayList;
import java.util.Scanner;

public class exercicio2 {
	public static void main(String[] args) {
		ArrayList<Integer> numeros = new ArrayList<>();
		Scanner ler = new Scanner(System.in);
		int num,tam;
		
		System.out.println("informe o tamanho da lista:");
		tam = ler.nextInt();
		
		for(int i=0; i<tam;) {
			num = ler.nextInt();
		}
		for(int n : numeros) {
		
			if (n == 0) {
				
				System.out.println("Positivos: "+n);
			}
			else {
				System.out.println("Negativos: " +n);
			}
		}
	
		ler.close();
	}
}