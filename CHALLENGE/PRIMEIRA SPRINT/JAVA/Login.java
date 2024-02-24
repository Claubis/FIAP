package projetoChallenge;

import java.util.Scanner;

public class Login {
    private String email;
    private String senha;

    public Login(String email, String senha) {
        this.email = email;
        this.senha = senha;
    }

    public String getEmail() {
        return email;
    }
    
    

    public String getSenha() {
        return senha;
    }

    public static Login obterCredenciais() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o email: ");
        String email = scanner.nextLine();

        System.out.println("Digite a senha: ");
        String senha = scanner.nextLine();

        return new Login(email, senha);
    }

    public boolean autenticar() {
        // Aqui você faria a lógica de autenticação
        // Compare o email e a senha com os dados registrados
        // Se autenticado, retorne true, senão, retorne false
        return false; // Por enquanto, retornando falso para exemplo
    }
}
