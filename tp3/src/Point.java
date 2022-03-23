package src;

public class Point {
    private float abs;
    private float ord;

    /**
     * @param : abscisse
     * @param : ordonnée
     */
    public Point(float abs, float ord){
        this.abs = abs;
        this.ord = ord;
    }

    public Point(){
        this(0,0);
    }

    /**
     * @return abscisse
     */
    public float getAbs(){return abs;}

    /**
     * @return ordonnée
     */
    public float getOrd(){return ord;}
    
    /**
     * @param : set abscisse
     */
    public void setAbs(float abs){this.abs = abs;}

    /**
     * @param : set ordonnée
     */
    public void setOrd(float ord){this.ord = ord;}

    @Override
    public String toString() {
        return "(" + this.getAbs() + "," + this.getOrd() + ")";
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Point) {
            Point p = (Point) obj;
            if (this.getAbs() == p.getAbs() && this.getOrd() == p.getOrd()) {
                return true;
            }
        }
        return false;
    }

    /**
     * @param p : un point B
     * @return : distance entre deux points
     */
    public float distance(Point p) {
        return((float) Math.sqrt( Math.pow(p.getAbs()-this.getAbs(), 2) + Math.pow(p.getOrd()-this.getOrd(), 2) ));
    }

    /**
     * @param : la translation
     */
    public void translater (Point vecteur) {
        this.setAbs(this.getAbs()-vecteur.getAbs());
        this.setOrd(this.getOrd()-vecteur.getOrd());
    }
   
}