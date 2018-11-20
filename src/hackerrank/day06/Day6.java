/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hackerrank.day06;

import java.util.Scanner;

/**
 *
 * @author beckh
 */
public class Day6 {
    
    private static final Scanner scanner = new Scanner(System.in);
    
    public static void printString(String inputString){
        String oddString = "";
        String evenString = "";
        for(int j=0;j<inputString.length();j++){
            if(j%2==0){
                evenString+=inputString.substring(j,j+1);
                //System.out.println("evenString="+evenString);
            }else{
                oddString+=inputString.substring(j,j+1);
                //System.out.println("oddString="+oddString);
            }
        }
        System.out.println(evenString+" "+oddString);
    }
    
    public static void main(String[] args){
        //System.out.println("Please enter a number:");
        int T = scanner.nextInt();
        
        for(int i =0; i<T ; i++){
            //System.out.println("Please enter a String:");
            String inputString = scanner.next();
            printString(inputString);
        }
    }
}
