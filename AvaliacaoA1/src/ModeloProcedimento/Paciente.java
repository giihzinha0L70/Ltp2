
package ModeloProcedimento;

/**
 *
 * @author yurif
 */
public class Paciente extends Pessoa{
    private String endereco;
    private String telefone;
    private Prontuario prontuario;
    private PlanoDeSaude planoDeSaude;

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public Prontuario getProntuario() {
        return prontuario;
    }

    public void setProntuario(Prontuario prontuario) {
        this.prontuario = prontuario;
    }

    public PlanoDeSaude getPlanoDeSaude() {
        return planoDeSaude;
    }

    public void setPlanoDeSaude(PlanoDeSaude planoDeSaude) {
        this.planoDeSaude = planoDeSaude;
    }
    
    public Paciente(String cpf, String nome, String endereco, String telefone, Prontuario prontuario, PlanoDeSaude planoDeSaude){
        super(cpf, nome);
        this.endereco=endereco;
        this.telefone=telefone;
        this.prontuario=prontuario;
        this.planoDeSaude=planoDeSaude;
    }
    
    @Override
    public String toString(){
        return  "\n --- Informações do Paciênte ---"+
                "\n CPF:" + getCpf()+
                "\n Nome:" + getNome()+
                "\n Endereço:" + getEndereco()+
                "\n Telefone:" + getTelefone()+
                "\n Prontuário:" + getProntuario()+
                "\n Plano de Saúde:" + getPlanoDeSaude();
    }
}
