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
        public void start(){...};
    }

Constructeur :
    Pas de type de retour, même nom classe, (argument(s))
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
        c0.setAbs();
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
    > Tableaux de tableaux (Déclaration & Initalisation) c'est de la merde
        int[][] matrix; //déclaraiton
        matrix = new int[20]; //init
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
    > Interdire l'héritage avec final

Classe abstraite
    > Ne peut pas être instancié
    > Déclare comportement mais définit partiellement
    > Peut comporter méthodes/attributs non abstraits
    > Méthodes abstraites sans code ds corps
    > Permet de factoriser du code
        public abstract class MotorVehicle{
            public abstract void turn(...)
        }

Exception 
    > Anticiper code susceptible produire erreur
    > Sépare traitement normal et cas exceptionnel

    public class name extends Exception {
        public name (String msg){
            super(msg);
        }
    }

    > Lever exception : 

    if (condition) {
        throw new nomException ("message");
    }

    > Capturer exception :
    
        try{                                          //Code susceptible lever exception
            //methode pour lever exception
            Sys.out.println("ok");
        } catch (nomExeception e) {                    //traitement cas particulier
            ...(traitement)
            throw e; //relance l'exception
            sys.err.println("fail" + e.getMessage());
        } finally {                                    //Optionel et exec ts cas
            sys.out.println("fin");
        }

    > Exception est remplie avec trace d'appels pile exécution (stack trace)
    > Exception vérifiée :
        Exception vérifiée directement dans méthode dans laquelle elle est levée

            public void start() throws nameException {...}

    > Exception non-vérifiée :
        Exception levées implicitement par machine virtuelle
    > Méthode clone :
        Classe doit implémenter interface Cloneable

            public class name implements Cloneable {
                public Object clone() throws CloneNotSupportedException {
                    Object name = (Object) super.clone();
                    


                    return clone;
                }
            }
        Copie superficielle : copie référence
        Copie profonde : copie attribut par attribut

Collections
    > Interfaces de collection fournit package java.utils
    > List (liste) Queue (file) Stack (pile) Set (ensemble sans doublons) Map (clé valeur)
    > Opérations générales :
        add(Object o)
        remove (Object o)
        clear()
        contains(Object o) : boolean
        size()
        isEmpty()
        iterator()
    > Implémentations de List 
        LinkedList (liste chaînée)
        ArrayList : Stock les éléments dans un tableau
        Méthode liste :
            add(int index, Object o)
            get(int index)
            remove(int index)
            indexOf(Object o)
    > Implémentations de Set
        HashSet : éléments regroupé paires clé-valeur avec code de hachage
        TreeSet : éléments conservés dans un ordre trié
    > Implémentations de Map : Similaire au Set
        HashMap : clés hachées
        TreeMap : clés triées
        Méthodes :
            get(Object key)
            put(Object key)
            remove(Object key)
            containsKey(Object key)
            containsValue(Object value)
            values() : retourne collection valeurs
            keySet() : retourne set Clé
            entrySet() : retourne Set de paires clé-valeur
    > Type génériques : classes/interfaces peut prendre d'autres types en paramètres
        LinkedList<Car> cars = new LinkedList<Car>();
    > Iterator : interface simple
        hasNext() : boolean
        next()
        remove()
    > ListIterator étend Iterator

Types génériques
    > Définit des interfaces ou es classes paramétrées par un ou plusieurs type de données
    > Utilisation :
        List<Car> cars = new ArrayList<Car>();
    > Méthodes génériques: 

        public <E> void foo(List <E> I){
            Iterator<E> it = I.iterator();
            ...
        }

+Regarder vidéo sur Collection et types génériques
        
