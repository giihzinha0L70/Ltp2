
package ModeloFarmacia;

/**
 *
 * @author 363707
 */
public class Receita {
    private String data;
    private Double valor;
    private Farmaceutico farmaceutico;
    private Medicamento medicamento;
    
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

    public Medicamento getMedicamento() {
        return medicamento;
    }

    public void setMedicamento(Medicamento medicamento) {
        this.medicamento = medicamento;
    }
    
     public Receita(String data, Double valor, Farmaceutico farmaceutico, Medicamento medicamento){
        this.data=data;
        this.valor=valor;
        this.farmaceutico=farmaceutico;
        this.medicamento=medicamento;
    }
     
    @Override
    public String toString(){
        return  "\n Data:" + getData()+
                "\n Valor:" + getValor()+
                "\n Farmaceutico:" + getFarmaceutico()+
                "\n Medicamento:" + getMedicamento();
    } 

}
