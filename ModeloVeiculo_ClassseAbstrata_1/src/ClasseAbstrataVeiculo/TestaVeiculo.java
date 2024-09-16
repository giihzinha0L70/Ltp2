
package ClasseAbstrataVeiculo;

/**
 *
 * @author 363707
 */
public class TestaVeiculo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        DePasseio DP = new DePasseio("", 2014, "", 2200.00, 
                new Proprietario("", "", 
                        new Endereco("", 7)), "", "", 
                new Montadora("", "", 
                        new Endereco("", 7)));
        System.out.println(DP);
        
    }
    
}
