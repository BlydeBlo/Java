package tp6exo2;

/**
 *
 */
public class Lettre extends Courrier {

    /**
     *
     */
    private PaperFormats format;

    /**
     * @param format
     * @param destination
     * @param poids
     * @param mode
     */
    public Lettre(String destination, float poids, ModesExpedition mode, PaperFormats format) {
        super(destination, poids, mode);
        this.format = format;
    }

    /**
     * @return
     */
    public PaperFormats getFormat() {
        return this.format;
    }

    /**
     * @return
     */
    @Override
    public String toString() {
        return String.format("%s\nFormat : %s", super.toString(), this.getFormat());
    }

    /**
     * @return
     */
    public float affranchir() {
        return ((this.getFormat() == PaperFormats.A4 ? 2.5f : 3.5f) + (this.getPoids() / 1000f))
                * (this.getMode() == ModesExpedition.Express ? 2 : 1);
    }
}
