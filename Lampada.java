package cp01;

public class Lampada {
	public boolean desligada;
	public boolean ligar;
	public boolean desligar;
	
	// Construtor
	public boolean desligada() {
		return this.desligada = true;
	}
	
	// Método para ligar a lampada
	public boolean ligar() {
		return this.ligar = true;
	}
			
	// Método para desligar a lampada
	public boolean desligar() {
		return this.desligar = true;
			
		}

	// Getters and Setters
	public boolean getDesligada() {
		return desligada;
	}

	public void setDesligada(boolean desligada) {
		this.desligada = desligada;
	}

	public boolean getLigar() {
		return ligar;
	}

	public void setLigar(boolean ligar) {
		this.ligar = ligar;
	}

	public boolean getDesligar() {
		return desligar;
	}

	public void setDesligar(boolean desligar) {
		this.desligar = desligar;
	}
	
	// Método para mostrar valor atual da lampada
	public void exibirDados() {
		System.out.println("Status atual da lampada: " + getDesligada());
	}
	
}
