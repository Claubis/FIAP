package cp01;

import java.util.Scanner;

public class Conta {
	Scanner input = new Scanner(System.in);
	float deposito;
	float saque;
	float transferir;
	
	// Atributos
	public String nome;
	public String conta;
	public float saldo;
	
	// Construtor parametrizado
	public Conta(String nome, String conta) {
		this.nome = nome;
		this.conta = conta;
		this.saldo = 0;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getConta() {
		return conta;
	}

	public void setConta(String conta) {
		this.conta = conta;
	}

	public float getSaldo() {
		return saldo;
	}

	public void setSaldo(float saldo) {
		this.saldo = saldo;
	}
	
	
	
	public float getDeposito() {
		return deposito;
	}

	public void setDeposito(float deposito) {
		this.deposito = deposito;
	}

	public float getSaque() {
		return saque;
	}

	public void setSaque(float saque) {
		this.saque = saque;
	}

	public float getTransferir() {
		return transferir;
	}

	public void setTransferir(float transferir) {
		this.transferir = transferir;
	}

	// Métodos que vou utilizar
	
	// Depositar
	public float depositar() {
		deposito = input.nextFloat();
		return saldo + deposito;
			
		}
	
	// Sacar
	public float sacar() {
		saque = input.nextFloat();
		if(this.saldo < 0) {
			System.out.println("Você não possui saldo!");
		}else (this.saldo > 0) {
			System.out.println("Seu saldo agora é: ");
		
	}

	// Transferir
	public float transferir() {
		transferir = input.nextFloat();
		return saldo - transferir;				
			}
	
	// Método para mostrar os dados da conta
	public void exibirDados(String nome, String conta, float saldo) {
		System.out.println("Cliente: " + getNome());
		System.out.println("Conta: " + getConta());
		System.out.println("Saldo: " + getSaldo());
		}
	}
	

