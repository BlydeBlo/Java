
package tp6exo2;

import java.util.ArrayList;

/**
 *
 */
public class BoiteAuxLettres {

    /**
     * Nombre maximum de courriers dans la boite aux lettres
     */
    private int taille;

    /**
     *
     */
    private ArrayList<Courrier> Courriers;

    /**
     * Default constructor
     */
    public BoiteAuxLettres(int taille) {
        this.Courriers = new ArrayList<Courrier>();
        this.taille = taille;
    }

    /**
     * @return Serialized BoiteAuxLettres
     */
    public String toString() {
        String out = "";
        for (Courrier courrier : this.Courriers) {
            out += courrier + "\n";
        }
        return out;
    }

    /**
     * Compte le nombre de courrier valide dans la boite aux lettres
     *
     * @return le nombre de courriers valide
     */
    public int nbValide() {
        int total = 0;
        for (Courrier courrier : Courriers) {
            total = courrier.isValide() ? total + 1 : total;
        }
        return total;
    }

    /**
     * Calcule le coût d'affranchissement des courriers
     *
     * @return le cout total pour affranchir tout les courriers de la boite aux
     *         lettres
     *
     */
    public float cout() {
        float somme = 0;
        for (Courrier courrier : Courriers) {
            somme = courrier.isValide() ? courrier.affranchir() : 0;
        }
        return somme;
    }

    /**
     * @param courrier Ajoute un courrier à la boite aux lettresParameter1
     */
    public void addCourrier(Courrier courrier) throws BoiteAuxLettresPleineException {
        if (this.Courriers.size() < taille - 1) {
            this.Courriers.add(courrier);
        } else {
            throw new BoiteAuxLettresPleineException("Boite aux lettres pleine.");
        }
    }

    public static void main(String[] args) {
        BoiteAuxLettres bat = new BoiteAuxLettres(50);
        try {
            bat.addCourrier(new Lettre("Pau", 100.0f, ModesExpedition.Normal, PaperFormats.A4));
            bat.addCourrier(new Magazine("", 200.0f, ModesExpedition.Express));
            bat.addCourrier(new Colis("Bordeaux", 10000.0f, ModesExpedition.Normal, 10.0f));
        } catch (Exception e) {
            System.out.println(e);
        }
        System.out.println(bat);
    }
}
