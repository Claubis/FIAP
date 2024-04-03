package singleton;

public class ex1 {
	
	
	private static ex1 instancia;
	
	// Construtor privado
	private ex1() {
		System.out.println("Objeto criado");
		
	}
	
	public static ex1 getInstancia() {
		if(instancia == null) {
			instancia = new ex1();
		}else {
			System.out.println("Objeto não foi criado!");
		}return instancia;
	}
	
	// Main - Para realizar o teste
	public static void main(String[] arg) {
		
		ex1.getInstancia(); // ex1 é abreviação para Exemplo1_Singleton
		
		System.out.println("Objeto: " + ex1.getInstancia());
	}

}
