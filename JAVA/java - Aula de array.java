package aula_array;
 
import java.util.Scanner;
 
public class Exemplo1 {
   
    public int tamanhoVetor() {
    System.out.println("---( tamanho do vetor )---");
    Scanner input = new Scanner(System.in);
    System.out.println("Tamanho: ");
    int t = input.nextInt();
    return t;
   
    }
   
    public int[] criarVetor(int t) {
       System.out.println("---( Criar o vetor )---");
       // Para criar o vetor, primeiro preciso indicar o tipo,[], nome do vetor (variavel)
       // = new tipo de novo[colocar o tamanho do vetor]
      
       int[] vetor = new int[t];
       Scanner input = new Scanner(System.in);
       // percorrendo o vetor e preenchendo-o
       for(int i=0; i<t; i++) {
           // usar printf quando for format (igual no python)
           // d=decimal(int), c=caracter, s=string
           System.out.printf("vetor[%d]: \n", i);
           // \n para pular linha
           vetor[i] = input.nextInt();
       }
       return vetor; // retornar o vetor preenchido
    }
    public void imprimirVetor(int[] vetor) {
       System.out.println(" ---( Imprimir vetor )---");
       for(int i=0; i<vetor.length; i++) {
           System.out.printf("vetor[%d]: %d \n", i, vetor[i]);
       }
    }
}
 
 
package aula_array;
 
public class TesteExemplo1 {
    public static void main(String[] args) {
      
       // Testando os métodos das classes Exemplo1 - array
       Exemplo1 e1 = new Exemplo1();
       int t = e1.tamanhoVetor();
       int[] vetor = e1.criarVetor(t);
       e1.imprimirVetor(vetor);
      
    }
}
