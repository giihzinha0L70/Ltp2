
package Modelo_SetorLoja;

/**
 *
 * @author 363707
 */
public class DeCalcados extends Loja{
    private String tipoProduto;
    private Cliente cliente;
    
    public String getTipoProduto() {
        return tipoProduto;
    }

    public void setTipoProduto(String tipoProduto) {
        this.tipoProduto = tipoProduto;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }
    
    public DeCalcados(int numero, String descricao, String tipoProduto, Cliente cliente){
        super(numero, descricao);
        this.tipoProduto=tipoProduto; 
        this.cliente=cliente;
    }
    
    @Override
    public String toString(){
        return  "\n Número:" + getNumero()+
                "\n Descrição:" + getDescricao()+
                "\n Tipo de Produto:" + getTipoProduto()+
                "\n Cliente:" + getCliente();
    }
}
