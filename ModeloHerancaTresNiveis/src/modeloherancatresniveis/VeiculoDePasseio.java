
package modeloherancatresniveis;

/**
 *
 * @author 363707
 */
public class VeiculoDePasseio extends Veiculo{
    private int ano;
    
    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }
    
    public VeiculoDePasseio( String chassi, String modelo, int ano){
        super(chassi, modelo);
        this.ano = ano;
         
    }
}
