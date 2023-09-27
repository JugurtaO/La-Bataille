package bataille;

/**
 * testJoueur
 */
public class testJoueur {

    public static void main(String[] args) {
        Joueur player1 = new Joueur("Henry");
        Joueur player2 = new Joueur("Jugurta");
        Joueur player3 = new Joueur("Stéphan");
        Joueur player4 = new Joueur("Julia");
        Joueur player5 = new Joueur("Sarah");

        System.out.println("Player1 : " + player1.getNom());
        System.out.println("Player2 : " + player2.getNom());
        System.out.println("Player3 : " + player3.getNom());
        System.out.println("Player4 : " + player4.getNom());
        System.out.println("Player5 : " + player5.getNom());

    }
}