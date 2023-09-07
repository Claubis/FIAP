package aula_4;

// Criar meu processo de conta corrente;
// Lembrando que aqui eu não rodo/testo, preciso criar o teste;
public class Conta {
	
	// Atributos
	private String titular;
	private String agencia;
	private String conta;
	private float saldo;
	
	// Construtor
	public Conta(String titular, String agencia, String conta) {
		this.titular = titular;
		this.agencia = agencia;
		this.conta = conta;
		
	}
	
	// Criar os Getters and Setters
	
	public String getTitular() {
		return titular;
	}



	public void setTitular(String titular) {
		this.titular = titular;
	}



	public String getAgencia() {
		return agencia;
	}



	public void setAgencia(String agencia) {
		this.agencia = agencia;
	}



	public String getConta() {
		return conta;
	}



	public void setConta(String conta) {
		this.conta = conta;
	}
	
	// Preciso criar só o get de saldo, pois preciso buscar a informação no sistema e mostrar em tela.
	public float getSaldo() {
		return saldo;
	}

	

	// Método 1
	public float depositar(float valor) {
		this.saldo += valor; // mesma coisa que saldo = saldo + valor;
		return saldo;
	}
	
	//Método 2
	public float sacar(float valor) {
		this.saldo -= valor; // mesma coisa que fazer saldo = saldo - valor;
		return saldo;
			
		}
	
	
	// Exibir dados
		public void exibirDados() {
			System.out.println("Titular: " + getTitular());
			System.out.println("Agência: " + getAgencia());
			System.out.println("Conta: " + getConta());
			System.out.println("Saldo: " + getSaldo());
		}

}
