package Exercicios;

public class Exerc01 {

	static int funcaoSomatoriaArrays (int array[]) {
		
		int somaArrays = 0;
		
		for(int i=1; i<(array.length-1); i++) {
			somaArrays = somaArrays + array[i];
		}
		return somaArrays; 
	}
	
	public static void main(String[] args) {
		
		int array[] = {1, 1, 2, 3, 2, 0, 1, 1, 3};		
		
		int soma = funcaoSomatoriaArrays(array); 
		
		System.out.println("Soma dos elementos entre o primeiro e o último elemento: " + soma );		
	}
}
