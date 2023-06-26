package Exercicios;

import java.util.Scanner;

public class Exerc16 {

	static void numeroPrimo(int numero) {
		int i=1;
		int cont=1;
		
		while(i<=(numero/2)) {
			if(numero%i==0) {
				cont++;
			}
		i++;	
		}
		
		if(cont==2) {
			System.out.println(true);
		} 
		else {
			System.out.println(false);
		}
	}
	
	public static void main(String[] args) {
		Scanner valorDigitado = new Scanner(System.in);
		
		System.out.println("Digite o número: ");
		int numero = valorDigitado.nextInt();
		valorDigitado.close();

		numeroPrimo(numero);
	}

}
