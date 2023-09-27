package bataille;

/* TODO Écrivez la classe Joueur
0- Attributs: se reporter au diagramme Uml de Classe.
1- Constructeurs: à l'initialisation, la carte d'un joueur est null
2- Méthode donnerCarte: on fait ici l'affectation des références, pas de copie
3- Méthode joue: le joueur renvoie sa carte, mais ne l'efface pas (ne change pas l'attribut carte).
4- Méthode getNom(): idem que joue...*/
// 


/**
 * Joueur
 */
public class Joueur {

    String nom;
    Carte carte;


    public Joueur(String nom){
        this.carte=null;
        this.nom=nom;
    }
    
    public void donnerCarte(Carte card){
        this.carte=card;
    }

    public Carte joue(){
        return this.carte;
    }

    public String getNom(){
        return this.nom;
    }
}
