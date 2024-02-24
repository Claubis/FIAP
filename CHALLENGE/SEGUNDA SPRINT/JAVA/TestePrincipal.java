package projetoChallenge;

import java.util.Scanner;

public class TestePrincipal {
	
	//public Usuario[] cadastros;

	
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Define o tamanho do vetor de cadastros
        int tamanhoCadastro = 10; 

        //Usuario dadosUsuario = new Usuario(null, null, null);
        
        CadastroUsuario dadosUsuario = new CadastroUsuario(tamanhoCadastro);
        
        dadosUsuario.inicializarVetor(tamanhoCadastro);

        // Criar instância de Login passando DadosUsuario
        Login login = new Login(dadosUsuario);
        Menu menu = new Menu();
       
        
        while (true) {
            int opcao;
            do {
                // Exibe menu inicial
                opcao = menu.menu();

                switch (opcao) {
                	case 0:
                		// Opção de retornar ao menu principal
                		System.out.println("Retornando ao menu principal...\n");
                		break;
                    
                    case 1:
                        // Opção de cadastro
                        dadosUsuario.novoCadastro();
                        break;
                    case 2:
                        // Opção de listar cadastros
                        dadosUsuario.listarCadastros();
                        break;
                    case 3:
                        // Opção de realizar login
                        boolean autenticado = login.autenticarLogin();
                        break;
                    case 4:
                        // Opção de sair
                        System.out.println("Saindo do programa. Até logo!\n");
                        System.exit(0);
                    default:
                        System.out.println("Opção inválida. Tente novamente.\n");
                        break;
                }

            } while (opcao != 0);
        }
    }

}
