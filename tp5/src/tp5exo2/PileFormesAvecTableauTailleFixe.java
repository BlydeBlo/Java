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
		this.tab = new Forme[taille];
	}
	
	@Override
	public void empiler(Forme element) {
		for (int i = 0; tab[i] != null && i<tab.length; i++) {
			tab[i] = element;
		}
	}

	@Override
	public void depiler(){
		tab[tab.length-1] = null;
	}

	@Override
	public Forme sommet(){
		return tab[tab.length-1];
	}

	@Override
	public boolean vide(){
		for (int i = 0; i < tab.length; i++) {
			System.out.println(tab[i]);
			if (tab[i] != null) {
				return false;
			}
		}
		return true;
	}

	@Override
	public String toString(){
		String res = "";
		for (int i = 0; i < tab.length; i++) {
			res += "tab[" + i + "] = " + tab[i];
		}		
		return res;
	}

}