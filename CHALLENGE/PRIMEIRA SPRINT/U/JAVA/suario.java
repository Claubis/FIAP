package projetoChallenge;

import java.util.Scanner;
import java.util.Date;

public class Usuario {
    // tributos
    private int ID;
    private String nome;
    private String email;
    private String senha;
    private Date dataHoraCadastro;

    // Construtor
    public Usuario(int ID, String nome, String email, String senha, String plataforma) {
        this.ID = ID;
        this.nome = nome;
        this.email = email;
        this.senha = senha;

    }

    // Getters e Setters
    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }
    
    
    
    public void setDataHoraCadastro(Date dataHoraCadastro) {
        this.dataHoraCadastro = dataHoraCadastro;
    }

    // Método

    public void registrarNovoUsuario() {
    	Scanner scanner = new Scanner(System.in);

    	System.out.println("** Realize seu cadastro **");
    	
        System.out.println("Digite o ID: ");
        int id = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Digite o nome: ");
        String nome = scanner.nextLine();

        System.out.println("Digite o email: ");
        String email = scanner.nextLine();

        System.out.println("Digite a senha: ");
        String senha = scanner.nextLine();
        
        // Obtendo a data e hora do momento do cadastro
        Date dataHoraCadastro = new Date();

        // Criando uma instância de usuario com os dados fornecidos pelo usuário
        Usuario novoUsuario = new Usuario(id, nome, email, senha, plataforma);
        novoUsuario.setDataHoraCadastro(dataHoraCadastro);
        
        usuarios.add(novoUsuario);
        
        System.out.println("\nUsuário cadastrado com sucesso!\n");
        
        scanner.close();

    }
    
    public void imprimirUsuario() {
    	System.out.println("ID: " + this.ID);
        System.out.println("Nome: " + this.nome);
        System.out.println("E-mail: " + this.email);
        System.out.println("Data e Hora de Cadastro: " + this.dataHoraCadastro);

    }
    
    public boolean autenticarUsuario(String email, String senha) {
        return this.email.equals(email) && this.senha.equals(senha);
    }
    
    public static ArrayList<Usuario> usuarios = new ArrayList<>();
        
}
