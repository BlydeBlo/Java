package scrutin;

public class MajoriteRelative extends MajoriteAbsolue{
    
    public MajoriteRelative(){

    }

    public Vote getVainqueur(){
        int total = 0;
        Vote vainqueur = null;
        if (ouvert) {
            throw new VoteNonFermeException("Le vote n'est pas clos");
        } else {
            for (Vote v : resultat.keySet()) {
                if (v != Vote.BLANC && v != Vote.NUL) {
                    total += resultat.get(v);
                }
            }
            for (Vote v : resultat.keySet()) {
                if (v != Vote.BLANC && v != Vote.NUL && resultat.get(v) > 0.5 *  total) { //Changer la condition
                    vainqueur = v;
                }
            }
        }
        return vainqueur;
    }
}
