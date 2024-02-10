package cp01;

import java.util.Scanner;

public class TesteConta {
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		Conta c1 = new Conta("Claudio", "123456");
		System.out.println("Cliente: " + c1.getNome());
		System.out.println("Conta: " + c1.getConta());
		System.out.println("Saldo: " + c1.getSaldo());
		
		c1.depositar();
		System.out.println("Saldo atual: " + c1.getDeposito());
		
		c1.sacar();
		System.out.println("Saldo atual: " + c1.getSaque());
		
		c1.transferir();
		System.out.println("Saldo atual: " + c1.getTransferir());
	}
	

}
