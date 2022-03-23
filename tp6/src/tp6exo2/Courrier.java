package tp6exo2;

/**
 *
 */
public abstract class Courrier {

    /**
     *
     */
    private final String destination;

    /**
     *
     */
    private final float poids;

    /**
     *
     */
    private final ModesExpedition modeExpedition;

    /**
     * Default constructor
     */
    public Courrier(String destination, float poids, ModesExpedition mode) {
        this.destination = destination;
        this.poids = poids;
        this.modeExpedition = mode;
    }

    /**
     * @return
     */
    public String getDestination() {
        return this.destination;
    }

    /**
     * @return
     */
    public float getPoids() {
        return this.poids;
    }

    /**
     * @return
     */
    public ModesExpedition getMode() {
        return this.modeExpedition;
    }

    /**
     * @return
     */
    public String toString() {
        return String.format("Destination : %s%s\nPoids : %.1f\nExpress : %s\nPrix%.2f",
                this.getDestination(),
                this.isValide() ? "" : " [invalide]",
                this.getPoids(),
                this.getMode() == ModesExpedition.Express ? "oui" : "non",
                this.affranchir());

    }

    /**
     * Affranchi le courriers. Calcul sont prix d'expédition
     *
     * @return
     */
    public abstract float affranchir();

    /**
     * Vérifie si le courrier est valide
     *
     * @return
     */
    public boolean isValide() {
        return (this.getDestination() != "");

    };

}
