
package Modelo_SetorLoja;

/**
 *
 * @author 363707
 */
public class DeAlimentacao extends Loja{
    private String pais;
    private Cliente cliente;

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }
        
    public DeAlimentacao(int numero, String descricao, String pais, Cliente cliente){
    super(numero, descricao);
    this.pais=pais;
    this.cliente=cliente;
    }    

    @Override
    public String toString(){
    return  "\n Número:" + getNumero()+
            "\n Descrição:" + getDescricao()+
            "\n País:" + getPais()+
            "\n Ciente:" + getCliente();
}
}
