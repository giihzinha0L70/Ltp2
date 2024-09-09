
package ModeloFarmacia;

/**
 *
 * @author 363707
 */
public class Atendente extends Funcionario{
    private int idade;
    private Pedido pedido;

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public Pedido getPedido() {
        return pedido;
    }

    public void setPedido(Pedido pedido) {
        this.pedido = pedido;
    }
    
    public Atendente(int matricula, String nome, Double salario, int idade, Pedido pedido){
        super(matricula, nome, salario);
        this.idade=idade;
        this.pedido=pedido;
    }
    
    @Override
    public String toString(){
        return  "\n Matrícula:" + getMatricula()+
                "\n Nome:" + getNome()+
                "\n Salário:" + getSalario()+
                "\n Idade:" + getIdade()+
                "\n Pedido:" + getPedido();
    }
}
