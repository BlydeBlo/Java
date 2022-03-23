package tp6exo2;

/**
 *
 */
public class Magazine extends Courrier {

    /**
     * Default constructor
     */
    public Magazine(String destination, float poids, ModesExpedition mode) {
        super(destination, poids, mode);
    }

    /**
     * @return
     */
    public float affranchir() {
        return (5f * this.getPoids() / 1000f)
                * (this.getMode() == ModesExpedition.Express ? 2 : 1);
    }

}
