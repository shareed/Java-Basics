package strings;

public class PrintString {
	
	String myString;
	
	//Print Each Word on a separate line
	public void printEachWord(String myString) {
		this.myString = myString;
		String[] myStringArray = myString.split(" ");
		for(String word: myStringArray) {
			System.out.println(word);
		}
		
	}
	
	//Print Each Word on a separate line
	public void printEachLetter(String myString) {
		this.myString = myString;
		String[] myStringArray = myString.split("");
		for(String word: myStringArray) {
			System.out.println(word);
		}
	}
	
	//Reverse A String
	public void reverseString(String myString) {
		this.myString = myString;
		//1. Put the string in an array of strings using the split method
		String[] myStringArray = myString.split("");
		
		//2. Create a empty string to hold the reversedString
		//this needs to be outside the for loop so, it can be printed outside of the loop
		String reversedString = "";
		
		
		//3. Create a for loop
		//set i equals to the length of the array minus 1(end of array)
		//as long as i is greater than or equal to 0
		//move to the index before the current one
		
		
		for(int i = myStringArray.length -1; i >= 0; i--) {
			
			reversedString = reversedString.concat(myStringArray[i]);
			//myStringArray[i];
			//String reversedWord = 
			
		}
		System.out.println(reversedString);
		//System.out.println(myStringArray[0]);
		

	}
	
	public void printAcronym(String phrase){
		//1. split the phrase into an array of words
		String[] myPhraseArray = phrase.split(" ");
		//2. create a variable to hold the acronym
		String acronym = "";
		for(String word: myPhraseArray) {
		//3. split each word into an array of letters
			String[] wordLetters = word.split(""); 
//			System.out.println(myWord[0]);
		//4. take the first letter of each array and add it to the acronym variable
			acronym = acronym.concat(wordLetters[0]);
		}
		System.out.println(acronym);
	
	}
	
	
	/**
	 * 4. Given a word, compute the scrabble score for that word.
	 * 
	 * --Letter Values-- Letter Value A, E, I, O, U, L, N, R, S, T = 1; D, G = 2; B,
	 * C, M, P = 3; F, H, V, W, Y = 4; K = 5; J, X = 8; Q, Z = 10; Examples
	 * "cabbage" should be scored as worth 14 points:
	 * 
	 * 3 points for C, 1 point for A, twice 3 points for B, twice 2 points for G, 1
	 * point for E And to total:
	 * 
	 * 3 + 2*1 + 2*3 + 2 + 1 = 3 + 2 + 6 + 3 = 5 + 9 = 14
	 * 
	 * @param string
	 * @return
	 */
	public int getScrabbleScore(String string) {
		// TODO Write an implementation for this method declaration
		return 0;
	}
	
	
	



}
