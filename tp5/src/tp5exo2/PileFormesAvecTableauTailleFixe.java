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
	/*boucle infini*/
	public void empiler(Forme element) {
		int i = 0;
		int fin = 0;
		while (i < this.tab.length-1 || fin != 1) {
			if (this.tab[i] == null) {
				this.tab[i] = element;
				fin = 1;
				i += 1;
			}
		}
	}

	@Override
	public void depiler(){
		this.tab[this.tab.length-1] = null;
	}

	@Override
	public Forme sommet(){
		return this.tab[this.tab.length-1];
	}

	@Override
	public boolean vide(){
		for (int i = 0; i < this.tab.length; i++) {
			System.out.print(tab[i]);
			if (tab[i] != null) {
				return false;
			}
		}
		return true;
	}

	@Override
	public String toString(){
		String res = "";
		for (int i = 0; i < this.tab.length; i++) {
			res += "tab[" + i + "] = " + tab[i];
		}		
		return res;
	}

}