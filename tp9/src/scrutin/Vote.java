package scrutin;

public class Vote {
    private String nom;
    public static final Vote OUI = new Vote("OUI");
    public static final Vote NON = new Vote("NON");
    public static final Vote BLANC = new Vote("BLANC");
    public static final Vote NUL = new Vote("NUL");


    public Vote(String nom){
        this.nom = nom;
    }   

    public String getVote(){
        return this.nom;
    }
    
    @Override
    public String toString(){
        return "vote = " + nom; 
    }

    @Override
    public boolean equals(Object bulletin){
        if (bulletin instanceof Vote) {
            Vote v = (Vote) bulletin;
            if (this.getVote() == v.getVote()) {
                return true;
            }
        }
        return false;
    }

}
