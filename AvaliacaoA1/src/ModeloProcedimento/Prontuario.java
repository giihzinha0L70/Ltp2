
package ModeloProcedimento;

/**
 *
 * @author yurif
 */
public class Prontuario {
    private int numero;
    private Medico medico;

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public Medico getMedico() {
        return medico;
    }

    public void setMedico(Medico medico) {
        this.medico = medico;
    }
    
     public Prontuario(int numero, Medico medico){
        this.numero=numero;
        this.medico=medico;
    }
    
    @Override
    public String toString(){
        return  "\n Número:" + getNumero()+
                "\n Médico:" + getMedico();
    }
}
