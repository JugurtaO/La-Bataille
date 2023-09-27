package bataille;

/**
 * testBataille
 */
public class testBataille {

    public static void main(String[] args) {
        Bataille bataille= new Bataille("Jugurta", "Nils");

        System.out.println("Player 1 :" + bataille.joueurGauche.nom +"|"+ bataille.joueurGauche.carte.toString() );
        System.out.println("Player 2 :" + bataille.joueurDroit.nom  +"|"+ bataille.joueurDroit.carte.toString() );
        Joueur gagnant= bataille.gagnant();

        if(gagnant!=null)
            System.out.println("Gagant :"+ bataille.gagnant().nom);
        else
            System.out.println("Bataille !!!! ");
    }
}