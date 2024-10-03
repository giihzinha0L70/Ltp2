
package ModeloAuditoria;

/**
 *
 * @author 363707
 */
public class Fisica extends Pessoa{
    private String cpf;
    private ParaPessoaFisica paraPessoaFisica;

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public ParaPessoaFisica getParaPessoaFisica() {
        return paraPessoaFisica;
    }

    public void setParaPessoaFisica(ParaPessoaFisica paraPessoaFisica) {
        this.paraPessoaFisica = paraPessoaFisica;
    }
    
    public Fisica(String nome, Endereco endereco, String cpf, ParaPessoaFisica paraPessoaFisica){
        super(nome, endereco);
        this.cpf=cpf;
        this.paraPessoaFisica=paraPessoaFisica;
    }
    
    @Override
    public String toString(){
        return  "\nNome:" + getNome()+
                "\nEndereço:" + getEndereco()+
                "\nCPF:" + getCpf()+
                "\nPara Pessoa Fisica:" + getParaPessoaFisica();
    }
}
