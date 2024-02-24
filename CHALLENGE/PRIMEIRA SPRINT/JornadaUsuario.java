package projetoChallenge;

public class JornadaUsuario {
    private int ID;
    private int IDUsuario;
    private String paginaVisitadas;
    private String tempoGasto;

    public JornadaUsuario(int ID, int IDUsuario, String paginaVisitadas, String tempoGasto) {
        this.ID = ID;
        this.IDUsuario = IDUsuario;
        this.paginaVisitadas = paginaVisitadas;
        this.tempoGasto = tempoGasto;
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

    public String getPaginaVisitadas() {
        return paginaVisitadas;
    }

    public void setPaginaVisitadas(String paginaVisitadas) {
        this.paginaVisitadas = paginaVisitadas;
    }

    public String getTempoGasto() {
        return tempoGasto;
    }

    public void setTempoGasto(String tempoGasto) {
        this.tempoGasto = tempoGasto;
    }

    public void rastrearInteracao(int usuarioID, String paginaVisitada, String tempoGasto) {
        // Implementação do método rastrearInteracao
    }
}

