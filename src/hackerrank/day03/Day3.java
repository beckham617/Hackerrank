/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hackerrank.day03;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Day3 {



    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int N = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
        if((N%2==1) || (N%2==0 && 6<=N && N<=20)){
            System.out.println("Weird");
        }else if(N%2==0 && ((2<=N && N<=5)|| N>20) ){
            System.out.println("Not Weird");
        }
        scanner.close();
    }
}
