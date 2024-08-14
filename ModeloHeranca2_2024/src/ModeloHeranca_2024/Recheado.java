
package ModeloHeranca_2024;

/**
 *
 * @author 363707
 */
public class Recheado extends DeDoce{
    private String descricaoRecheio;
   
    public String getDescricaoRecheio() {
        return descricaoRecheio;
    }

    public void setDescricaoRecheio(String descricaoRecheio) {
        this.descricaoRecheio = descricaoRecheio;
    }
    
    public Recheado(String dataFabricacao, String dataValidade, int codigo,String tempoFermentacao, String descricao, String descricaoRecheio){
        super(dataFabricacao, dataValidade, codigo, tempoFermentacao, descricao);
        this.descricaoRecheio = descricaoRecheio;
        
    }
    
    @Override
    public String toString(){
        return"--- PÃO DE SAL ---"+
                "\nDataFabricacao: "+getDataFabricacao ()+
                "\nDataValidade: "+getDataValidade ()+
                "\nCodigo: "+getCodigo ()+
                "\nTempoFermentacao: "+getTempoFermentacao ()+
                "\nDescricao: "+getDescricao ()+
                "\nDescricaoRecheio: "+getDescricaoRecheio ();                
    }

}