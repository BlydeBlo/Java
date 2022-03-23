package tp6exo2;

/**
 *
 */
public class Colis extends Courrier {

    /**
     *
     */
    private float volume;

    /**
     * @param volume
     * @param destination
     * @param poids
     * @param mode
     */
    public Colis(String destination, float poids, ModesExpedition mode, float volume) {
        super(destination, poids, mode);
        this.volume = volume;
    }

    /**
     * @return
     */
    public float getVolume() {
        return this.volume;
    }

    /**
     * @return
     */
    public String toString() {
        return String.format("%s\nVolume : %.1f", super.toString(), this.getVolume());
    }

    /**
     * @return
     */
    public float affranchir() {
        return 0.25f * this.getVolume()
                + (this.getPoids() / 1000f) * (this.getMode() == ModesExpedition.Express ? 2 : 1);
    }

    /**
     * Vérifie si le courrier est valide
     *
     * @return
     */
    @Override
    public boolean isValide() {
        return super.isValide() && (this.getPoids() <= 50f);
    }
}
