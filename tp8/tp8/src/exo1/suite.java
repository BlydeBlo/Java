package exo1;

public class suite {
    public static int recursivite(int n) {
        if (n==0){
                return 100;
        }
        if (n==1){
                return 1;
        }

        if (n%2==0){    /*N paire*/ 
                return recursivite(n-1)/recursivite(n-2) - recursivite(n-2)/recursivite(n-1);
        } else {        /*N impaire*/
                return recursivite(n-2)/recursivite(n-1) - recursivite(n-1)/recursivite(n-2);
        }
}

    public static void main(String[] args) {

        try{
            System.out.println(recursivite(10));
        }
        catch(ArithmeticException e){
            System.err.print(e.getMessage()+ "\n");
        }
        
    } 

}
