package projetoChallenge;

public class AtualizacaoConteudo {
    private int ID;
    private String tipoAtualizacao;
    private String descricao;
    private String dataAtualizacao;

    public AtualizacaoConteudo(int ID, String tipoAtualizacao, String descricao, String dataAtualizacao) {
        this.ID = ID;
        this.tipoAtualizacao = tipoAtualizacao;
        this.descricao = descricao;
        this.dataAtualizacao = dataAtualizacao;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getTipoAtualizacao() {
        return tipoAtualizacao;
    }

    public void setTipoAtualizacao(String tipoAtualizacao) {
        this.tipoAtualizacao = tipoAtualizacao;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getDataAtualizacao() {
        return dataAtualizacao;
    }

    public void setDataAtualizacao(String dataAtualizacao) {
        this.dataAtualizacao = dataAtualizacao;
    }

    public void registrarAtualizacao(String tipo, String descricao) {
        // Implementação do método registrarAtualizacao
    }

    public void listarAtualizacao() {
        // Implementação do método listarAtualizacao
    }
}
