
package Basquete;

/**
 *
 * @author 363707
 */
public class Administrador {
    private String nome;
    private Torneio torneio;
    private Treinador treinador;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Torneio getTorneio() {
        return torneio;
    }

    public void setTorneio(Torneio torneio) {
        this.torneio = torneio;
    }

    public Treinador getTreinador() {
        return treinador;
    }

    public void setTreinador(Treinador treinador) {
        this.treinador = treinador;
    }
    
    public Administrador(String nome, Torneio torneio, Treinador treinador){
        this.nome=nome;
        this.torneio=torneio;
        this.treinador=treinador;        
    }
    
    @Override
    public String toString(){
        return  "\n Nome:" + getNome()+
                "\n Torneio:" + getTorneio()+
                "\n Treinador:" + getTreinador();        
    }
}
