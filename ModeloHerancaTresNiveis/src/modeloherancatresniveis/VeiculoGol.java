
package modeloherancatresniveis;

/**
 *
 * @author 363707
 */
public class VeiculoGol extends VeiculoDePasseio{
    private int qtDePortas;
    
    public int getQtDePortas() {
        return qtDePortas;
    }

    public void setQtDePortas(int qtDePortas) {
        this.qtDePortas = qtDePortas;
    }
    public VeiculoGol(String chassi, String modelo, int ano, int qtDePortas){
        super(chassi, modelo, ano);
        this.qtDePortas = qtDePortas;
        
    }
    public String toString(){
    return"--- VEÍCULO SIMPLES ---"+
                "\nChassi: "+getChassi()+
                "\nModelo: "+getModelo()+
                "\nAno: "+getAno()+
                "\nQtDePortas: "+getQtDePortas();
    }
        
}
