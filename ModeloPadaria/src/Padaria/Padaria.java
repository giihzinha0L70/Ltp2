
package Padaria;

/**
 *
 * @author 363707
 */
public class Padaria {
    private String cnpj;
    private String nome;
    private String telefone;
    private Produto produto;
    private Cliente cliente;
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

    public Produto getProduto() {
        return produto;
    }

    public void setProduto(Produto produto) {
        this.produto = produto;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }
    
    public Padaria(String cnpj, String nome, String telefone, 
           Produto produto, Cliente cliente, Endereco endereco){
        
        this.cnpj=cnpj;
        this.nome=nome;
        this.telefone=telefone;
        this.produto=produto;
        this.cliente=cliente;
        this.endereco=endereco;        
    }
    
    @Override
    public String toString (){
        return  "\n CNPJ:" + getCnpj()+
                "\n Nome:" + getNome()+
                "\n Telefone:" + getTelefone()+
                "\n Produto:" + getProduto()+
                "\n Cliente:" + getCliente()+
                "\n Endereço:" + getEndereco();
    }
}
