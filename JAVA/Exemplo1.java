package aulaHeranca;

public class Exemplo1 {
	//  Será funcionário
	//  Criação de uma super classe
	
	private String nome;
	private String CTPS;
	
	// Construtor
	public Exemplo1() {
		
	}

	public Exemplo1(String nome, String cTPS) {
		// TODO Auto-generated constructor stub
		this.nome = nome;
		CTPS = cTPS;
	
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCTPS() {
		return CTPS;
	}

	public void setCTPS(String cTPS) {
		CTPS = cTPS;
	}
	
	public void exibirDados() {
		System.out.println("Nome: " + this.nome);
		System.out.println("Carteira de trabalho: " + this.CTPS);
		// Atenção aqui, como defini que minhas classes serão private, elas estarão acessíveis quando forem acessados pela mesma classe.
		
	}
	

	
}
