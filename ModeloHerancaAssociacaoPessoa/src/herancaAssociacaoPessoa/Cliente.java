
package herancaAssociacaoPessoa;

/**
 *
 * @author 363707
 */
public class Cliente extends Pessoa{
    private String cpf;
    private String endereco;

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
    
    public Cliente(String nome, String cpf, String endereco){
        super(nome);
        this.cpf=cpf;
        this.endereco=endereco;        
    }  
    
    @Override
    public String toString(){
        return  "\n Nome:" + getNome()+
                "\n CPF:" + getCpf()+
                "\n Endereço:" + getEndereco();
    }
}
