
package heranaAssociacaoLivro;

/**
 *
 * @author 363707
 */
public class Suspense {
    private int qtdePaginas;

    public int getQtdePaginas() {
        return qtdePaginas;
    }

    public void setQtdePaginas(int qtdePaginas) {
        this.qtdePaginas = qtdePaginas;
    }
    
    public Suspense(int qtdePaginas){
        this.qtdePaginas=qtdePaginas;        
    }
    
    @Override
    public String toString(){
        return  "\n --- Dados do Livro Suspense ---"+
                "\n Quantidade de Páginas:" + getQtdePaginas();
    }
}
