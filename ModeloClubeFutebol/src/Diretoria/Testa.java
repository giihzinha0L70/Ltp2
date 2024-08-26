package Diretoria;

/**
 *
 * @author 363707
 */
public class Testa {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Diretoria D = new Diretoria("Chief Executive Officer", 
                      new Funcionario("Diretor", "David Ramos de Oliveira", 300.0, 
                                new Treino ("De Segunda à Sábado das 18hrs às 21hrs")),
                      new ComissaoTecnica("Sociedade dos Campeões", "5", 
                                new Treino("De Segunda à Sábado das 18hrs às 21hrs"), 
                                new Elenco("Richarlison", "Atacante", 10.5,
                                        new Treino("De Segunda à Sábado das 18hrs às 21hrs"), 
                                        new Competicao("Copa América", 5)),
                                new Olheiro("Piet de Visser"),
                                new Calendario("Seleção Uruguaia de Futebol", "Bank of America")), 
                      new Receita(10.5, 55.6));
        System.out.println(D);
    }
    
}
