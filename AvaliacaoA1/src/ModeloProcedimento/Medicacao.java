
package ModeloProcedimento;

/**
 *
 * @author yurif
 */
public class Medicacao extends Procedimento{
    private String finalidade;
    private double dosagem;
    private Medicamento medicamento;

    public String getFinalidade() {
        return finalidade;
    }

    public void setFinalidade(String finalidade) {
        this.finalidade = finalidade;
    }

    public double getDosagem() {
        return dosagem;
    }

    public void setDosagem(double dosagem) {
        this.dosagem = dosagem;
    }

    public Medicamento getMedicamento() {
        return medicamento;
    }

    public void setMedicamento(Medicamento medicamento) {
        this.medicamento = medicamento;
    }
    
    public Medicacao(int numero, String descricao, double valor, String finalidade, double dosagem, Medicamento medicamento){
        super(numero, descricao, valor);
        this.finalidade=finalidade;
        this.dosagem=dosagem;
        this.medicamento=medicamento;
    }
    
    @Override
    public String toString(){
        return  "\n Número:" + getNumero()+
                "\n Descrição:" + getDescricao()+
                "\n Valor:" + getValor()+
                "\n Finalidade:" + getFinalidade()+
                "\n Dosagem:" + getDosagem()+
                "\n Medicamento:" + getMedicamento();
    }
}
