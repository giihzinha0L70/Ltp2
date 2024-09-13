
package Modelo_SetorLoja;

/**
 *
 * @author 363707
 */
public class DeLojas extends Setor{
    private String descricao;
    private DeUtilidades deUtilidades;
    private DeCalcados deCalcados;

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public DeUtilidades getDeUtilidades() {
        return deUtilidades;
    }

    public void setDeUtilidades(DeUtilidades deUtilidades) {
        this.deUtilidades = deUtilidades;
    }

    public DeCalcados getDeCalcados() {
        return deCalcados;
    }

    public void setDeCalcados(DeCalcados deCalcados) {
        this.deCalcados = deCalcados;
    }
    
    public DeLojas(int numero, String descricao, DeUtilidades deUtilidades, DeCalcados deCalcados){
        super(numero);
        this.descricao=descricao;
        this.deUtilidades=deUtilidades;
        this.deCalcados=deCalcados;
    }
    
    @Override
    public String toString(){
        return  "\n Número:" + getNumero()+
                "\n Descrição:" + getDescricao()+
                "\n Descrição de Utilidades:" + getDeUtilidades()+
                "\n Descrição de Calçados:" + getDeCalcados();
    }
    
}
