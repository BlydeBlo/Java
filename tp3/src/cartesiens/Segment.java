package cartesiens;

public class Segment {
    private Point p1;
    private Point p2;

    public Segment(Point p1, Point p2){
        this.p1 = p1;
        this.p2 = p2;
    }

    public Segment(Segment s){
        this(new Point(s.getPoint1().getAbs(), s.getPoint1().getOrd()), new Point(s.getPoint2().getAbs(), s.getPoint2().getOrd()));
    }

    public Point getPoint1(){
        return p1;
    }

    public Point getPoint2(){
        return p2;
    }

    public void setPoint(Point p1){
        this.p1 = p1;
    }

    public void setPoint2(Point p2){
        this.p2 = p2;
    }

    @Override
    public String toString(){
        return this.getPoint1() + " - " + this.getPoint2();
    }

    public static void main(String[] args){

        Segment s1 = new Segment(new Point(), new Point(1, 1));
        Segment s2 = new Segment(s1);
        System.out.println("s1 : " + s1);
		System.out.println("s2 : " + s2);
        
    }

    

}
