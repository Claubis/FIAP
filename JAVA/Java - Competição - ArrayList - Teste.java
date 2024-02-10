package ProvaTresJava;

public class TesteCompeticao {
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

