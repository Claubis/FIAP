package ProvaTresJava;

//RM 553472 - Claudio Bispo
//RM 553093 - Caua Loureiro

import java.util.Scanner;

public class Competicao {
	// Primeiro: Preciso criar um modelo de cadastrar os atletas
	// Se não for digitado dados, precisa parar a execução.
	// Segundo: Preciso coletar cinco saltos que eles deram
	// Terceiro: Fazer o calculo da média de cada atleta.
	// Como vou usar Matriz, preciso criar ela, inserir dados nela e imprimir os dados.

	public String[] nomeAtleta(int qtdeAtletas) {
        Scanner input = new Scanner(System.in);
        String[] nomeAtleta = new String[qtdeAtletas];

        for (int i = 0; i < qtdeAtletas; i++) {
            System.out.println("Digite o nome do Atleta " + (i + 1) + ": ");
            nomeAtleta[i] = input.nextLine();
            
            // Condição se não tiver dados
            if(nomeAtleta[i].isEmpty()) {
            	System.out.println("Programa encerrado por falta de dados do atleta.");
            	System.exit(0);
            	break;
            	
            }
            nomeAtleta[i] = nomeAtleta[i];
            System.out.println("*************************************** \n");
        }

        return nomeAtleta;
}

    public float[][] saltosDistancia(int qtdeAtletas, int qtdeSaltos) {
        Scanner input = new Scanner(System.in);
        float[][] distancia = new float[qtdeAtletas][qtdeSaltos];

        for (int x = 0; x < qtdeAtletas; x++) {
        	System.out.println("Atleta: " + (x + 1));
        	
        	for (int y = 0; y < qtdeSaltos; y++) {
            System.out.printf("Digite a distância do " + (y + 1) + "° salto:\n");
            distancia[x][y] = input.nextFloat();
        	}
  
        
        }	
        return distancia;
}

    public void imprimirDados(String[] nomes, float[][] distancia, float[] media) {
        System.out.println("Dados computados até o momento:");

        for (int x = 0; x < nomes.length; x++) {
            System.out.println("Atleta: " + nomes[x]);
            for (int y = 0; y < distancia.length; y++) {
                System.out.println("Salto " + (y + 1) + ": " + distancia[x][y] + " metros");
            }
            System.out.println("Média: " + media[x] + " metros\n");
        }
        
}

    public float[] calcularMedia(float[][] distancia) {
        float[] media = new float[distancia.length];

        for (int x = 0; x < distancia.length; x++) {
            float somatorio = 0;
            for (int j = 0; j < distancia[x].length; j++) {
                somatorio += distancia[x][j];
            }
          media[x] = somatorio / distancia[x].length;
        }
		return media;
}

    public static void main(String[] args) {
    	Competicao competicao = new Competicao();

        int qtdeAtletas = 5; // Defina o número de atletas aqui
        int qtdeSaltos = 5;  // Defina o número de saltos aqui

        String[] nomes = competicao.nomeAtleta(qtdeAtletas);
        float[][] saltos = competicao.saltosDistancia(qtdeAtletas, qtdeSaltos);
        float[] media = competicao.calcularMedia(saltos);

        competicao.imprimirDados(nomes, saltos, media);
    }
}
