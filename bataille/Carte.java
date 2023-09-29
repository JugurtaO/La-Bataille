package bataille;

import java.text.Normalizer;
import java.util.Random;
import java.util.regex.Pattern;


/**
 * Classe Carte.
 *
 * 0- Attributs:
 * 		se repporter au diagramme UML de classes  pour le nom et le type des attributs
 *
 * 1- Constructeurs:
 * Le constructeur par défaut de la classe carte choisi
 * une couleur au hasard parmi les couleurs possibles et une
 * valeur au hasard parmi les valeurs possibles.
 * Note: pour choisir une valeur entre 0 et 1, vous pouvez utiliser la méthode Math.random()
 * Note: pour connaître toutes les valeur possibles d'une énumeration Enum, vous pouvez utiliser
 * Enum[] valeursPossiblesDeEnum = Enum.values();
 *
 * Le constructeur qui prend 2 paramètres, affecte les références passées en paramètre sans les copier.
 *
 *  2- méthode toString
 *  Renvoie une chaîne de caractère sous la forme: "As de trèfle" ou "Roi de coeur".
 *
 *  3- méthode egale
 *  Renvoie vrai si la carte courante et la carte passée en paramètre ont la
 *  même couleur et la même valeur. renvoie faux sinon.
 *
 *  4- méthode getFichierImage
 *  Renvoie une chaîne de caractères coforme aux noms des fichiers des images dans le répertoire "images".
 *  Attention, la chaîne de caractères est sans accents et avec l'extension.
 *
 * *
 * @author cfouard
 */
public class Carte {

    Couleur couleur;
    Valeur valeur;


    Carte(){
        Random rand=new Random();
        Couleur[] colors=Couleur.values();
        Valeur[] values=Valeur.values();

        int colorIndex= rand.nextInt(colors.length );
        int valueIndex=rand.nextInt(values.length );

        this.couleur=colors[colorIndex];
        this.valeur=values[valueIndex];
    }


    Carte(Valeur valeur ,Couleur couleur){
        this.couleur=couleur;
        this.valeur=valeur;

    }

    public String toString(){
        return this.valeur.getNom()+" de " + this.couleur.getNom();
    }



    public boolean egale(Carte carte){
        return carte.couleur==this.couleur && carte.valeur==this.valeur;
    }

    public String getCouleur() {
        return this.couleur.getNom();
    }


    public String getValeur() {
        return this.valeur.getNom();
    }


    public String getFichierImage(){
        return sansAccent(this.valeur.getNom()+"-de-" + this.couleur.getNom()+".png");
    }

    /**
     * Ne PAS modifier cette méthode.
     * Vous pouvez l'utiliser dans d'autres méthodes de la classe Carte.
     * @param s
     * @return
     */
    String sansAccent(String s) {
        String strTemp = Normalizer.normalize(s, Normalizer.Form.NFD);
        Pattern pattern = Pattern.compile("\\p{InCombiningDiacriticalMarks}+");
        return pattern.matcher(strTemp).replaceAll("");
    }
}
