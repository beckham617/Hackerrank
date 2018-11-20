/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hackerrank.day04;

import java.io.*;
import java.util.*;

public class Day4 {
    private int age;	
  
	public Day4(int initialAge) {
  		// Add some more code to run some checks on initialAge
          if(initialAge<0){
              age=0;
              System.out.println("Age is not valid, setting age to 0.");
          }else{
              age = initialAge;
          }
	}

	public void amIOld() {
  		String res = "";
        if(this.age<13){
            res="You are young.";
        }else if(age>=13 && age<18){
            res="You are a teenager.";
        }else{
            res="You are old.";
        }
        // Write code determining if this person's age is old and print the correct statement:
        System.out.println(res/*Insert correct print statement here*/);
	}

	public void yearPasses() {
  		// Increment this person's age.
          age+=1;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for (int i = 0; i < T; i++) {
			int age = sc.nextInt();
			Day4 p = new Day4(age);
			p.amIOld();
			for (int j = 0; j < 3; j++) {
				p.yearPasses();
			}
			p.amIOld();
			System.out.println();
        }
		sc.close();
    }
}