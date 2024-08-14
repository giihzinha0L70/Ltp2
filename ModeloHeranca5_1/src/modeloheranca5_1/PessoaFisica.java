
package modeloheranca5_1;

/**
 *
 * @author 363707
 */
public class PessoaFisica extends Cliente{
    private String cpf;

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
    
    public PessoaFisica(String nome, String endereco, int idade, String cpf){
        super(nome, endereco, idade);
        this.cpf = cpf;
        
    }
     public String toString(){
        return"--- PESSOA FÍSICA ---"+
                "\nNome: "+getNome()+
                "\nEndereco : "+getEndereco()+
                "\nIdade: "+getIdade()+
                "\nCpf: "+getCpf();
                
    }
}
