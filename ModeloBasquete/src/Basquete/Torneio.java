
package Basquete;

/**
 *
 * @author 363707
 */
public class Torneio {
    private String dia;
    private Partidas partidas;

    public String getDia() {
        return dia;
    }

    public void setDia(String dia) {
        this.dia = dia;
    }

    public Partidas getPartidas() {
        return partidas;
    }

    public void setPartidas(Partidas partidas) {
        this.partidas = partidas;
    }
    
    public Torneio(String dia, Partidas partidas){
        this.dia=dia;
        this.partidas=partidas;
    }
    
    @Override
    public String toString(){
        return  "\n Dia:" + getDia()+
                "\n Partidas:" + getPartidas();
    }
}
