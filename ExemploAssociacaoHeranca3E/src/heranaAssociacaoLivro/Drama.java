
package heranaAssociacaoLivro;

/**
 *
 * @author 363707
 */
public class Drama {
    private String descricao;

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
    
    public Drama(String descricao){
        this.descricao=descricao;        
    }
    
    @Override
    public String toString(){
        return  "\n --- Dados do livro Drama ---"+
                "\n Descrição:" + getDescricao();
    }
}
