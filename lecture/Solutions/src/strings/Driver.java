package strings;

public class Driver {
	

	public static void main(String[] args) {
		
		PrintString inputString = new PrintString();
		
		////Print Each Word on a separate line
//		System.out.println("********Print Each Word********");
//		inputString.printEachWord("My Name is Shannon");
//		System.out.println("_________________________________");
//		System.out.println("                                 ");
		
		
//		System.out.println("********Print Each Letter********");
//		inputString.printEachLetter("My Name is Shannon");
//		System.out.println("_________________________________");
//		System.out.println("                                 ");
		
		System.out.println("********A Reversed String********");
		inputString.reverseString("My Name is Shannon");
		System.out.println("_________________________________");
		System.out.println("                                 ");
		
		System.out.println("********Print Acronym********");
		inputString.printAcronym("Shannon Tralaine Reed ");
		System.out.println("_________________________________");
		System.out.println("                                 ");
		
		System.out.println("********Triangle********");
		TriangleDoubles myTriangle = new TriangleDoubles(15, 15, 15);
		TriangleDoubles myTriangle1 = new TriangleDoubles(12, 15, 15);
		TriangleDoubles myTriangle2 = new TriangleDoubles(15, 11, 18);
		
		System.out.println(myTriangle1.isEquilateral());
		System.out.println(myTriangle.isIsosceles());
		System.out.println(myTriangle2.isScalene());
		
		//myTriangle.isEquilateral();
	}

}
