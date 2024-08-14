
package ModeloHeranca_2024;

/**
 *
 * @author 363707
 */
public class Assado extends Salgado{
    private double tempoDeEspera;
    
    public double getTempoDeEspera() {
        return tempoDeEspera;
    }

    public void setTempoDeEspera(double tempoDeEspera) {
        this.tempoDeEspera = tempoDeEspera;
    }
    
    public Assado(String dataFabricacao, String dataValidade, int codigo, String nome, double quantidade, double tempoDeEspera){
        super(dataFabricacao, dataValidade, codigo, nome, quantidade);
        this.tempoDeEspera = tempoDeEspera;
        
    }
    
    @Override
    public String toString(){
        return"--- PÃO DE SAL ---"+
                "\nDataFabricacao: "+getDataFabricacao ()+
                "\nDataValidade: "+getDataValidade ()+
                "\nCodigo: "+getCodigo ()+
                "\nNome: "+getNome ()+
                "\nQuantidade: "+getQuantidade ();        
    }
}
