package scrutin;

import java.util.*;

public class TestScrutin {
    public static void main(String[] args){
        Set<Vote> choix = new HashSet<>();
		choix.add(Vote.OUI);
		choix.add(Vote.NON);
		MajoriteAbsolue referendum = new MajoriteAbsolue(200, choix);
		for (int i = 0; i < 175; i++) {
			if (((int)(Math.random()*2)) % 2 == 0)
				referendum.ajouterVote(Vote.OUI);
			else
				referendum.ajouterVote(Vote.NON);
		}
		referendum.cloturer();
		System.out.println(referendum);
		System.out.println("Result: " + referendum.getVainqueur());
    }
}
