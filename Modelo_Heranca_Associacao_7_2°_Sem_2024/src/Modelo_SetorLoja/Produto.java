
package Modelo_SetorLoja;

/**
 *
 * @author 363707
 */
public class Produto {
    private int codigo;
    private String nome;
    private Double preco;
    private Fornecedor fornecedor;

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
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
    
    public Produto(int codigo, String nome, Double preco,  Fornecedor fornecedor){
        this.codigo=codigo;
        this.nome=nome;
        this.preco=preco;
        this.fornecedor=fornecedor;
    }
    
    public String toSting(){
        return  "\n Código:" + getCodigo()+
                "\n Nome:" + getNome()+
                "\n Preço:" + getPreco()+
                "\n Fornecedor:" + getFornecedor();
    }
}
