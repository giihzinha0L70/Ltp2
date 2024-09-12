
package Modelo_SetorLoja;

/**
 *
 * @author 363707
 */
public class DeAlimentacao extends Loja{
    private String pais;

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }
    
public DeAlimentacao(int numero, String descricao, String pais){
    super(numero, descricao);
    this.pais=pais;
    }    

    @Override
    public String toString(){
    return  "\n Número:" + getNumero()+
            "\n Descrição:" + getDescricao()+
            "\n País:" + getPais();
}
}
