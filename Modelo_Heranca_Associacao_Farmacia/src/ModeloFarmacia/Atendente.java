
package ModeloFarmacia;

/**
 *
 * @author 363707
 */
public class Atendente extends Funcionario{
    private int idade;

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }
    
    public Atendente(int matricula, String nome, Double salario, int idade){
        super(matricula, nome, salario);
        this.idade=idade;
    }
    
    @Override
    public String toString(){
        return  "\n Matrícula:" + getMatricula()+
                "\n Nome:" + getNome()+
                "\n Salário:" + getSalario()+
                "\n Idade:" + getIdade();
    }
}
