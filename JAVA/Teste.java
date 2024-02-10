package aulaHeranca;

public class Teste {
	public static void main(String[] args) {
		Exemplo1 funcionario = new Exemplo1("Claudio", "12345");
		
		Medico medico = new Medico("Caua", "123", "CRM123");
		
		// ctrl + espaço sysout
		// Usar o .get para desencapsular
		System.out.println("Obj: " + medico.getCRM());
		System.out.println("--------------------");
		
		// Para eu verificar o espaço que foi alocado.
		System.out.println("Obj: " + medico);
		System.out.println("--------------------");
		
		funcionario.exibirDados();
		System.out.println("--------------------");
		medico.exibirDados();
		
	}
}
