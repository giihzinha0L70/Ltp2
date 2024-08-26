
package Diretoria;

/**
 *
 * @author 363707
 */
public class Olheiro {
    private String nome;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    
    public Olheiro(String nome){
        this.nome=nome;        
    }
    
    @Override
    public String toString(){
        return  "\n Nome:" + getNome();
    }
}
