public class Constructors1 {

    //1. Create Constructor
	public Constructors1(int value) { //Constructor that takes in an int
        System.out.println(value);
    }

    // 2. Create a no-arg constructor
    public Constructors1() {
        System.out.println("Default Constructor ran");
    }

    public static void main(String[] args){
    
        // 3. instantiate a new Constructors object using the new constructor
        Constructors1 c = new Constructors1(5839); // creates a Constructors object passing it the value 5839 and assigns the object to the variable c
        
        // 4. add a line to use the default no-arg constructor
        Constructors1 cNoArg = new Constructors1();
        }
    
    
}