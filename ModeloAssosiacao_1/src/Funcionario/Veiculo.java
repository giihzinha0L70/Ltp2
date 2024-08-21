
package Funcionario;

/**
 *
 * @author 363707
 */
public class Veiculo {
    private String modelo;
    private Porta porta;

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public Porta getPorta() {
        return porta;
    }

    public void setPorta(Porta porta) {
        this.porta = porta;
    }
    
    public Veiculo(String modelo, Porta porta){
        this.modelo=modelo;
        this.porta=porta;        
    }
    
    @Override
    public String toString(){
        return  "\n Modelo:" + getModelo()+
                "\n Porta:" + getPorta();
        
    }
}
