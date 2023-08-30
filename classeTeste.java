// Utilizar os atributos diretamente
package aulatres;

public class classeTeste {
	public static void main (String[] args) {
		
		cadastroAluno aluno = new cadastroAluno();
		
		// Jeito errado de fazer, pois podemos cadastrar sem validar. 
		// Aqui eu fiz o processo sem colocar private nos meus atributos.
		
		aluno.nome = "Claudio";
		aluno.matricula = "553472";
		aluno.curso = "ADS";
		aluno.cpf = "12345678910";
		aluno.rg = "1241254122";
		aluno.periodo = 1;
		aluno.telefone = "55412250";
		
		// Colocar o f de float para determinar que não é um double como de defaut do Java.
		aluno.notaGeral = 9.5f;
		
		System.out.println("nome " + aluno.nome);
		

	}
}
