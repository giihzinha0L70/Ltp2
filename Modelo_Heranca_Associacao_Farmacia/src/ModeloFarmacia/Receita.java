
package ModeloFarmacia;

/**
 *
 * @author 363707
 */
public class Receita {
    private String data;
    private Double valor;
    private Farmaceutico farmaceutico;
    
    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public Double getValor() {
        return valor;
    }

    public void setValor(Double valor) {
        this.valor = valor;
    }

    public Farmaceutico getFarmaceutico() {
        return farmaceutico;
    }

    public void setFarmaceutico(Farmaceutico farmaceutico) {
        this.farmaceutico = farmaceutico;
    }
    
     public Receita(String data, Double valor, Farmaceutico farmaceutico){
        this.data=data;
        this.valor=valor;
        this.farmaceutico=farmaceutico;
    }
     
    @Override
    public String toString(){
        return  "\n Data:" + getData()+
                "\n Valor:" + getValor()+
                "\n Farmaceutico:" + getFarmaceutico();
    } 
}
