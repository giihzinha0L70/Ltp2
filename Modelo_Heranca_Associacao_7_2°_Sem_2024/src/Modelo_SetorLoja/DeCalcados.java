
package Modelo_SetorLoja;

/**
 *
 * @author 363707
 */
public class DeCalcados extends Loja{
    private String tipoProduto;

    public String getTipoProduto() {
        return tipoProduto;
    }

    public void setTipoProduto(String tipoProduto) {
        this.tipoProduto = tipoProduto;
    }
    
    public DeCalcados(int numero, String descricao, String tipoProduto){
        super(numero, descricao);
        this.tipoProduto=tipoProduto;        
    }
    
    @Override
    public String toString(){
        return  "\n Número:" + getNumero()+
                "\n Descrição:" + getDescricao()+
                "\n Tipo de Produto:" + getTipoProduto();
    }
}
