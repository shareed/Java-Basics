class StaticDemo {
	static int counter = 0;// static/class member/variable value shared across entire class

	int number = 0;// instance member/variable value pertains to a particular instance of a class
	
	public StaticDemo(){//constructor, increments counter and number everythime it is called
		counter++;
		number++;
	}
}


public class staticexample {
    public static void main(String[] args) {
	
		StaticDemo instanceA = new StaticDemo();//First Instance of StaticDemo class
		System.out.println("instanceA counter: " + instanceA.counter);// 1
		System.out.println("instanceA number: " + instanceA.number);// 1
		
		StaticDemo instanceB = new StaticDemo();//second Instance of StaticDemo class
		System.out.println("instanceB counter: " + instanceB.counter);// 2
		System.out.println("instanceB number: " + instanceB.number);// 1

        StaticDemo instanceC = new StaticDemo();//second Instance of StaticDemo class
		System.out.println("instanceC counter: " + instanceC.counter);// 3
		System.out.println("instanceC number: " + instanceC.number);// 1

        StaticDemo instanceD = new StaticDemo();//second Instance of StaticDemo class
		System.out.println("instanceD counter: " + instanceD.counter);// 4
		System.out.println("instanceD number: " + instanceD.number);// 1
	}	
    
}
