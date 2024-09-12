
package Modelo_SetorLoja;

/**
 *
 * @author 363707
 */
public class DeUtilidades extends Loja{
    private int quantidadeProduto;

    public int getQuantidadeProduto() {
        return quantidadeProduto;
    }

    public void setQuantidadeProduto(int quantidadeProduto) {
        this.quantidadeProduto = quantidadeProduto;
    }
    
    public DeUtilidades(int numero, String descricao, int quantidadeProduto){
        super(numero, descricao);
        this.quantidadeProduto=quantidadeProduto;        
    }
    
    @Override
    public String toString(){
        return  "\n Número:" + getNumero()+
                "\n Descrição:" + getDescricao()+
                "\n Quantidade de Produtos:" + getQuantidadeProduto();
    }
}
