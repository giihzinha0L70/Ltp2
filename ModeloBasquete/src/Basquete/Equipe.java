
package Basquete;

/**
 *
 * @author 363707
 */
public class Equipe {
    private String nome;
    private Jogador jogador;
    private Treinador treinador;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Jogador getJogador() {
        return jogador;
    }

    public void setJogador(Jogador jogador) {
        this.jogador = jogador;
    }

    public Treinador getTreinador() {
        return treinador;
    }

    public void setTreinador(Treinador treinador) {
        this.treinador = treinador;
    }
    
     
    public Equipe(String nome, Jogador jogador, Treinador treinador){
        this.nome=nome;
        this.jogador=jogador;
        this.treinador=treinador;
    }
    
    @Override
    public String toString(){
        return  "\n Nome:" + getNome()+
                "\n Jogador:" + getJogador()+
                "\n Treinador:" + getTreinador();        
    }
}
