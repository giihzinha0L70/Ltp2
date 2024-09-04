
package ModeloFuncionario;

/**
 *
 * @author 363707
 */
public class Tecnico extends Efetivo{
    private String setor;
    private double auxTransporte;

    public String getSetor() {
        return setor;
    }

    public void setSetor(String setor) {
        this.setor = setor;
    }

    public double getAuxTransporte() {
        return auxTransporte;
    }

    public void setAuxTransporte(double auxTransporte) {
        this.auxTransporte = auxTransporte;
    }
    
    public Tecnico(String nome, Formacao formacao, Endereco endereco, double salario, String setor, double auxTransporte){
        super(nome, formacao, endereco, salario);
        this.setor=setor;
        this.auxTransporte=auxTransporte;
    }
    
    @Override
    public String toString(){
        return  "\n Nome:" + getNome()+
                "\n Formação:" + getFormacao()+
                "\n Endereço:" + getEndereco()+
                "\n Salário:" + getSalario()+
                "\n Setor:" + getSetor()+
                "\n Auxiliar de Transporte:" + getAuxTransporte();
    }
}
