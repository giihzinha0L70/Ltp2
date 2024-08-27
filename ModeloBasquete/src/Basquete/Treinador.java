
package Basquete;

/**
 *
 * @author 363707
 */
public class Treinador {
    private String nome;
    private Estatisticas estatisticas;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Estatisticas getEstatisticas() {
        return estatisticas;
    }

    public void setEstatisticas(Estatisticas estatisticas) {
        this.estatisticas = estatisticas;
    }
    
    public Treinador(String nome, Estatisticas estatisticas){
        this.nome=nome;
        this.estatisticas=estatisticas;
    }
    
    @Override
    public String toString(){
        return  "\n Nome:" + getNome()+
                "\n Estatísticas:" + getEstatisticas();
    }
}
