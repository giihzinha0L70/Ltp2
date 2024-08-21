
package Livro;

/**
 *
 * @author 363707
 */
public class Testa {

    public static void main(String[] args) {
        Livro L = new Livro("A menina que não sabia ler", 116, 
                       new Edicao (1, 2024, 
                               new Patrocinador ("Bella Livraria", 
                                       new Endereco ("Mansões Por do Sol", 22), 
                                       new Editora ("A4B2-00", "Editora Moderna", 
                                               new Endereco ("Mansões Por do Sol", 22)))));
        System.out.println(L);
    }
}
