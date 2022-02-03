package Pet;

public class Fornecedor {

    private String nomeFornecedor;
    private String cnpj;
    private String endereco;
    private int estrelas; //estrelas de 0 até 5 qualificação.


    public String getNomeFornecedor() {
        return nomeFornecedor;
    }

    public void setNomeFornecedor(String nomeFornecedor) {
        this.nomeFornecedor = nomeFornecedor;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public String getEndereco() {
        return endereco;

    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public int getEstrelas() {
        return estrelas;
    }

    public void setEstrelas(int estrelas) {
        this.estrelas = estrelas;
    }

}
