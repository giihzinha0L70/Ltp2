
package Basquete;

/**
 *
 * @author 363707
 */
public class Quadra {
    private String localizacao;

    public String getLocalizacao() {
        return localizacao;
    }

    public void setLocalizacao(String localizacao) {
        this.localizacao = localizacao;
    }
    
    public Quadra(String localizacao){
        this.localizacao=localizacao;        
    }
    
    @Override
    public String toString(){
        return  "\n Localização:" + getLocalizacao();
    }
}
