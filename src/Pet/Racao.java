package Pet;

public class Racao {

    private String nomeRacao;
    private String tipoRacao;
    private String saborRacao;
    private double preco;
    private int quantidade;

    public String getNomeRacao() {
        return nomeRacao;
    }

    public void setNomeRacao(String nomeRacao) {
        this.nomeRacao = nomeRacao;
    }

    public String getSaborRacao() {
        return saborRacao;
    }

    public void setSaborRacao(String saborRacao) {
        this.saborRacao = saborRacao;
    }

    public String getTipoRacao() {
        return tipoRacao;
    }

    public void setTipoRacao(String tipoRacao) {
        this.tipoRacao = tipoRacao;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {

        this.preco =  quantidade * preco;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

}


