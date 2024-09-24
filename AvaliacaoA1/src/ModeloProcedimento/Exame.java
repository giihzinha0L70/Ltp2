
package ModeloProcedimento;

/**
 *
 * @author yurif
 */
public class Exame extends Procedimento{
    private String data;
    private Consultorio consultorio;

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public Consultorio getConsultorio() {
        return consultorio;
    }

    public void setConsultorio(Consultorio consultorio) {
        this.consultorio = consultorio;
    }
    
    public Exame(int numero, String descricao, double valor, String data, Consultorio consultorio){
        super(numero, descricao, valor);
        this.data=data;
        this.consultorio=consultorio;
    }
    
    @Override
    public String toString(){
        return  "\n --- Sobre o Exame ---"+
                "\n Número:" + getNumero()+
                "\n Descrição:" + getDescricao()+
                "\n Valor:" + getValor()+
                "\n Data:" + getData()+
                "\n Consultório:" + getConsultorio();
    }
}
