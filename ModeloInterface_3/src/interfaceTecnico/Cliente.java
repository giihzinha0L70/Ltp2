
package interfaceTecnico;

/**
 *
 * @author 363707
 */
public class Cliente extends Pessoa{
    private Double horasGastas;
    protected static int qtdPaginaImpressa;
    private Internet internet;
    private Impressao impressao;

    public Double getHorasGastas() {
        return horasGastas;
    }

    public void setHorasGastas(Double horasGastas) {
        this.horasGastas = horasGastas;
    }

    public int getQtdPaginaImpressa() {
        return qtdPaginaImpressa;
    }

    public void setQtdPaginaImpressa(int qtdPaginaImpressa) {
        this.qtdPaginaImpressa = qtdPaginaImpressa;
    }

    public Internet getInternet() {
        return internet;
    }

    public void setInternet(Internet internet) {
        this.internet = internet;
    }

    public Impressao getImpressao() {
        return impressao;
    }

    public void setImpressao(Impressao impressao) {
        this.impressao = impressao;
    }
    
    public Cliente(String cpf, String nome, Endereco endereco, Double horasGastas, int qtdPaginaImpressa, Internet internet, Impressao impressao){
        super(cpf, nome, endereco);
        this.horasGastas=horasGastas;
        this.qtdPaginaImpressa=qtdPaginaImpressa;
        this.internet=internet;
        this.impressao=impressao;
    }
    
    @Override
    public String toString(){
        return  "\nCPF:"+ getCpf()+
                "\nNome:"+ getNome()+
                "\nEndereço:"+ getEndereco()+
                "\nHoras Gastas:"+ getHorasGastas()+
                "\nQuantidade de Páginas Impressas:"+ getQtdPaginaImpressa()+
                "\nInternet:"+ getInternet()+
                "\nImpressão:"+ getImpressao();
    }
}
