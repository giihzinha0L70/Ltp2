
package Basquete;

/**
 *
 * @author 363707
 */
public class Arbitragem {
    private int qtDeArbitros;

    public int getQtDeArbitros() {
        return qtDeArbitros;
    }

    public void setQtDeArbitros(int qtDeArbitros) {
        this.qtDeArbitros = qtDeArbitros;
    }
    
    public Arbitragem(int qtDeArbitros){
        this.qtDeArbitros=qtDeArbitros;
    }
    
    @Override
    public String toString(){
        return  "\n Quantidade de Árbitros:" + getQtDeArbitros();
    }
}
