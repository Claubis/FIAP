package projetoChallenge;

public class Funcionario {
    private int ID;
    private String nome;
    private String email;
    private String senha;

    public Funcionario(int ID, String nome, String email, String senha) {
        this.ID = ID;
        this.nome = nome;
        this.email = email;
        this.senha = senha;
    }

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

    public void autenticarFuncionario() {
        // Implementação do método autenticarFuncionario
    }

    public void registrarNovoFuncionario() {
        // Implementação do método registrarNovoFuncionario
    }

    public void guardarDataHoraAcesso() {
        // Implementação do método guardarDataHoraAcesso
    }
}

