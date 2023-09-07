package aula_4;

public class TesteConta {
	public static void main(String[] args) {
		
		// Abrir a conta
		Conta cliente1 = new Conta("Claudio", "1090-5", "1010-10");
		cliente1.exibirDados();
		
		//Realizar o depósito na conta
		cliente1.depositar(500);
		
		// Verificar se o saldo foi alterado
		System.out.println("saldo: " + cliente1.getSaldo());
		
		// Realizar um saque e consultar o saldo
		cliente1.sacar(400);
		System.out.println("Saque: " + cliente1.getSaldo());
	}
}
