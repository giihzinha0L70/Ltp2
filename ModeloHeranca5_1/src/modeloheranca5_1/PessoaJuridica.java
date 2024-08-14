
package modeloheranca5_1;

/**
 *
 * @author 363707
 */
public class PessoaJuridica extends Cliente{
    private String cnpj;

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }
    
    public PessoaJuridica(String nome, String endereco, int idade, String cnpj){
        super(nome, endereco, idade);
        this.cnpj = cnpj;
        
    }
    public String toString(){
        return"--- PESSOA JURÍDICA ---"+
                "\nNome: "+getNome()+
                "\nEndereco : "+getEndereco()+
                "\nIdade: "+getIdade()+
                "\nCnpj: "+getCnpj();
    }
}
