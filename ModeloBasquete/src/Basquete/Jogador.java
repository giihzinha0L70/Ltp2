
package Basquete;

/**
 *
 * @author 363707
 */
public class Jogador {
    private String nome;
    private int idade;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }
    
    public Jogador(String nome, int idade){
        this.nome=nome;
        this.idade=idade;        
    }
    
    @Override
    public String toString(){
        return  "\n Nome:" + getNome()+
                "\n Idade:" + getIdade();
    }
}
