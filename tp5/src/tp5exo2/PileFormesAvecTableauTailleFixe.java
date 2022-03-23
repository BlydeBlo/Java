package tp5exo2;

import tp5.Forme;

public class PileFormesAvecTableauTailleFixe implements PileFormes{
	
	private Forme[] tab;
	
	public Forme[] getTab() {
		return tab;
	}
	
	public void setTab(Forme[] tab) {
		this.tab = tab;
	}
	
	public PileFormesAvecTableauTailleFixe(int taille) {
		tab = new Forme[taille];
	}
	
	public void empiler(Forme element) {
		for (int i = 0; tab[i] != null && i<tab.length; i++) {
			tab[i] = element;
		}
	}
	
}