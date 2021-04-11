class Animal {

    public Animal(String name) {

        super(); //added by the compiler
        System.out.println(name);

    }

}


public class Dog extends Animal {
    private String name;
    private String breed;

    public Dog(String name, String breed) {
        // this call to super() will attempt to invoke a no-arg constructor in Animal class, 
        // but the Animal doesn't have a no-arg constructor, so this breaks the superclass constructor chain
        //super(); //added by the compiler
        //this.name = name;
        //this.breed = breed;

        //add an explicit call to super(""), passing in a String argument to match Animal's only constructor
        super("Dog");
        this.name = name;
        this.breed = breed;
        System.out.println(name);
        System.out.println(breed);
    }

    public static void main(String[] args){
        Dog boxer = new Dog("Jazz", "Boxer");
    }
}
