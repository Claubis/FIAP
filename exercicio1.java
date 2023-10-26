package cp2;
//rm 553472 - Claudio Bispo
// rm 554021 - Sara Ingrid

import java.util.Scanner;

public class exercicio1{

public int[] tamMatriz() {
Scanner input = new Scanner(System.in);
int[] v = new int[2];
System.out.print("Quantas semanas: ");
v[0] = input.nextInt();
System.out.print("Digite a quantidade de dias: ");

v[1] = input.nextInt();

return v;

}

public float[][] gerarMatriz(int[] v) {
Scanner input = new Scanner(System.in);

float[][] novaMatriz = new float[v[0]][v[1]];
for(int i=0; i<novaMatriz.length;i++) {

System.out.printf("--- A Semana é %d ---\n", i+1);

for(int x=0; x<novaMatriz[i].length; x++) {

System.out.printf("Informe a temperatura do dia [%d]: ", x+1);
novaMatriz[i][x] = input.nextFloat();

}

System.out.println();

}

return novaMatriz;

}


public void imprimirMatriz(float[][] novaMatriz) {

Scanner input = new Scanner(System.in);
System.out.println("Semana");

for(int i=0; i<novaMatriz.length;i++) {
System.out.println("--- Dia da Semana ---"+ i+1);

for(int x=0;x<novaMatriz[i].length; x++) {
System.out.printf("Dia [%d]: %.2f\n", x+1, novaMatriz[i][x]);

		}

	}

}


public void maiorMenorTemp(float[][] matriz) {

float maiorTemperatura = 0;

float menorTemperatura = 0;

for(int i=0; i<matriz.length; i++) {

for (int x=0; x<matriz[i].length; x++) {

if (i == 0 && x == 0) {

maiorTemperatura = matriz[i][x];

menorTemperatura = matriz[i][x];

} else {

if(matriz[i][x] > maiorTemperatura) {

maiorTemperatura = matriz[i][x];

}

	if(matriz[i][x] < menorTemperatura) {

		menorTemperatura = matriz[i][x];

			}

		}

	}

}

System.out.printf("Maior temperatura: %.2f\n", maiorTemperatura);

System.out.printf("Menor temperatura: %.2f\n", menorTemperatura);

}



public void mediaMatriz(float[][] matriz) {

float soma = 0;

int qtd = 0;

for(int i=0; i<matriz.length;i++) {

for(int j=0; j<matriz[i].length; j++) {

soma += matriz[i][j];

qtd++;

}

}

float result = soma / qtd;

System.out.printf("Média: %.2f / %d = %.2f\n", soma, qtd, result);

}

public static void main(String[] args) {

exercicio1 exemplo1 = new exercicio1();
int[] tam = exemplo1.tamMatriz();
float[][] matriz = exemplo1.gerarMatriz(tam);


exemplo1.maiorMenorTemp(matriz);

exemplo1.mediaMatriz(matriz);

exemplo1.tempNegativo(tam, matriz);

	}


}