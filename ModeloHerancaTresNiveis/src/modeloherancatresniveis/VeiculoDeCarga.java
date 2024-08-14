
package modeloherancatresniveis;

/**
 *
 * @author 363707
 */
public class VeiculoDeCarga extends Veiculo{
    private Double peso;

    public Double getPeso() {
        return peso;
    }

    public void setPeso(Double peso) {
        this.peso = peso;
    }
  public VeiculoDeCarga(String chassi, String modelo, Double peso){
      super(chassi, modelo);
      this.peso = peso;
      
  } 
}
