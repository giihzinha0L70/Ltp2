
package Diretoria;

/**
 *
 * @author 363707
 */
public class Treino {
    private String descricao;

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
    
    public Treino(String descricao){
        this.descricao=descricao;        
    }
    
    @Override
    public String toString(){
        return  "\n Descrição:" + getDescricao();
    }
}
