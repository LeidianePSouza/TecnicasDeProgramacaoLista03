package Exercicios;

public class Exerc02 {

	static int funcaoMediaArray(int array1[], int array2[]) {
		
		int somaArray1 = 0;
		int somaArray2 = 0;
		
		int totalElementosArray1=0;
		for(int i=0; i<array1.length; i++) {
			somaArray1 = somaArray1 + array1[i];
			totalElementosArray1 = i+1;
		}
		
		int totalElementosArray2=0;
		for(int i=0; i<array2.length; i++) {
			somaArray2 = somaArray2 + array2[i];
			totalElementosArray2 = i+1;
		}
		
		int totalElementos = totalElementosArray1 + totalElementosArray2;
		
		return (somaArray1+somaArray2)/totalElementos;
	}
	
	
	public static void main(String[] args) {

		int array1[] = {21, 2};
		int array2[] = {9, 4};
		
		int mediaVetor = funcaoMediaArray(array1, array2);
		
		System.out.println("Média dos valores dos dois vetores: " + mediaVetor);
	}

}
