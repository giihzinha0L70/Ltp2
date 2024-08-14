
package modeloherancatresniveis;

/**
 *
 * @author 363707
 */
public class VeiculoMoto extends VeiculoDeDuasRodas {
    private Double cilindrada;
    
    public Double getCilindrada() {
        return cilindrada;
    }

    public void setCilindrada(Double cilindrada) {
        this.cilindrada = cilindrada;
    }
    public VeiculoMoto (String chassi, String modelo, String placa, Double cilindrada){
        super(chassi, modelo, placa);
        this.cilindrada = cilindrada;
        
    }
   public String toString(){
       return"--- VEÍCULO SIMPLES ---"+
                "\nChassi: "+getChassi()+
                "\nModelo: "+getModelo()+
                "\nPlaca: "+getPlaca()+
                "\nCilindrada: "+getCilindrada();
   }
}
