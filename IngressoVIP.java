package Bilheteria;

public class IngressoVIP extends Ingresso {
	
	private float valorAdional;
	
	public IngressoVIP(float valor, float valorAdicional) {
		super(valor);
		// TODO Auto-generated constructor stub
		
		this.valorAdional = valorAdicional;
	}
	
	@Override // vai mudar o comportamento da super classe
	public void imprimirValor() {
		
		float total = this.valorAdional + super.getValor();
		// this pega desta classe e o super pega da classe pai.
		
		System.out.println("Valor: " + total);
		System.out.printf("Valor: %.2f", total);
	}
	
	
		
}
