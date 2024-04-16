package fstt.sim.modele;

import java.awt.*;

public abstract class ReglesDuJeu {
    public static final int NBJOUEURS = 8;
    public static final Color COULEUR_GARDIENS = Color.MAGENTA;
    public static final Color COULEUR_EQUIPE_1 = Color.PINK;
    public static final Color COULEUR_EQUIPE_2 = Color.YELLOW;
    public static final Color COULEUR_ARBITRE = Color.BLACK;
    public static final int TAILLE_JOUEUR = 50;
    public static final int TAILLE_BALLON = 20;
    public static final int TAILLE_ARBITRE = 40;
    public static final int LARGEUR_TERRAIN = 600;
    public static final int LONGUEUR_TERRAIN = 800;
    public static final Position MILIEU_DE_TERRAIN = new Position(LONGUEUR_TERRAIN / 2, LARGEUR_TERRAIN / 2);
    public static final Position BUT_EQUIPE_1 = new Position(25, MILIEU_DE_TERRAIN.getY());
    public static final Position BUT_EQUIPE_2 = new Position(LONGUEUR_TERRAIN - 25, MILIEU_DE_TERRAIN.getY());
    public static final double SEUIL_PROXIMITE = 10;
}
