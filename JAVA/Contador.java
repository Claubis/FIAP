package cp01;

public class Contador {
	
		// Atributo contador, aqui vou deixar armazenado os dados
		public int contar;
		
		// Construtor
		public void iniciarContador() {
			this.contar = 0;
		}
		
		
		// Getters e Setters
		public int getContar() {
			return contar;
		}



		public void setContar(int contar) {
			this.contar = contar;
		}



		// Método para zerar o contador
		public int zerarContador() {
			return this.contar = 0;
		}
		
		// Método para zerar o contador
		public int incrementarContador() {
			return this.contar += 1;
		}
		
		// Método para descrementar o contador
		public int diminuirContador() {
			return this.contar -= 1;
		}
		
		// Método para mostrar valor atual do contador
		public void exibirDados() {
			System.out.println("Status atual: " + getContar());
				}
	}

	

