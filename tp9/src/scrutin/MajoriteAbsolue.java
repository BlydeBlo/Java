package scrutin;

import java.util.*;

public class MajoriteAbsolue {
    int nbrVote;
    Set<Vote> choix;
    Map<Vote, Integer> resultat = new HashMap<>();
    boolean ouvert;


    public MajoriteAbsolue(int nbrVote, Set<Vote> choix){
        this.nbrVote = nbrVote;
        this.choix = choix;
        this.choix.add(Vote.BLANC);
        this.choix.add(Vote.NUL);
        for (Vote vote : choix) {
            resultat.put(vote, 0);
        }
        ouvert = true;
    }

    public Set<Vote> getVotePossible(){
        return this.choix; 
    }

    public void ajouterVote(Vote v){
        if (!ouvert) {
            throw new VoteFermeException("Le vote est clos");
        } else if (resultat.containsKey(v)) {
            if (v.equals(new Vote(""))) {
                resultat.put(Vote.BLANC, resultat.get(Vote.BLANC)+1);
            } else {
                resultat.put(v, resultat.get(v)+1);
            }
        } else {
            resultat.put(Vote.NUL, resultat.get(Vote.NUL)+1);
        } 

    }

    public void afficherResultat(){
        if (ouvert) {
            throw new VoteNonFermeException("Le vote n'est pas clos");
        } else {
            for (Vote v : resultat.keySet()) {
                System.out.println(v + "a obtenu " + resultat.get(v) + "bulletins");
            }
        }
    }

    public void cloturer(){
        ouvert = false;
        afficherResultat();
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
                if (v != Vote.BLANC && v != Vote.NUL && resultat.get(v) > 0.5 *  total) {
                    vainqueur = v;
                }
            }
        }
        return vainqueur;
    }









}
