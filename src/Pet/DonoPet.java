package Pet;

public class DonoPet extends Pet

{


    private String nomeDono ;
    private  int idade =0 ;
    private String cpf ;
    private String endereco;


    public String getNomeDono() {
        return nomeDono;
    }

    public void setNomeDono(String nomeDono) {
         this.nomeDono = nomeDono;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

}
