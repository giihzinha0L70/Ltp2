
package ModeloFuncionario;

/**
 *
 * @author 363707
 */
public class TestaFuncionario {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Analista A = new Analista("Maria Flor", 
            new Formacao ("Aprende rápido e é eficaz"), 
            new Endereco ("Pinheiros", 23), 3000, "Pesquisadora", 1800);
        System.out.println(A);
        
        Tecnico T = new Tecnico("João Pedro Nunes", 
                new Formacao ("Rápido e prático"), 
                new Endereco ("Rua das Graças", 44), 2505, "Suporte Técnico", 2500);
        System.out.println(T);
        
        Terceirizado Ter = new Terceirizado("Detran", 
                new Formacao("Ágil"), 
                new Endereco ("Postes Iluminados", 01), "Assistência"); 
        System.out.println(Ter);
    }    
}
