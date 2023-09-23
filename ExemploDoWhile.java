package comandoWhile;

import java.util.Scanner;

// Uso do do com while para fazer uma calculadora
public class ExemploDoWhile {
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		int op;
		
		do {
		
		System.out.println("-----( Calculadora simples )-----");
		System.out.println("Escolha uma das opções abaixo: ");
		System.out.println("1 - Adicionar");
		System.out.println("2 - Subtrair");
		System.out.println("3 - Dividir");
		System.out.println("4 - Multiplicar");
		System.out.println("Operação: ");
		op = input.nextInt();
		
		if(op < 1 || op > 4) {
			System.out.println("Operação inválida! " + "Sua opção foi: " + op);
		
		}
		
		}while(op < 1 || op > 4);
	} 

}

