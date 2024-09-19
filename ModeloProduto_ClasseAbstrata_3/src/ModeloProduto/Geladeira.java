
package ModeloProduto;

/**
 *
 * @author 363707
 */
public class Geladeira extends Produto{
    private String marca;
    private int qtdPortas;

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getQtdPortas() {
        return qtdPortas;
    }

    public void setQtdPortas(int qtdPortas) {
        this.qtdPortas = qtdPortas;
    }
    
    public Geladeira(String codBarra, String descricao, Double preco, Fornecedor fornecedor, Fisica fisica, String marca, int qtdPortas){
        super(codBarra, descricao, preco, fornecedor, fisica);
        this.marca=marca;
        this.qtdPortas=qtdPortas;
    }
    
    public Double precoFinal() {
        return preco + icms() + ipi();
    }

    public Double icms() {
        return preco * TAXA_ICMS;
    }

    public Double ipi() {
        return preco * TAXA_IPI;
    }
}
