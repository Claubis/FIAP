package aulaOito_lacoRepeticao;

import java.util.Scanner;

//Escreva um programa em java que leia 5 números e calcule e mostre a soma de todos os números lidos
public class Exemplo2 {
	public static void main(String[] args ) {
		
		Scanner input = new Scanner(System.in);
		int x, soma = 0, somaA = 0, somaB = 0;
		
		for(int i = 1; i <= 5; i++) {
			System.out.println("Número ");
			
			x = input.nextInt();
			
			// Preciso saber se o x é par
			if(x%2 ==0) {
				somaA += x;
			}else {
				somaB+=x;
			}
			soma = soma + x;
		}
		
		System.out.println("Soma: " + soma );
		System.out.println("Soma Pares: " + somaA );
		System.out.println("Soma Impares: " + somaB );
	}
}
		
		
		
		

