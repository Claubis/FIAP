package cp01;

public class TesteLampada {
	public static void main(String[] args) {
		Lampada l1 = new Lampada();
		
		// teste saber status inicial da lampada
		l1.desligada();
		System.out.println("Lampada está desligada?: " + l1.getDesligada());
		
		// Ligar a lampada
		l1.desligar();
		System.out.println("Desligada?: " + l1.getDesligar());
				
		// Ligar a lampada
		l1.ligar();
		System.out.println("Ligar?: " + l1.getLigar());
		
	}
}