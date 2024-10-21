
package interfaceMatematica;

/**
 *
 * @author 363707
 */
public class TestaMatematica {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Matematica Mat = new Matematica("Biologia", 80.00, 
                new AplicacaoPratica("", 
                        new Circulo("moeda", 15.0), 
                        new Retangulo("quadro", 0.130, 2.0), 
                        new Quadrado("dado", 0.30)));
        System.out.println(Mat);
    }
    
}
