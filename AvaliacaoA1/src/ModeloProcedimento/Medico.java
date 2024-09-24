
package ModeloProcedimento;

/**
 *
 * @author yurif
 */
public class Medico extends Pessoa{
    private String crm;
    private String especialidade;
    private Medicacao medicacao;
    private Exame exame;
    private Consulta consulta;

    public String getCrm() {
        return crm;
    }

    public void setCrm(String crm) {
        this.crm = crm;
    }

    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }

    public Medicacao getMedicacao() {
        return medicacao;
    }

    public void setMedicacao(Medicacao medicacao) {
        this.medicacao = medicacao;
    }

    public Exame getExame() {
        return exame;
    }

    public void setExame(Exame exame) {
        this.exame = exame;
    }

    public Consulta getConsulta() {
        return consulta;
    }

    public void setConsulta(Consulta consulta) {
        this.consulta = consulta;
    }
    
    public Medico(String cpf, String nome, String crm, String especialidade, Medicacao medicacao, Exame exame, Consulta consulta){
        super(cpf, nome);
        this.crm=crm;
        this.especialidade=especialidade;
        this.medicacao=medicacao;
        this.exame=exame;
        this.consulta=consulta;
    }
    
    @Override
    public String toString(){
        return  "\n --- Informações do Médico ---"+
                "\n CPF:" + getCpf()+
                "\n Nome:"+ getNome()+
                "\n Gestão de Relacionamento com o Cliente (CRM):" + getCrm()+
                "\n Especialidade:" + getEspecialidade()+
                "\n Medicação:" + getMedicacao()+
                "\n Exame:" + getExame()+
                "\n Consulta:" + getConsulta();
    }
}
