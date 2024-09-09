
package ModeloFarmacia;

/**
 *
 * @author 363707
 */
public class Perfumaria extends Produto{
    private Double desconto;
    private String secao;

    public Double getDesconto() {
        return desconto;
    }

    public void setDesconto(Double desconto) {
        this.desconto = desconto;
    }

    public String getSecao() {
        return secao;
    }

    public void setSecao(String secao) {
        this.secao = secao;
    }
    
    public Perfumaria(String codigo, String nome, Double preco, Fornecedor fornecedor, Double desconto, String secao){
        super(codigo, nome, preco, fornecedor);
        this.desconto=desconto;
        this.secao=secao;
    }
    
    @Override
    public String toString(){
        return  "\n Código:" + getCodigo()+
                "\n Nome:" + getNome()+
                "\n Preço:" + getPreco()+
                "\n Fornecedor:" + getFornecedor()+
                "\n Desconto:" + getDesconto()+
                "\n Seção:" + getSecao();
    }
}
