package projetoChallenge;

public class IdiomaInteracao {
    private int ID_usuario;
    private String idiomaSelecionado;

    public IdiomaInteracao(int ID_usuario, String idiomaSelecionado) {
        this.ID_usuario = ID_usuario;
        this.idiomaSelecionado = idiomaSelecionado;
    }

    public String getIdiomaSelecionado() {
        return idiomaSelecionado;
    }

    public void setIdiomaSelecionado(String idiomaSelecionado) {
        this.idiomaSelecionado = idiomaSelecionado;
    }

    public int getID_usuario() {
        return ID_usuario;
    }

    public void setID_usuario(int ID_usuario) {
        this.ID_usuario = ID_usuario;
    }

    public void selecionarIdioma(int usuarioID, String idioma) {
        // Implementação do método selecionarIdioma
    }

    public String obterIdioma(int usuarioID) {
		return idiomaSelecionado;
        // Implementação do método obterIdioma
    }
}
