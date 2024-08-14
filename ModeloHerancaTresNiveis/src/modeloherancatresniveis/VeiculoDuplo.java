
package modeloherancatresniveis;

/**
 *
 * @author 363707
 */
public class VeiculoDuplo extends VeiculoDeCarga{
    private int qtDeEixos;
    
    public int getQtDeEixos() {
        return qtDeEixos;
    }

    public void setQtDeEixos(int qtDeEixos) {
        this.qtDeEixos = qtDeEixos;
    }
    
    public VeiculoDuplo(String chassi, String modelo, Double peso, int qtDeEixos){
        super(chassi, modelo, peso);
        this.qtDeEixos = qtDeEixos;
    }
     public String toString(){
        return"--- VEÍCULO SIMPLES ---"+
                "\nChassi: "+getChassi()+
                "\nModelo: "+getModelo()+
                "\nPeso: "+getPeso()+
                "\nQtDeEixos: "+getQtDeEixos();
    }
        
}

