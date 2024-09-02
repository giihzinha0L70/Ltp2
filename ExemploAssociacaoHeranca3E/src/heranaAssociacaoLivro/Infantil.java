
package heranaAssociacaoLivro;

/**
 *
 * @author 363707
 */
public class Infantil extends Livro{
    private String faixaEtaria;

    public String getFaixaEtaria() {
        return faixaEtaria;
    }

    public void setFaixaEtaria(String faixaEtaria) {
        this.faixaEtaria = faixaEtaria;
    }
    
    public Infantil(String nome, Autor autor, Editora editora, String faixaEtaria){
        super(nome, autor, editora);
        this.faixaEtaria=faixaEtaria;        
    }
    
    @Override
    public String toString(){
        return  "\n --- Dados do Livro Infantil ---"+
                "\n Nome:" + getNome()+
                "\n Faixa Etária:" + getFaixaEtaria()+
                "\n Autor do Livro:" + getAutor()+
                "\n Editora do Livro:" + getEditora();
        
    }
}
