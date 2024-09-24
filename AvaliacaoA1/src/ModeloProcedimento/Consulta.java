
package ModeloProcedimento;

/**
 *
 * @author yurif
 */
public class Consulta extends Procedimento{
    private String data;
    private String hora;
    private Consultorio consultorio;

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public String getHora() {
        return hora;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }

    public Consultorio getConsultorio() {
        return consultorio;
    }

    public void setConsultorio(Consultorio consultorio) {
        this.consultorio = consultorio;
    }
    
    public Consulta(int numero, String descricao, double valor, String data, String hora, Consultorio consultorio){
        super(numero, descricao, valor);
        this.data=data;
        this.hora=hora;
        this.consultorio=consultorio;
    }
    
    @Override
    public String toString(){
        return  "\n Número:" + getNumero()+
                "\n Descrição:" + getDescricao()+
                "\n Valor:" + getValor()+
                "\n Data:" + getData()+
                "\n Hora:" + getHora()+
                "\n Consultório:" + getConsultorio();
    }
}
