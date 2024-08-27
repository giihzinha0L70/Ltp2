package Basquete;

/**
 *
 * @author 363707
 */
public class Testa {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Administrador A = new Administrador("Giovanna Gomes", 
                            new Torneio("02.09.24", 
                                    new Partidas("primeira semana do mês nove", "todos os jogos serão no horário matutino", 
                                            new Quadra("Quadra central"), 
                                            new Equipe("Moveon", 
                                                    new Jogador("Aline P.", 19), 
                                                    new Treinador("Macos Vinicius", 
                                                            new Estatisticas("Estatística Descritiva do Treinador", 180))), 
                                            new Arbitragem (4))), 
                            new Treinador ("Macos Vinicius", 
                                    new Estatisticas("Estatística Descritiva", 133)));
    System.out.println(A);
    }
    
}
