package bataille;

/* TODO Écrivez la classe Bataille
0-Attributs: suivre à la lettre les indications du diagramme UML de classes
1- Constructeur:		en plus d'initialiser les attributs, ici, le constructeur distribue une carte à chaque joueur.
2- Méthode distribue:
		donne une carte à chaque joueur. Attention, cette méthode doit vérifier que les joueurs		n'ont pas la même carte: elle re-tire une carte au hasard, tant que les 2 cartes sont les même.
3- Méthode gagnant:
		Renvoie la référence vers le joueur qui a la carte de plus haute valeur. Renvoie null s'il y a bataille.
		Tip: Pour récupérer la valeur (ordre dans lequel est classé une constante dans une énumération), vous pouvez utiliser enum.ordinal où enum est une référence vers une valeur d'énumération.
*/
// 

/**
 * Bataille
 */
public class Bataille {
	Joueur joueurGauche;
	Joueur joueurDroite;

	 Bataille(String leftPlayer, String rightPlayer) {
		Joueur j1 = new Joueur(leftPlayer);
		Joueur j2 = new Joueur(rightPlayer);
		j1.nom = leftPlayer;
		j2.nom = rightPlayer;

		this.joueurGauche = j1;
		this.joueurDroite = j2;

		this.distribue();
	}

	public void distribue() {
		Carte leftCard = new Carte();
		this.joueurGauche.donnerCarte(leftCard);

		Carte righCard = new Carte();
		while (righCard.egale(leftCard)) {
			righCard = new Carte();
		}

		this.joueurDroite.donnerCarte(righCard);

	}

	public Joueur gagnant() {
		if (joueurGauche.carte.valeur.ordinal() > joueurDroite.carte.valeur.ordinal())
			return joueurGauche;

		else if (joueurGauche.carte.valeur.ordinal() < joueurDroite.carte.valeur.ordinal())
			return joueurDroite;
		else
			return null;
	}
}
