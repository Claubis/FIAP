//  cadastrar o método e utilizar, sem pegar o atributo diretamente.
// Neste modelo, eu cadastro a Classe Teste e vou chamar as demais durante meu processo.

package aulatres;

public class TesteAluno {
	
	public static void main (String[] args) {
		
	// Jeito correto de fazer, pois podemos cadastrar e terá validação. 
	// Aqui eu não acesso o atributo diretamente e sim o método
	Aluno aluno = new Aluno();
	aluno.setNome("Claudio");
	System.out.println("Nome: " + aluno.getNome());
	
	}
}
