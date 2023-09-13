package add;

//Importar o Scanner
import java.util.Scanner;

public class ProgramaPrincipal {
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
	
		Calculadora calc = new Calculadora();
		int op = calc.menu();
		System.out.println("Digite o primeiro número: ");
		double n1 = input.nextDouble();
		calc.setN1(n1);
		
		System.out.println("Digite o segundo número: ");
		double n2 = input.nextDouble();
		calc.setN1(n2);

		double result = calc.controlador(op, n1, n2);
		calc.imprimir(result);
		
		
	}
}
