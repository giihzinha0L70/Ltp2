
package ModeloFarmacia;

/**
 *
 * @author 363707
 */
public class Pagamento {
    private String forma;

    public String getForma() {
        return forma;
    }

    public void setForma(String forma) {
        this.forma = forma;
    }
    
    public Pagamento(String forma){
        this.forma=forma;        
    }
    @Override
    public String toString(){
        return  "\n Forma de Pagamento:" + getForma();
    }
}
