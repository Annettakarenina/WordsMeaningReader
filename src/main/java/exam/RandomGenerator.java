package exam;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;
import java.util.Scanner;

public class RandomGenerator {
	
	public static void main(String[] args) {
		
		Random rnd=new Random();
		int max=1000;
		int min=100;
		Scanner sc=new Scanner(System.in);
		System.out.println("give me some nth smallest number");
		int nth=sc.nextInt();
		ArrayList<Integer>myData= new ArrayList<Integer>();	
		
		for (int i = 0; i < 500; i++) {
			System.out.println(rnd.nextInt((max - min) + 1) + min);// gives 500 randomNumbers
			myData.add(rnd.nextInt(1000));
		}
		Collections.sort(myData);
		System.out.println("Sorted data is: "+myData);

		System.out.println("The " + nth +" th smallest number is " + myData.get(nth));
		
		
		
	}
}

