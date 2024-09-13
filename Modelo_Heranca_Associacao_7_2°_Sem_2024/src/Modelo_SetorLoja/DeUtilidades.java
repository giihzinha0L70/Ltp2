
package Modelo_SetorLoja;

/**
 *
 * @author 363707
 */
public class DeUtilidades extends Loja{
    private int quantidadeProduto;
    private Cliente cliente;
    private Box box;
    
    public int getQuantidadeProduto() {
        return quantidadeProduto;
    }

    public void setQuantidadeProduto(int quantidadeProduto) {
        this.quantidadeProduto = quantidadeProduto;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Box getBox() {
        return box;
    }

    public void setBox(Box box) {
        this.box = box;
    }    
     
    public DeUtilidades(int numero, String descricao, int quantidadeProduto, Cliente cliente, Box box){
        super(numero, descricao);
        this.quantidadeProduto=quantidadeProduto; 
        this.cliente=cliente;
        this.box=box;
    }
    
    @Override
    public String toString(){
        return  "\n Número:" + getNumero()+
                "\n Descrição:" + getDescricao()+
                "\n Quantidade de Produtos:" + getQuantidadeProduto()+
                "\n Cliente:" + getCliente()+
                "\n Box:" + getBox();
    }
}
