Méthode main :
    public static void main(String[] args) {}

Compilation :
    javac test.java
Exécution :
    java test

Type primitif (pile):
    int i = 17; i=17
Type référence (tas):
    String s1 = "Test"; s1=->"Test"

Modificateur d'accès :
    public > n'importe qui
    protected > package et ss-classes
    defaut > package
    private > elle uniquement

Variable/Méthode d'instance :
    public class Car{
        private int nbMiles;
        public void start(){};
    }

Constructeur :
    Pas de type de retour, même nom, (argument(s))
    public Car(){
        nbMiles = 0;
    }

Accesseurs :
    getters (lecture):
        public String getNbMiles(){return nbMiles;}
    setters (écriture):
        public void setNbMiles(int nm){nbMiles = nm;}

Utiliser objet :
    Créer : 
        Car c0 = new Car(12);
    Appel méthodes :
        c0.start();
    c0 est ici la référence à l'objet

Constructeurs par recopie :
    Copie superficielle (partage données):
        private Engine engine;
        public Car(Car c){
            engine = c.engine;
        }
    Copie profonde (propre copie information):
        private Engine engine;
        public Car(Car c){
            engine = new Engine(c.engine.getXXX(),...);
        }

Méthodes statiques (classes): 
    > Fonction classique
    public static double atan2(double y, double x){...};
Attributs statiques (classes):
    > Données générales
    private static int nb;

Méthode toString() :
    > Appelée quand : System.out.println(Object x);
    @Override
    public String toString(){
        return "ce que tu veux en gros";
    }

Méthode equals():
    @Override
    public boolean equals(Object obj){
        if (obj instanceof Car){
            Car c = (Car) obj;
            if (this.getNbMiles == c.getNbMiles()){
                return true;
            }
        }
        return false;
    }

Tableaux :
    > Déclaration & Initialisation
        String[] names; (null)
        String[] names = {"Paul", "Pierre"};
    > Tableaux de tableaux (Déclaration & Initalisation)
        int[][] matrix;
        matrix = new int[20];
        for (int i = 0; i < matrix.length; i++){
            matrix[i] = new int[50];
        }
    > Equivalent Java 
        int[][] matrix = new int[20][50];
    > Copie tableaux 
        System.arraycopy(...); -> copie efficace
        int[] numsCopy = (int[]) nums.clone(); -> dupliquer 

Types énumérés :
    > Classe séparé avec une constante = une instance
        public enum Fuel{
            GASOLINE, DIESEL, LPG; //constantes en majuscules
        }
        Fuel f = Fuel.DIESEL;
    > Méthodes associés :
        (instance) String name(){return this.name;}: ret char de la constante 
        (instance) int ordinal(){return this.index;}: ret indice de la constante 
        (classe) static Fuel valueOf(String s){...} : ret instance référence 
        (classe) static Fuel[] values(){return Fuel.GASOLINE, Fuel.DIESEL, ...} : ret tableau des valeurs type énumération 

Interfaces
    > Déclare uniquement comportements sans définir (pas implémentation méthode, pas variable instance)
        public interface Reparable {
                void repair();
                ...
            }
    > Classe implémente interface qui définit un comportement (implémentation multiple)
        public class Car implements Reparable {
            ...
            @Override
            public void repair(){
                ...
            }
        }
    
Transtypage (Cast)
    > Référence un seul type, objet plusieurs (polymorphes)
    > Upcast : changer vers une classe moins spécifique (facile)
    > Downcast : changer vers une classe plus spécifique (dur)

Héritage
    > Classe fille hérite de la classe mère (méthodes et attributs) (unique)
    > Défaut classes héritent Object (toString(),equals(Object),...)
    > Pour chaque couche de classe enfant il faut la construire car les constructeurs ne sont pas hérités (utilisation de super())
    public class Kart extends Car {}

Classe abstraite
    > Déclare comportement mais définit partiellement
    > Peut comporter méthodes/attributs non abstraits
    > Permet de factoriser du code
        public abstract class MotorVehicle{
            public abstract void turn(...)
        }
    > Interdire l'héritage avec final