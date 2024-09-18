
package ModeloProduto;

/**
 *
 * @author 363707
 */
public class Fornecedor {
    private String cnpj;
    private String nome;
    private DoFornecedor doFornecedor;

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
    
    public Fornecedor(String cnpj, String nome, DoFornecedor doFornecedor){
        this.cnpj=cnpj;
        this.nome=nome;
        this.doFornecedor=doFornecedor;        
    }
    @Override
    public String toString(){
        return  "\n CNPJ:" + getCnpj()+
                "\n Nome:" + getNome()+
                "\n Nota Fiscal do Fornecedor:" + getDoFornecedor();
    }
}
