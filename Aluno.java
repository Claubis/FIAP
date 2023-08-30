package aulatres;

public class Aluno {
	
	//Cadastrar atributos privados

	private String rm;
	private String nomeSobrenome;
	private String registro;
	private String cpfPadrao;
	private String telefonePrincipal;
	private String emailPrincipal;
	private String cursoPrincipal;
	private int periodoCurso;
	private float notaGeralFinal;
	
	// métodos getters e setters
	
	public String getNome() {
		return nomeSobrenome;
	}
	
	public void setNome(String nomeSobrenome) {
		// Aqui eu preciso passar os parametros para saber o que preciso formatar
		// Eu preciso usar o this quando os nomes dos parametros e do atributo é o mesmo, quando for diferente, não preciso.
		this.nomeSobrenome = nomeSobrenome;
	}
}
