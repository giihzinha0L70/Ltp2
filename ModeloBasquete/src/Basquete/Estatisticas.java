
package Basquete;

/**
 *
 * @author 363707
 */
public class Estatisticas {
    private String tipo;
    private int valor;

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }
    
    public Estatisticas(String tipo, int valor){
        this.tipo=tipo;
        this.valor=valor;        
    }
    
    @Override
    public String toString(){
        return  "\n Tipo:" + getTipo()+
                "\n Valor:" + getValor();
    }
}
