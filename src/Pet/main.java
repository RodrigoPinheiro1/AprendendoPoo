package Pet;

public class main {

    public static void main(String args[]) {

        DonoPet donoJoao = new DonoPet();
        Pet petJoao = new Pet();
        Pet petJoao2 = new Pet();

        donoJoao.setNomeDono(" joão");
        donoJoao.setCpf("11111111111");
        donoJoao.setEndereco(" rua fulano joao");
        donoJoao.setIdade(30);

        petJoao.setNomePet("tobias");
        petJoao.setIdadePet(4);
        petJoao.setTipoPet("cachorro");
        petJoao.setCastrado("sim ");
        petJoao.setRaca("golden");
        petJoao.setQuantidade(2);

        petJoao2.setNomePet("josias2");
        petJoao2.setIdadePet(3);
        petJoao2.setTipoPet("gato");
        petJoao2.setRaca("maine Coon");
        petJoao2.setCastrado("não");


        System.out.println("informações do dono: nome " + donoJoao.getNomeDono() + "\n" +
                "Cpf " + donoJoao.getCpf() + " \n " +
                "endereco" + donoJoao.getEndereco() + "\n " +
                "idade: " + donoJoao.getIdade() + "\n" +
                "quantidades de pets " + petJoao.getQuantidade());

        System.out.println("informações do animal do dono " + donoJoao.getNomeDono() + "\n " +
                "o animal é : " + petJoao.getTipoPet() + "\n" +
                "nome: " + petJoao.getNomePet() + "\n" +
                "idade do pet : " + petJoao.getIdadePet() + " anos \n " +
                "raca: " + petJoao.getRaca() + "\n " +
                " castrado : " + petJoao.getCastrado());


        System.out.println("segundo animal do dono " + donoJoao.getNomeDono() + "\n " +
                "o animal é : " + petJoao2.getTipoPet() + "\n" +
                "nome: " + petJoao2.getNomePet() + "\n" +
                "idade do pet : " + petJoao2.getIdadePet() + " anos \n " +
                "raca: " + petJoao2.getRaca() + "\n " +
                " castrado : " + petJoao2.getCastrado());


        Fornecedor myPetBrasil = new Fornecedor();


        myPetBrasil.setNomeFornecedor("mypet Brasil");
        myPetBrasil.setEndereco("rua do mypet brasil");
        myPetBrasil.setEstrelas(4);
        myPetBrasil.setCnpj("22222222222222");

        Racao goldenJoao = new Racao();

        goldenJoao.setNomeRacao("golden 3 kg ");
        goldenJoao.setSaborRacao("carne");
        goldenJoao.setTipoRacao("plus");
        goldenJoao.setQuantidade(2);
        goldenJoao.setPreco(80.90);


        System.out.println(donoJoao.getNomeDono() + " comprou a Racao " + goldenJoao.getNomeRacao() + "\n" +
                "tipo da raçao: " + goldenJoao.getTipoRacao() + "\n" +
                "sabor: " + goldenJoao.getSaborRacao() + "\n " +
                "quantidade de ração : " + goldenJoao.getQuantidade() + "\n " +
                "preço: " +goldenJoao.getPreco() + "\n" +
                " da empresa: " + myPetBrasil.getNomeFornecedor() + "\n" +
                "endereco do fornecedor: " + myPetBrasil.getEndereco() + "\n" +
                "cnpj: " + myPetBrasil.getCnpj() + "\n" +
                "numero de estrelas : " + myPetBrasil.getEstrelas());


    }

}
