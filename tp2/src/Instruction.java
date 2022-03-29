public class Instruction {
    
    public static String semaine(int jour){
        String res = "";
        switch (jour) {
            case 1:
                res = "Lundi";
                break;

            case 2:
                res = "Mardi";
                break;
        
            default:
                break;
        }
        return res;
    }

    public static void main(String[] args){
        for (int i = 1; i < 3; i++) {
            System.out.println(semaine(i));
        }
    }

    

}
