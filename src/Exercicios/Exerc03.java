package Exercicios;

public class Exerc03 {
	
	static float funcaoMediaPonderada(float notas[], float pesos[]) {
		
		float multiplicacao = 0;
		float somaMultiplicacao = 0;
		float somaPesos = 0;
		
		for(int i=0; i<notas.length; i++) {
			multiplicacao = notas[i]*pesos[i];
			somaPesos = somaPesos + pesos[i];
			
			somaMultiplicacao = somaMultiplicacao + multiplicacao;	
		}
				
		return somaMultiplicacao/somaPesos;
	}

	public static void main(String[] args) {
		float arrayNota[] = {7, 7};
		float arrayPeso[] = {1, 3};
		
		float mediaPonderada = funcaoMediaPonderada(arrayNota, arrayPeso);
		
		System.out.println("Média ponderada das notas: " + mediaPonderada);
	}

}
