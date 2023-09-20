package aulaOito_lacoRepeticao;

import java.util.Scanner;

public class LacoComFor {

	public static void main(String[] args ) {
		
		// Para eu solicitar dados para o usuário
		Scanner input = new Scanner(System.in);
		
		// Vou mostrar na tela o inicio do processo e pedir um valor
		System.out.println("Inicio: ");
		int inicio = input.nextInt();
		
		// Vou mostrar na tela o fim do processo e pedir um valor para termino do fluxo
		System.out.println("Fim: ");
		int fim = input.nextInt();
		
		// Criar o laço de repitação pedindo um input para o usuário
		for(int i = inicio; i < fim; i = i + 1 ) {
			
			// inserir um if para saber se o número e par e imprimir os números pares
			if(i%2 == 0){
				System.out.println("i: " + i);
				
			}
			//System.out.println("Fase: " + i);
			
		}
	}
	
}
