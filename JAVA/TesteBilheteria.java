package Bilheteria;

public class TesteBilheteria {
	
	public static void main(String[] args) {
		Ingresso ingresso = new Ingresso(10);
		
		IngressoVIP ingressoVip = new IngressoVIP(10,10);
		
		ingresso.imprimirValor();
		ingressoVip.imprimirValor();
	}
}
