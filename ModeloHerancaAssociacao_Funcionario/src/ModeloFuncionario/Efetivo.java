
package ModeloFuncionario;

/**
 *
 * @author 363707
 */
public class Efetivo extends Funcionario{
    private double salario;
    private OrgaoPublico orgaoPublico;
    
    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public OrgaoPublico getOrgaoPublico() {
        return orgaoPublico;
    }

    public void setOrgaoPublico(OrgaoPublico orgaoPublico) {
        this.orgaoPublico = orgaoPublico;
    }
    
    public Efetivo(String nome, Formacao formacao, Endereco endereco, double salario){
        super(nome, formacao, endereco);
        this.salario=salario;        
    }
    
    @Override
    public String toString(){
        return  "\n Nome:" + getNome()+
                "\n Formação:" + getFormacao()+
                "\n Endereço:" + getEndereco()+
                "\n Salário do Funcionário:" + getSalario();
    }

}
