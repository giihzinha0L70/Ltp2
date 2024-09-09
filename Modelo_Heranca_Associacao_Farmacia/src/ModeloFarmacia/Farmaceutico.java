
package ModeloFarmacia;

/**
 *
 * @author 363707
 */
public class Farmaceutico extends Funcionario{
    private String formacao;

    public String getFormacao() {
        return formacao;
    }

    public void setFormacao(String formacao) {
        this.formacao = formacao;
    }
    
    public Farmaceutico(int matricula, String nome, Double salario, String formacao){
        super(matricula, nome, salario);
        this.formacao=formacao;        
    }
    
    @Override
    public String toString(){
        return  "\n Matrícula:" + getMatricula()+
                "\n Nome:" + getNome()+
                "\n Salário:" + getSalario()+
                "\n Formação:" + getFormacao();
    }
}
