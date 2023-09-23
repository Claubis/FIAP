package comandoWhile;

public class TesteCarro {
	public static void main(String[] args) {
		
		Carro c1 = new Carro("Ferrari", "Spider", "Vermelha");
		System.out.println("Velocidade atual: " + c1.getVelocidade());
		c1.acelerar();
		c1.acelerar();
		c1.acelerar();
		System.out.println("Velocidade atual: " + c1.getVelocidade());
		
		// Criar um contador
		int contador = 1;
		while(contador <=5) {
			c1.acelerar();
			contador++;
		}
		System.out.println("Velocidade agora..." + c1.getVelocidade());
	}
}
