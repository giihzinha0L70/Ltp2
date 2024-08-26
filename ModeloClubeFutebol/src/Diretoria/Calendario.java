
package Diretoria;

/**
 *
 * @author 363707
 */
public class Calendario {
    private String adversario;
    private String estadio;

    public String getAdversario() {
        return adversario;
    }

    public void setAdversario(String adversario) {
        this.adversario = adversario;
    }

    public String getEstadio() {
        return estadio;
    }

    public void setEstadio(String estadio) {
        this.estadio = estadio;
    }
    
    public Calendario(String adversario, String estadio){
        this.adversario=adversario;
        this.estadio=estadio;
    }
    
    @Override
    public String toString(){
        return  "\n Adversário:" + getAdversario()+
                "\n Estádio:" + getEstadio();
    }
}
