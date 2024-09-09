
package ModeloFarmacia;

/**
 *
 * @author 363707
 */
public class Medicamento extends Produto{
    private String tarja;
    private String doenca;

    public String getTarja() {
        return tarja;
    }

    public void setTarja(String tarja) {
        this.tarja = tarja;
    }

    public String getDoenca() {
        return doenca;
    }

    public void setDoenca(String doenca) {
        this.doenca = doenca;
    }
    
    public Medicamento(String codigo, String nome, Double preco, Fornecedor fornecedor, String tarja, String doenca){
        super(codigo, nome, preco, fornecedor);
        this.tarja=tarja;
        this.doenca=doenca;
    }
    
    @Override
    public String toString(){
        return  "\n Código:" + getCodigo()+
                "\n Nome:" + getNome()+
                "\n Preço:" + getPreco()+
                "\n Fornecedor:" + getFornecedor()+
                "\n Tarja:" + getTarja()+
                "\n Doença:" + getDoenca();
    }
}
