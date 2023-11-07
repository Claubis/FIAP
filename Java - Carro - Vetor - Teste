package ProvaTresJava;

public class TesteCarro {
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

