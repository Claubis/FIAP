// Criar uma calculadora simples

package aula1;

import java.util.Scanner;

public class calcularMedia {
	// Estrutura básica para iniciar o projeto
	public static void main(String[] args) {
		
		//Declaração de variaveis. Um dos modelos para eu referência o tipo da variavel.
		float n1, n2, n3, media;
		
		//atribuição
		n1 = 8.5f; //quando coloco o f, eu forço a declaração de float
		n2 = 6.5f;
		n3 = 9.8f;
		//Tudo isso acima será considerado entrada de dados
		
		media = (n1 + n2 + n3)/3; //Aqui é o processamento dos dados
		
		// Modelo para gerar saída de dados, posso usar somente o print ou println para seguir para outra linha.
		System.out.println("Média: " + media); //Saída dos dados
		
		//Criar operação que solicite dados
		Scanner input = new Scanner(System.in);
		float n4, n5, media2;
		
		System.out.println("Digite n4: ");
		// Solicitar dados pelo usuaário
		n4 = input.nextFloat();
		System.out.println(n4);
		System.out.println("Digite n5: ");
		n5 = input.nextFloat();
		System.out.println(n5);
		
		media2 = (n4 + n5)/2;
		
		System.out.println("Resultado final é: " + media2);
		
		//Solicitar dados como String > sempre em letras maiuscula;
		String nome = input.nextLine();
		System.out.println("Digite um nome: ");
		System.out.println(nome);
		
		String sobrenome = input.nextLine();
		System.out.println("Digite um sobrenome: ");
		System.out.println(sobrenome);
		
		System.out.println("Se nome: " + nome + "Seu sobrenome: " + sobrenome);
		
		input.close();
		
	}
}
