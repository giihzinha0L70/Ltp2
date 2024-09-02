
package heranaAssociacaoLivro;

/**
 *
 * @author 363707
 */
public class TestaLivro {
    public static void main(String[] args) {
        
        Infantil I = new Infantil("Colori", 
                new Autor ("1010", "João pé de feijão"), 
                new Editora ("Infanti", "Avenida Editorial, 28"), "De zero à cinco anos");
        System.out.println(I);    
        
        Drama D = new Drama("Feito para pintar");
        System.out.println(D);
        
        Suspense S = new Suspense(25);
        System.out.println(S);
    }
    
}
