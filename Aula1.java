package AulaArray;

import java.util.Scanner;

public class Aula1 {
	public int tamanhoVetor() {
		System.out.println("----- Tamanho do vetor -----");
		Scanner input = new Scanner(System.in);
		System.out.println("Tamanho: ");
		int t = input.nextInt();
		return t;
	}
	
	public int[] criarVetor(int t) {
		Scanner input = new Scanner(System.in);
		
		// Instanciando o vetor
		int[] vetor = new int[t];
		for(int i=0; i<vetor.length; i++) {
			System.out.printf("Vetor [%d]: \n", i);
			vetor[i] = input.nextInt();
			
		}
		return vetor;
	}
	
	public boolean verificadorOcorrencias(int n, int[] v){
		boolean flag = false;
		for (int i = 0; i < v.length; i++) {
			if(n == v[i]) {
				flag = true;
				return flag;
			}
			
		} 
		return flag;
	}

	
	public int obterNumero() {
		Scanner input = new Scanner(System.in);
		System.out.println("Número: ");
		int n = input.nextInt();
		return n;
	}
	
	public void quantidadeOcorrencia(int n, int[] v) {
		int contador = 0;
		for(int i=0; i < v.length; i++) {
			if(n == v[i]) {
				contador++;
			}
		}
		return contador;
	}
	
	public void imprimir(int[] v) {
		System.out.println("--- Imprimindo os elementos do vetor");
		for(int i=0; i<v.length; i++) {
			System.out.printf("vetor [%d]: %d \n", i,v[1]);
		}
	}


	public static void main(String[] args) {
		Aula1 a1 = new Aula1();
		int t = a1.tamanhoVetor();
		int[] v = a1.criarVetor(t);
		a1.imprimir(v);
		int n = a1.obterNumero();
		a1.verificadorOcorrencias(t, v);
		System.out.println("Está contido? " + a1.verificadorOcorrencias(t, v));
		System.out.println("Qtde: " + a1.quantidadeOcorrencia(n, v));
		
	}
}
