
package modeloherancatresniveis;

/**
 *
 * @author 363707
 */
public class Testa {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        VeiculoSimples S = new VeiculoSimples("G1224H38", "Caminhão", 90.5, 70.2);
        System.out.println(S);
        
        VeiculoDuplo D = new VeiculoDuplo("G1224H38", "Caminhão", 90.5, 70);
        System.out.println(D);
        
        VeiculoGol G = new VeiculoGol("G1224H38", "Carro", 60, 80);
        System.out.println(G);
        
        VeiculoMoto M = new VeiculoMoto("G1224H38", "X99", "LOGR-698", 250.0);
        System.out.println(M);
    }
    
}
