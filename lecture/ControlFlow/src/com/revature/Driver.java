package com.revature;

public class Driver {

	public static void main(String[] args) {
		double rand = Math.random();
		double rand2 = Math.random();
		double rand3 = Math.random();
		//IfElse
		if(rand > 0.5) {
			System.out.println("It is greater than .5!!");
		} else {
			System.out.println("It is less than .5");
		}
		
		
		if(rand2 > 0.75) {
			System.out.println("It is greater than .75!!");
		} else if(rand2 >= 0.5){
			System.out.println("It is greater than .5 but less than .75");
		}
		
		if(rand3 > 0.75) {
			System.out.println("It is greater than .75!!");
		} else if(rand3 >= 0.5){
			System.out.println("It is greater than .5 but less than .75");
		} else {
			System.out.println("It is less than .5");
			
		}

		
		
		int total = 0;
		//while loop
		while(total < 400) {
			total = total+ 85;
					System.out.println(total);
		}
		
		//do while
		do {
			total = total - 59;
			System.out.println(total);
		} while(total > 0 && total < 400);
		
		System.out.println("________________________________________________");
		System.out.println("                                                ");
		System.out.println("FOR LOOP");
		//For Loop
		for(int i = 0; i < 5; i++) {
			total = total + 37;
			System.out.println("total: " + total);
			System.out.println("i: " + i);
		}
		
		System.out.println("________________________________________________");
		System.out.println("                                                ");
		
		char[] name = {'S', 'H', 'A', 'N', 'N', 'O', 'N', ' ', 'R', 'E', 'E', 'D'};
		System.out.println(name);
		
		for(int i = 0;i < name.length;i++) {
			if(name[i] == ' ') {
				
				
				/*continue will end the current iteration of the loop but continue
				 * on to the evaluation for the next iteration
				 */
				continue;
			}
			name[i] += 32;
		}
		System.out.println(name);
	}

}
