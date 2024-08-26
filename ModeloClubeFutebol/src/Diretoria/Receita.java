
package Diretoria;

/**
 *
 * @author 363707
 */
public class Receita {
    private Double transferencia;
    private Double contrato;

    public Double getTransferencia() {
        return transferencia;
    }

    public void setTransferencia(Double transferencia) {
        this.transferencia = transferencia;
    }

    public Double getContrato() {
        return contrato;
    }

    public void setContrato(Double contrato) {
        this.contrato = contrato;
    }
    
    public Receita(Double transferencia, Double contrato){
        this.transferencia=transferencia;
        this.contrato=contrato;
    }
    
    @Override
    public String toString(){
        return  "\n Transferência:" + getTransferencia()+
                "\n Contrato:" + getContrato();
        
    }
}
