
package ModeloProduto;

/**
 *
 * @author 363707
 */
public class Fornecedor {
    private String cnpj;
    private String nome;
    private DoFornecedor doFornecedor;
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

    public DoFornecedor getDoFornecedor() {
        return doFornecedor;
    }

    public void setDoFornecedor(DoFornecedor doFornecedor) {
        this.doFornecedor = doFornecedor;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }
    
    public Fornecedor(String cnpj, String nome, DoFornecedor doFornecedor, Endereco endereco){
        this.cnpj=cnpj;
        this.nome=nome;
        this.doFornecedor=doFornecedor;  
        this.endereco=endereco;
    }
    @Override
    public String toString(){
        return  "\n CNPJ:" + getCnpj()+
                "\n Nome:" + getNome()+
                "\n Nota Fiscal do Fornecedor:" + getDoFornecedor()+
                "\n Endereço:" + getEndereco();
    }
}
