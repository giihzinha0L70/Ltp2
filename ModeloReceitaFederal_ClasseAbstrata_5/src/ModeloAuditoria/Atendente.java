
package ModeloAuditoria;

/**
 *
 * @author 363707
 */
public class Atendente extends Funcionario{
    private String setor;
    private Fisica fisica;

    public String getSetor() {
        return setor;
    }

    public void setSetor(String setor) {
        this.setor = setor;
    }

    public Fisica getFisica() {
        return fisica;
    }

    public void setFisica(Fisica fisica) {
        this.fisica = fisica;
    }
    
    public Atendente(int matricula, String nome, Double salario, Endereco endereco, String setor, Fisica fisica){
        super(matricula, nome, salario, endereco);
        this.setor=setor;
        this.fisica=fisica;
    }
    
    @Override
    public String toString(){
        return  "\nMatrícula:" + getMatricula()+
                "\nNome:" + getNome()+
                "\nSalário:" + getSalario()+
                "\nEndereço:" + getEndereco()+
                "\nSetor:" + getSetor()+
                "\nFísica:" + getFisica();
    }
}
