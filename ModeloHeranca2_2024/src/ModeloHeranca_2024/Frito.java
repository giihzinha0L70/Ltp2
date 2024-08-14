
package ModeloHeranca_2024;

/**
 *
 * @author 363707
 */
public class Frito extends Salgado{
    private String tipoDaMassa;
    
    public String getTipoDaMassa() {
        return tipoDaMassa;
    }

    public void setTipoDaMassa(String tipoDaMassa) {
        this.tipoDaMassa = tipoDaMassa;
    }
    
    public Frito(String dataFabricacao, String dataValidade, int codigo, String nome, double quantidade, String tipoDaMassa){
        super(dataFabricacao, dataValidade, codigo, nome, quantidade);
        this.tipoDaMassa = tipoDaMassa;
        
    }
    
    @Override
    public String toString(){
        return"--- PÃO DE SAL ---"+
                "\nDataFabricacao: "+getDataFabricacao ()+
                "\nDataValidade: "+getDataValidade ()+
                "\nCodigo: "+getCodigo ()+
                "\nNome: "+getNome ()+
                "\nQuantidade: "+getQuantidade ()+
                "\nTipoDaMassa: "+getTipoDaMassa ();
    }
}
