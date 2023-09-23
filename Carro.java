package comandoWhile;

// Introdução a POO
public class Carro {
	// Atributos
	private String marca;
	private String modelo;
	private String placa;
	private boolean status;
	private float velocidade;
	private String cor;
	
	// Construtor
	// Vai criar automáticamente o objeto e vai chamar
	// os atributos acima
	public Carro(String marca, String modelo, String cor) {
		this.marca = marca;
		this.cor = cor;
		this.modelo = modelo;
		
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public String getPlaca() {
		return placa;
	}

	public void setPlaca(String placa) {
		this.placa = placa;
	}

	public boolean isStatus() {
		return status;
	}

	public void setStatus(boolean status) {
		this.status = status;
	}

	public float getVelocidade() {
		return velocidade;
	}

	public void setVelocidade(float velocidade) {
		this.velocidade = velocidade;
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}
	
	// Criar métodos
	public void acelerar() {
		if(this.velocidade <= 50) {
			this.velocidade += 5;
		}else {
			System.out.println("Velocidade máxima!");
		}
				
	}
	
	public void desacelerar() {
		if(this.velocidade > 0) {
			this.velocidade -= 5;
		}else {
			System.out.println("Velocidade minima!");
		}
	}
	
	public void frear() {
		while(this.velocidade >= 0) {
			System.out.println("Velocidade: " + this.velocidade);
			this.desacelerar();
		
		} System.out.println("Velocidade MINIMA! ");
	}
	
}
