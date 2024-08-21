
package Padaria;

/**
 *
 * @author 363707
 */
public class Produto {
    private String codigo;
    private String nome;
    private Double preco;
    private Fornecedor fornecedor;
    private TipoProduto tipoProduto;

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Double getPreco() {
        return preco;
    }

    public void setPreco(Double preco) {
        this.preco = preco;
    }

    public Fornecedor getFornecedor() {
        return fornecedor;
    }

    public void setFornecedor(Fornecedor fornecedor) {
        this.fornecedor = fornecedor;
    }

    public TipoProduto getTipoProduto() {
        return tipoProduto;
    }

    public void setTipoProduto(TipoProduto tipoProduto) {
        this.tipoProduto = tipoProduto;
    }
    
    public Produto(String codigo, String nome, Double preco, Fornecedor fornecedor, 
            TipoProduto tipoProduto){
        
        this.codigo=codigo;
        this.nome=nome;
        this.preco=preco;
        this.fornecedor=fornecedor;
        this.tipoProduto=tipoProduto;        
    }
    
    @Override
    public String toString(){
        return  "\n Código:" + getCodigo()+
                "\n Nome:" + getNome()+
                "\n Preço:" + getPreco()+
                "\n Forenecedor:" + getFornecedor()+
                "\n Tipo do Produto:" + getTipoProduto();
    }
    
}
