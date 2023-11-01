package aulaHeranca;

	// Preciso colocar extends para mostrar que ele vai herdar de alguém/classe
public class Medico extends Exemplo1 {
	
	// Estou dizendo que médico é um funcionário e que possui nome e carteira de trabalho. Foi herdado do exemplo 1.
	
	// Agora preciso especializar ele.
	private String CRM;

	// Estou criando e pegando os atributos da classe pai/super
	public Medico(String nome, String cTPS, String cRM) {
		// mostrar o que está vindo da super classe
		super(nome, cTPS);
		// veio assim: CRM = cRM;
		this.CRM = cRM;
	}

	public String getCRM() {
		return CRM;
	}

	public void setCRM(String cRM) {
		CRM = cRM;
	}
	
	@Override // Para sobrescrever. Se eu não colocar isso, ele vai pegar o método de Exemplo1
	// Criando o mesmo exibirDados da super classe e implementando mais ações.
	public void exibirDados() {
		System.out.println("Dr.");
		super.exibirDados();
		System.out.println("CRM" + this.CRM);
	}
	
	
}
