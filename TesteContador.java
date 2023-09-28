package cp01;

public class TesteContador {
	public static void main(String[] args) {
		Contador c1 = new Contador();
		
		// Teste - Iniciar contador
		c1.iniciarContador();
		System.out.println("Status atual do contador: " + c1.getContar());
		
		// Teste - Incrementar mais um no contador
		c1.incrementarContador();
		System.out.println("Inserir mais um: " + c1.getContar());
		
		// Teste - Incrementar mais um no contador e deixar com dois
		c1.incrementarContador();
		System.out.println("Inserir mais um: " + c1.getContar());
		
		// teste - Tirar um do contador
		c1.diminuirContador();
		System.out.println("Diminuir um: " + c1.getContar());
		
		// teste - zerar o contador
		c1.zerarContador();
		System.out.println("Contador será zerado: " + c1.getContar());
		
		
	}
}
