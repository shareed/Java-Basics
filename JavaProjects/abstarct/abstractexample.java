abstract class Animal {	//abstract clas which can only be inherited
	
    // Both the eat and move methods will be inherited but the abstarct method move
    // will have to be given implementation details in each concrete subclass


    public void eat() {//concrete method
		System.out.println("The animal munches on some food");
	}
	
	abstract void move();//abstarct method
}
/* ----------------------------- */
class Dog extends Animal {	// Dog is a concrete subclass of Animal

    //overridden move method with implementation details
	public void move() {
		System.out.println("The dog walks around");
	}
	
	public void beg() {
		System.out.println("The dog looks cute to get food");
	}
}




public class abstractexample {
    public static void main(String[] args) {
        Dog myDog = new Dog();
        myDog.eat();
        myDog.move();
        myDog.beg();
    }

}
