
package ModeloHeranca_2024;

/**
 *
 * @author 363707
 */
public class DeSal extends Pao{
    private int quantidade;
    private double tempoParaAssar;
    
    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public double getTempoParaAssar() {
        return tempoParaAssar;
    }

    public void setTempoParaAssar(double tempoParaAssar) {
        this.tempoParaAssar = tempoParaAssar;
    }
    
    public DeSal(String dataFabricacao, String dataValidade, int codigo,String tempoFermentacao, int quantidade, double tempoParaAssar){
        super(dataFabricacao, dataValidade, codigo, tempoFermentacao);
        this.quantidade = quantidade;
        this.tempoParaAssar = tempoParaAssar;
    
    }
    
    @Override
    public String toString(){
        return"--- PÃO DE SAL ---"+
                "\nDataFabricacao: "+getDataFabricacao ()+
                "\nDataValidade: "+getDataValidade ()+
                "\nCodigo: "+getCodigo ()+
                "\nTempoFermentacao: "+getTempoFermentacao ()+
                "\nQuantidade: "+getQuantidade ()+
                "\nTempoParaAssar: "+getTempoParaAssar ();                
        
    }
}
