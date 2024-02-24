package projetoChallenge;

public class PlataformaLogin {
    private int ID_Plataforma;
    private String nomePlataforma;
    private String email;
    private String senha;
    private String dataHoraCriacao;

    public PlataformaLogin(int ID_Plataforma, String nomePlataforma, String email, String senha, String dataHoraCriacao) {
        this.ID_Plataforma = ID_Plataforma;
        this.nomePlataforma = nomePlataforma;
        this.email = email;
        this.senha = senha;
        this.dataHoraCriacao = dataHoraCriacao;
    }

    public int getID_Plataforma() {
        return ID_Plataforma;
    }

    public void setID_Plataforma(int ID_Plataforma) {
        this.ID_Plataforma = ID_Plataforma;
    }

    public String getNomePlataforma() {
        return nomePlataforma;
    }

    public void setNomePlataforma(String nomePlataforma) {
        this.nomePlataforma = nomePlataforma;
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

    public String getDataHoraCriacao() {
        return dataHoraCriacao;
    }

    public void setDataHoraCriacao(String dataHoraCriacao) {
        this.dataHoraCriacao = dataHoraCriacao;
    }

    public void autenticarPlataforma() {
        // Implementação do método autenticarPlataforma
    }

    public void registrarNovaPlataforma() {
        // Implementação do método registrarNovaPlataforma
    }

    public void guardarDataHoraCriacao() {
        // Implementação do método guardarDataHoraCriacao
    }
}
