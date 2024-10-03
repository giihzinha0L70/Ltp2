
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
    
    public Atendente(){
        
    }
}
