package cartesiens;

public class TestPoint {

    public static void main(String[] args) {
        Point a;
        Point b;
        Point c;

        a = new Point((float) Math.random()*100, (float) Math.random()*100);
        b = new Point((float) Math.random()*100, (float) Math.random()*100);
        c = new Point();

        
        //C multiplier(a, 2);
        //JAVA a.multiplier(2); //Méthode d'instance
        //JAVA multiplier(a, 2); //Méthode classe

        System.out.println(a);
        System.out.println(b);

        a.equals(b);
        
        System.out.println(a.distance(b));

        a.translater(b);
        
    }
}