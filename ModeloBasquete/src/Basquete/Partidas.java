
package Basquete;

/**
 *
 * @author 363707
 */
public class Partidas {
    private String data;
    private String hora;
    private Quadra quadra;
    private Equipe equipe;
    private Arbitragem arbitragem;

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public String getHora() {
        return hora;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }

    public Quadra getQuadra() {
        return quadra;
    }

    public void setQuadra(Quadra quadra) {
        this.quadra = quadra;
    }

    public Equipe getEquipe() {
        return equipe;
    }

    public void setEquipe(Equipe equipe) {
        this.equipe = equipe;
    }

    public Arbitragem getArbitragem() {
        return arbitragem;
    }

    public void setArbitragem(Arbitragem arbitragem) {
        this.arbitragem = arbitragem;
    }
    
    public Partidas(String data, String hora, Quadra quadra, Equipe equipe, Arbitragem arbitragem){
        this.data=data;
        this.hora=hora;
        this.quadra=quadra;
        this.equipe=equipe;
        this.arbitragem=arbitragem;        
    }
    
    @Override
    public String toString(){
        return  "\n Data:" + getData()+
                "\n Hora:" + getHora()+
                "\n Qudra:" + getQuadra()+
                "\n Equipe:" + getEquipe()+
                "\n Arbitragem:" + getArbitragem();
    }
}
