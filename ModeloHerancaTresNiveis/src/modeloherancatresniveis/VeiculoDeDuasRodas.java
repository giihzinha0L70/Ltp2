
package modeloherancatresniveis;

/**
 *
 * @author 363707
 */
public class VeiculoDeDuasRodas extends Veiculo{
    private String placa;
    
    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }
    public VeiculoDeDuasRodas(String chassi, String modelo, String placa){
        super(chassi, modelo);
        this.placa = placa;
    }
}
