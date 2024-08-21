
package Padaria;

/**
 *
 * @author 363707
 */
public class Fornecedor {
    private String cnpj;
    private String nome;
    private String telefone;
    private Endereco endereco;

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }
    
    public Fornecedor(String cnpj, String nome, String telefone, Endereco endereco){
        this.cnpj=cnpj;
        this.nome=nome;
        this.telefone=telefone;
        this.endereco=endereco;
    }
    
    @Override
    public String toString(){
        return  "\n CNPJ:" + getCnpj()+
                "\n Nome:" + getNome()+
                "\n Telefone:" + getTelefone()+
                "\n Endereço:" + getEndereco();
    }
}
