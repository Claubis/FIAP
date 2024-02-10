package ProvaTresJava;

import java.util.Scanner;

public class Carros {
	// Primeiro vou coletar o modelo de cinco carros ok
	//Segundo: O consumo de cada carro em uma lista - Km rodado e quantos litros por km ok
	// Terceiro: Qual o carro mais economico?
	// Quarto: Quantos litros o carro consome se andar 1000km
	// Quinto: Quanto custará? Valor de 6,89 por litro, depois disso vou chegar no calculo final do consumo total
	
	// Atributos
	private String modelo;
	

	// Vou criar uma lista com o modelo dos carros para que o usuário cadastre
	public String[] modeloCarro() {
		Scanner input = new Scanner(System.in);
		
		String[] nomeCarro = new String[5];
		
		// Agora fazer um for para iterar a cada lançamento com o nome do atleta
		
		for (int i = 0; i < 5; i++) {
		// Pedir para o usuário digitar os nomes
			System.out.println("Digite o " + (i+1) + "º " + "modelo do carro: ");
		    nomeCarro[i] = input.nextLine();
		            
		System.out.println("*************************************** \n");
		
		
		}
		return nomeCarro;
	
	}
	
	public void imprimirDados(String[] modelos, float[] litrosQuilometro, float[] consumoTotal ) {
		System.out.println("Modelos de carros cadastrados:");
		
		for(int i = 0; i < modelos.length; i++ ) {
			System.out.println((i + 1) + "." + " " + "O modelo: " + modelos[i] + " faz " + litrosQuilometro[i] + " litros por km rodado" + " e consumo no final é de \n" + consumoTotal[i]);
		}
	}
	
	public float[] litrosQuilometro(String[] modelos) {
		Scanner input = new Scanner(System.in);
				
		float[] litrosQuilometro = new float[modelos.length];
		
		for (int i = 0; i < modelos.length; i++) {
            System.out.printf("Digite quantos litros por km o " + modelos[i] + " faz: \n");
            litrosQuilometro[i] = input.nextFloat();
		}
		
		
		return litrosQuilometro;
	}
	
	// Aqui vou fazer o calculo dos kms rodados com o valor de 6,89. Sabendo que eles
	// vão rodar 1000 no total
	public float[] consumoTotal(String[] modelos, float[] litrosQuilometro ) {
		float[] consumoTotal = new float[modelos.length];
        float precoLitro = 6.89f ;
		
        
        for (int i = 0; i < modelos.length; i++) {
            consumoTotal[i] = (1000 / litrosQuilometro[i]) * precoLitro;
        }
        
		return consumoTotal;
		
	}
	
	public int carroEconomico(String[] modelos, float[] consumoTotal) {
		float carroMaisEconomico = consumoTotal[0];
		
		int contador = 0;
		
		for (int i = 1; i < consumoTotal.length; i++) {
	        if (consumoTotal[i] < carroMaisEconomico) {
	        	carroMaisEconomico = consumoTotal[i];
	            contador = i;
	            
	        }  
	    } return contador;
}
	
	

	public static void main(String[] args) {
		Carros modelo1 = new Carros();
		
		String[] modelos = modelo1.modeloCarro();
		float[] litrosQuilometro = modelo1.litrosQuilometro(modelos);
		float[] consumoTotal = modelo1.consumoTotal(modelos, litrosQuilometro);
		int contador = modelo1.carroEconomico(modelos, consumoTotal);
		
		modelo1.imprimirDados(modelos, litrosQuilometro, consumoTotal);
		
		modelo1.consumoTotal(modelos, litrosQuilometro);
		
		System.out.println("\nO carro mais econômico é o modelo " + modelos[contador] + " pois o valor final dele é " + consumoTotal[contador]);
		
		


	}

}

