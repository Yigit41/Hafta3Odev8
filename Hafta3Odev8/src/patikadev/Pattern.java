package patikadev;

import java.util.Scanner;

public class Pattern {

	 static void pattern(int checkNum,int n, boolean mid) {
		 	
		 	
	        if (mid && n > 0 && n <= checkNum) {
	            System.out.print(n + " ");
	            n -= 5;
	            pattern(checkNum,n, true);
	            if (n <= 0) {
	                pattern(checkNum,n, false);
	            }
	        } else if (mid == false && n <= checkNum) {
	            System.out.print(n + " ");
	            n += 5;
	            
	            pattern(checkNum,n, false);
	        }
	    }

	
	
	public static void main(String[] args) {
	  
        Scanner input = new Scanner(System.in);
        System.out.println("Please Enter A Number : ");
        int num = input.nextInt();
        int check = num;
        System.out.println();
        pattern(check,num, true);
        input.close();
	}

}
