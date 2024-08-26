
package Diretoria;

/**
 *
 * @author 363707
 */
public class Competicao {
    private String nome;
    private int posicao;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getPosicao() {
        return posicao;
    }

    public void setPosicao(int posicao) {
        this.posicao = posicao;
    }
    
    public Competicao(String nome, int posicao){
        this.nome=nome;
        this.posicao=posicao;
    }
        
    @Override
    public String toString(){
        return  "\n Nome:" + getNome()+
                "\n Posição:" + getPosicao();          
    }
}
