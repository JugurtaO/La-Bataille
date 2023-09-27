package bataille;
/**
 * testCarte
 */
public class testCarte {

    public static void main(String[] args) {
    Carte currentCard=new Carte();
       System.out.print("Current Card : " +currentCard.toString());
       System.out.println ("  | " +currentCard.getFichierImage());


       Carte newCard= new Carte(Couleur.CARREAU,Valeur.ROI);
       System.out.print("Selected Card : "+newCard.toString());
       System.out.println("  | " +newCard.getFichierImage());

     System.out.println("Are the two cards equal :" + newCard.egale(currentCard));
  
    }
}