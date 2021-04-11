abstract class Animal {	
	public void eat() {
		System.out.println("The animal munches on some food");
	}
	
	abstract void move();
}
/* ----------------------------- */
class Dog extends Animal {	
	public void move() {
		System.out.println("The dog walks around");
	}
	
	public void beg() {
		System.out.println("The dog looks cute to get food");
	}
}
/* ----------------------------- */
public class Abstract {
	public static void main(String[] args) {
		Dog myDog = new Dog();
		myDog.eat();
		myDog.move();
		myDog.beg();
	}
}
