package Exercicios;

public class Exerc04 {

	static int contagemElementos(int array1[]) {
		
		int i;
		int cont = 0;
		int aux = 0;
		
		for(i=0; i<=array1.length; i++) {
			 aux = array1[i];
			if(aux==array1[i]) {
				cont++;
			}	
		}
				
		return cont;
	}
	
	
	public static void main(String[] args) {
	
		int array1[] = {2, 5, 6, 2, 2};
		//int array2[] = {4, 5, 3, 5};
		
		int cont = contagemElementos(array1);
		
		//System.out.println("Elemento que se repete: " + contagem);
		System.out.println("O número se repete " + cont + " vezes.");

	}

}
