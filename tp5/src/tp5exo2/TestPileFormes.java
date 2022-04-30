package tp5exo2;

import tp5.*;

public class TestPileFormes{
    
    public static void main(String[] args){
        PileFormes p = new PileFormesAvecTableauTailleFixe(5);
        System.out.println(p.vide());
        p.empiler(new Carre(5));
        p.empiler(new Cercle(5));
        System.out.println(p.vide());
        /*p.sommet();
        p.depiler();
        System.out.println(p.vide());
        p.depiler();
        System.out.println(p.vide());*/
    }
}
