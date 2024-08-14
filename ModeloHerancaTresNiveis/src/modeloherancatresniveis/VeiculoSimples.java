
package modeloherancatresniveis;

/**
 *
 * @author 363707
 */
public class VeiculoSimples extends VeiculoDeCarga {
    private Double comprimento;

    public Double getComprimento() {
        return comprimento;
    }

    public void setComprimento(Double comprimento) {
        this.comprimento = comprimento;
    }
    public VeiculoSimples (String chassi, String modelo, Double peso, Double comprimento){
        super(chassi, modelo, peso);
        this.comprimento = comprimento;
        
    }
    public String toString(){
        return"--- VEÍCULO SIMPLES ---"+
                "\nChassi: "+getChassi()+
                "\nModelo: "+getModelo()+
                "\nPeso: "+getPeso()+
                "\nComprimento: "+getComprimento();
        
    }
        
}
