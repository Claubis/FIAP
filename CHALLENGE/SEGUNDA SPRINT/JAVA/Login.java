package projetoChallenge;

import java.util.Scanner;

public class Login {
    // Uso de composição entre as classes
	private CadastroUsuario cadastroUsuario;

    // Construtor
    public Login(CadastroUsuario cadastroUsuario) {
        this.cadastroUsuario = cadastroUsuario;
    }

    public boolean autenticarLogin() {
        Scanner scanner = new Scanner(System.in);

        String emailInput = "";
        String senhaInput = "";

        while (true) {
            // Coletar o email
            System.out.println("Digite seu email: ");
            emailInput = scanner.nextLine();

            if ("0".equals(emailInput)) {
                System.out.println("Saindo do processo de login...");
                return false;
            } else if (emailInput.isEmpty()) {
                System.out.println("Email não pode estar vazio. Por favor, insira um email válido.\n");
            } else {
                break; // Se o Email for válido, pode sair do loop
            }
        }

        while (true) {
            // Coletar a senha
            System.out.println("Digite a senha cadastrada: ");
            senhaInput = scanner.nextLine();

            if ("0".equals(senhaInput)) {
                System.out.println("Saindo do processo de login...");
                return false;
            } else if (senhaInput.isEmpty()) {
                System.out.println("Senha não pode estar vazia. Por favor, insira uma senha válida.\n");
            } else {
                break; // Senha válida, sair do loop
            }
        }

        // Verificar as credenciais
        for (Usuario usuario : cadastroUsuario.getUsuarios()) {
            if (usuario != null && usuario.getEmail().equals(emailInput) && usuario.getSenha().equals(senhaInput)) {
                System.out.println("Login bem-sucedido!");
                return true; // Credenciais corretas
            }
        }

        System.out.println("Credenciais incorretas. Tente novamente.\n");
        return false; // Credenciais incorretas
    }
}
