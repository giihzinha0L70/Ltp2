
package modeloheranca5_1;

/**
 *
 * @author 363707
 */
public class Cliente extends Pessoa{
    private int idade;

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }
    
    public Cliente(String nome, String endereco, int idade){
    super(nome, endereco);
    this.idade = idade;

    
    }
    
}
