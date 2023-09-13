package add;

// Importar o Scanner
import java.util.Scanner;

public class Calculadora {

	// Atributos
	private double n1;
	private double n2;
	//private double result; -- Já determinei ele lá em baixo
	
	
	// Definicação dos Sets
	public void setN1(double n1) {
		this.n1 = n1;
	}


	public void setN2(double n2) {
		this.n2 = n2;
	}

	
	// Criação do Menu - Vai ficar sem parametros
	public int menu() { 
		
		// Chamar o Scanner para eu utilizar
		Scanner input = new Scanner(System.in);
		
		// Declarar a operação
		int op;
		
		do {
		// Quando eu rodar o menu, vai aparecer essas opções
		System.out.println("**-- Calculadora Simples --**");
		System.out.println("1 - Adição");
		System.out.println("2 - Subtração");
		System.out.println("3 - Multiplicação");
		System.out.println("4 - Divisão");
		
		// Vou pedir a operação
		System.out.println("Escolha a operação: ");
		
		op = input.nextInt();
		
		if(op < 1 || op > 4) {
			System.out.println("Opção inválida!");
		}
		
		} while(op < 1 || op > 4);
		
		return op;
	}
		
	

	// Criar método Adicão
	public double somar(double n1, double n2) {
		System.out.println("Vai começar a somar!");
		return n1+n2;
	}
	
	// Criar método Subtração
	public double subtrair(double n1, double n2) {
		System.out.println("Vai começar a subtrair!");
		return n1-n2;
		}
		
	// Criar método multiplicação
	public double multiplicar(double n1, double n2) {
		System.out.println("Vai começar a multiplicar!");
		return n1*n2;
		}
	
	// Criar método divisão
	public double dividir(double n1, double n2) {
		System.out.println("Vai começar a dividir!");
		return n1/n2;
		}
	
	// Mostrar a operação acontecendo...
	public void imprimir(double result) {
		System.out.println("Imprimir resultado");
		System.out.println("Reultado: " + result);
	}
	
	
	// Criar um controlador para ajudar
	public double controlador(int op, double n1, double n2) {
		
		double retorno;
		
		switch(op) {
		case 1: 
			retorno = somar(n1, n2);
			break; // para encerrar se cair nesta opção
			
		case 2:
			retorno = subtrair(n1, n2);
			break;
			
		case 3:
			retorno = multiplicar(n1, n2);
			break;
			
		case 4:
			retorno = dividir(n1, n2);
			break;
			
		default:
			retorno = -1;
			
		}
		return retorno;
		
	}
}
