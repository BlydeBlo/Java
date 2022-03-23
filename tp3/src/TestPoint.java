package src;

public class TestPoint {

    public static void main(String[] args) {
        Point a;
        Point b;

        a = new Point((float) Math.random()*100, (float) Math.random()*100);
        b = new Point((float) Math.random()*100, (float) Math.random()*100);

        System.out.println(a);
        System.out.println(b);

        System.out.println(a.distance(b));

        a.translater(b);
        
    }
}