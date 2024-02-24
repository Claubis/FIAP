package projetoChallenge;

/*Classe CadastroUsuario: 
 * Seu propósito é armazenar os usuários cadastrados e 
 * fornecer métodos para manipular esse conjunto de usuários.
 * É responsável por operações relacionadas ao cadastro de usuários, 
 * como adicionar um novo usuário à lista de usuários.
 */
public interface InterfaceCadastroUsuario {
	
	// Métodos que será utilizados na classe Cadastro.
	public void novoCadastro();
	public void listarCadastros();
	public void inicializarVetor(int tamanho);
	public boolean textoValido(String email);
	public boolean emailValido(String email);
	
}
