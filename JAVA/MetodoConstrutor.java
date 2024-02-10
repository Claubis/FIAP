package aula_4;

//aula para aprendermos construtores e evoluir em getters e setters
public class MetodoConstrutor {

	//primeiros os atributos
	private String nome;
	private String rm;
	private String cpf;
	private String curso;
	
	//segundo os construtores parametrizados: Defino o mesmo nome da class
	public MetodoConstrutor(String nome, String rm, String cpf, String curso) {
		//Ele precisa receber exatamente a quantidade, tipos dos atributos e nomes;
		//A cor fica marrom pois é uma variavel local, só existe dentro do escopo local;
		this.nome = nome; //posso perceber que as cores são diferentes, pois tem funções diferentes;
		this.rm = rm;
		this.cpf = cpf;
		this.curso = curso;
	
	}
	
	//terceiro os Getters e Setters
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getRm() {
		return rm;
	}
	public void setRm(String rm) {
		this.rm = rm;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public String getCurso() {
		return curso;
	}
	public void setCurso(String curso) {
		this.curso = curso;
	}
	
	// get e set já é padrão e faz automático;
	// source > generate getters e setters
	
	//novo método para executar uma ação (igual função do Python)
	public void exibirDados() {
		System.out.println("Nome: " + getNome());
		System.out.println("Rm: " + getRm());
		System.out.println("CPF: " + getCpf());
		System.out.println("Curso: " + getCurso());
	}
}
