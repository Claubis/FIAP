package projetoChallenge;

import java.util.Scanner;

public class CadastroUsuario implements InterfaceCadastroUsuario {

    private Usuario[] usuarios;
    private int indice;


    public CadastroUsuario(int tamanho) {
    	usuarios = new Usuario[tamanho];
    	indice = 0;
    }
    
    @Override
    public boolean textoValido(String texto) {
        return texto.matches("[a-zA-Z]+");
    }

    @Override
    public boolean emailValido(String email) {
        String regex = "^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}$";
        return email.matches(regex);
    }

    

    @Override
    public void novoCadastro() {
        Scanner input = new Scanner(System.in);

        String nome = null;
        String email = null;
        String senha = null;

        while (true) {
            // Coletar o nome
            System.out.println("Digite o nome: ");
            nome = input.nextLine();

            // Verificar se o usuário deseja voltar ao menu principal
            if ("0".equals(nome)) {
                System.out.println("Retornando ao menu principal...");
                return;
            }

            // Condição para validar o nome
            if (!textoValido(nome)) {
                System.out.println("Nome inválido. Por favor, insira um nome válido.\n");
            } else {
                System.out.println("Nome válido. \n");
                break; // Nome é válido, sair do loop
            }
        }

        while (true) {
            // Coletar o email
            System.out.println("Digite o email: ");
            email = input.nextLine();

            // Verificar se o usuário deseja voltar ao menu principal
            if ("0".equals(email)) {
                System.out.println("Retornando ao menu principal...");
                return;
            }

            // Processo para validar formato do email.
            if (!emailValido(email)) {
                System.out.println("Email inválido. Por favor, insira um email válido.");
            } else {
                System.out.println("Email válido. \n");
                break; // Email é válido, sair do loop
            }
        }

        while (true) {
            // Coletar a senha
            System.out.println("Digite a senha que contenha letras e números: ");
            senha = input.nextLine();

            // Verificar se o usuário deseja voltar ao menu principal
            if ("0".equals(senha)) {
                System.out.println("Retornando ao menu principal...");
                return;
            }

            if (!senha.matches("^(?=.*[a-zA-Z])(?=.*[0-9])[a-zA-Z0-9]+$")) {
                System.out.println("Senha inválida. Por favor, insira uma senha com pelo menos uma letra e um número.");
            } else {
                System.out.println("Senha válida. \n");
                break; // Senha é válida, sair do loop
            }
        }

        // Criar um novo usuário com os dados coletados
        Usuario novoUsuario = new Usuario(nome, email, senha);

        // Adicionar o novo usuário ao vetor
        usuarios[indice] = novoUsuario;

        indice++;
        System.out.println("Cadastro realizado com sucesso!\n");
    }

   
    

	@Override
	public void listarCadastros() {
	    	
	    	if (indice == 0) {
	            System.out.println("Não há cadastros para listar.\n");
	            return;
	        }
	    	System.out.println("Cadastros realizados até o momento:\n");
	        for (int i = 0; i < indice; i++) {
	            System.out.println("Nome: " + usuarios[i].getNome());
	            System.out.println("Email: " + usuarios[i].getEmail());
	            System.out.println("Senha: " + usuarios[i].getSenha());
	            System.out.println("************************************");
	        }
	    }


	@Override // Deixar como tributo desta classe
	public void inicializarVetor(int tamanho) {
		usuarios = new Usuario[tamanho];
        indice = 0;
	}

	public Usuario[] getUsuarios() {
        return usuarios;
    }
	
}



