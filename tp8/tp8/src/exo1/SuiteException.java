package exo1;

public class SuiteException extends Exception{
    private String trace;
    
    public void ajouterTrace(String s){
        trace += s + "\n";
    }

    @Override
    public String toString() {
        return "SuiteException [trace=" + trace + "]";
    }

}
