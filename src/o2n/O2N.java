/*
Michael Rios
COSC 600
Project 3
Question 8 part two O(2^n) 
 */

package o2n;

import java.util.Scanner;


public class O2N {


    public static void main(String[] args) {
                double n, k, number = 1;
        
        Scanner reader = new Scanner(System.in);//used to read input from screen
            
        System.out.println("How big should the loop be??");
        n = reader.nextDouble();
        
        for(int i = 1; i<n; i++){//regular O(n) loop
            number = number * 2; //makes the second loop run double each time hence the O(2^n) running time
            for(int j = 1; j<number; j++)
                System.out.println(j);    
        }
   //I guess the running time of this progran is really O(n2^n) but the 2^n is all we really care about as it eclipses the n running time
    
    }
    
        
    }
