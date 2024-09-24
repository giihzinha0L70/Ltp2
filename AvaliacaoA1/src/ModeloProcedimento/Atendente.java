
package ModeloProcedimento;

/**
 *
 * @author yurif
 */
public class Atendente extends Pessoa{
    private int matr;
    private double salario;
    private Consulta consulta;

    public int getMatr() {
        return matr;
    }

    public void setMatr(int matr) {
        this.matr = matr;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public Consulta getConsulta() {
        return consulta;
    }

    public void setConsulta(Consulta consulta) {
        this.consulta = consulta;
    }
    
    public Atendente(String cpf, String nome, int matr, double salario, Consulta consulta){
        super(cpf, nome);
        this.matr=matr;
        this.salario=salario;
        this.consulta=consulta;
    }
    
    @Override
    public String toString(){
        return  "\n --- Informações do Atendente ---"+
                "\n CPF:" + getCpf()+
                "\n Nome:" + getNome()+
                "\n Matrícula:" + getMatr()+
                "\n Salário:" + getSalario()+
                "\n Consulta:" + getConsulta();
    }
}
