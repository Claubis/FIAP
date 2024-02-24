package projetoChallenge;

public class Seguranca {
    private int ID;
    private int IDUsuario;
    private String nivelAcesso;
    private String tokenAutenticacao;
    private String dataHoraAcesso;

    public Seguranca(int ID, int IDUsuario, String nivelAcesso, String tokenAutenticacao, String dataHoraAcesso) {
        this.ID = ID;
        this.IDUsuario = IDUsuario;
        this.nivelAcesso = nivelAcesso;
        this.tokenAutenticacao = tokenAutenticacao;
        this.dataHoraAcesso = dataHoraAcesso;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public int getIDUsuario() {
        return IDUsuario;
    }

    public void setIDUsuario(int IDUsuario) {
        this.IDUsuario = IDUsuario;
    }

    public String getNivelAcesso() {
        return nivelAcesso;
    }

    public void setNivelAcesso(String nivelAcesso) {
        this.nivelAcesso = nivelAcesso;
    }

    public String getTokenAutenticacao() {
        return tokenAutenticacao;
    }

    public void setTokenAutenticacao(String tokenAutenticacao) {
        this.tokenAutenticacao = tokenAutenticacao;
    }

    public String getDataHoraAcesso() {
        return dataHoraAcesso;
    }

    public void setDataHoraAcesso(String dataHoraAcesso) {
        this.dataHoraAcesso = dataHoraAcesso;
    }

    public String gerarToken() {
        // Implementação do método gerarToken
        return null; // Preciso gerar um modelo de colocar o token aqui, igual em python
    }

    public boolean verificarAcesso(String token) {
        // Implementação do método verificarAcesso
        return false; // Preciso da logica aqui
    }
}
