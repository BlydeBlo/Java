import java.nio.channels.ClosedByInterruptException;

public class Paire<X,Y> extends Comparable<X> implements Cloneable, Comparable<Paire<X,Y>>{
    private X x;
    private Y y;

    public Paire(X x, Y y){
        this.x = x;
        this.y = y;
    }

    public X getX(){
        return this.x;
    }

    public Y getY(){
        return this.y;
    }

    public void setX(X x2){
        this.x = x2;
    }

    public void setY(Y y2){
        this.y = y2;
    }

    @Override
    public String toString(){
        return "X : " + this.getX() + ", Y : " + this.getY();
    }

    @Override
    public boolean equals(Object obj){
        if (obj instanceof Paire) {
            Paire<?,?> p = (Paire<?,?>) obj;
            if (this.getX() == p.getX() && this.getY() == p.getY()) {
                return true;
            }
        }
        return false;
    }


    public Paire<?,?> clone() throws CloneNotSupportedException{
        try {
            Paire<?,?> clone = (Paire<?,?>) super.clone();
            return clone;            
        }
        catch (CloneNotSupportedException e) {
            System.err.println("Error : CloneNotSupportedException");
            return null;
        }
        
    }


    public static <E extends Comparable<E>> E plusgrand(Paire<E,E> p){
        if (p.getX().compareTo(p.getY()) > 0) {
            return p.getX();
        }
        return p.getY();
    }

    @Override
    public int compareTo(Paire<X,Y> p){
        if (this.getX().plusgrand(p.getX()))  {
            
        }
    }    

}
