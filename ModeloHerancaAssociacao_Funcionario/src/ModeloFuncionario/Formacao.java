
package ModeloFuncionario;

/**
 *
 * @author 363707
 */
public class Formacao {
    private String descricao;

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
    
    public Formacao(String descricao){
        this.descricao=descricao;        
    }
    
    @Override
    public String toString(){
        return  "\n Descrição:" + getDescricao();
    }
}
