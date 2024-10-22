
package interfaceTecnico;

/**
 *
 * @author 363707
 */
public class Tecnico extends Pessoa implements Salario, HoraExtra{
    private String matr;
    private Double gratificacao;
    private Equipamento equipamento;

    public String getMatr() {
        return matr;
    }

    public void setMatr(String matr) {
        this.matr = matr;
    }

    public Double getGratificacao() {
        return gratificacao;
    }

    public void setGratificacao(Double gratificacao) {
        this.gratificacao = gratificacao;
    }

    public Equipamento getEquipamento() {
        return equipamento;
    }

    public void setEquipamento(Equipamento equipamento) {
        this.equipamento = equipamento;
    }
    
    public Tecnico(String cpf, String nome, Endereco endereco, String matr, Double gratificacao, Equipamento equipamento){
        super(cpf, nome, endereco);
        this.matr=matr;
        this.gratificacao=gratificacao;
        this.equipamento=equipamento;
    }
    
    @Override
    public Double calculaSalario(){
        return(SAL + gratificacao + (QTDHORAEXTRA * VALORHORAEXTRA));
    }
    
    @Override
    public String toString(){
        return  "\nCPF:"+ getCpf()+
                "\nNome:"+ getNome()+
                "\nEndereço:"+ getEndereco()+
                "\nGratificação:"+ getGratificacao()+
                "\nEndereço:"+ getEndereco()+
                "\nSal:"+ SAL+
                "\nQuantidade de Hora Extra:"+ QTDHORAEXTRA+
                "\nValor da Hora Extra:"+ VALORHORAEXTRA;
    }
}
