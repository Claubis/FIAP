package aula_4;

// Aqui eu crio a class para teste > Estilo main/processo principal
public class TesteMetodoConstrutor {
	
	public static void main(String[] args) {
	MetodoConstrutor aluno = new MetodoConstrutor("Aluno", "tm123", "123.123.546-10", "Tech");
	aluno.exibirDados();
	System.out.println("-----------------");
	
	MetodoConstrutor aluno2 = new MetodoConstrutor("Claudio", "5534", "408.305.556-10", "Medicina");
	aluno2.exibirDados();
	// Neste processo estou usando a função e usando os métodos dela.
	System.out.println("-----------------");
	
	//Se eu precisar solicitar dados para o usuário, eu preciso definir o Scanner
	
	//Para 
	MetodoConstrutor aluno3 = new MetodoConstrutor("Aline", "1515", "410.305.750-20","Historia");
	aluno3.exibirDados();
	aluno3.setCurso(null);
	
	
	
	}
}
