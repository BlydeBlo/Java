package tp5exo2;

import tp5.Forme;

public interface PileFormes {
	void empiler(Forme f);
	void depiler();
	Forme sommet();
	boolean vide();
}
