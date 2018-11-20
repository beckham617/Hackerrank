/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hackerrank.day10;

/**
 *
 * @author beckh
 */
import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Day10 {

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
//        //method 1 -
//        String binaryStr = convertBase10toBase2(n);
        
        //method 2 -
        String binaryStr = "";
        while(n>0){
            binaryStr = (n%2+"") + binaryStr;
            //System.out.println("binaryStr="+binaryStr);
            n/=2;
        }
        System.out.println(binaryStr);
        int[] arr = new int[binaryStr.length()+1];
        for(int i=0; i<binaryStr.length(); i++){
            int sum = 0;
            for(int j =i; j<binaryStr.length(); j++){
                i=j;
                if("1".equals(binaryStr.substring(j,j+1))){
                    sum++;
                }else{
                    break;
                }
            }
            arr[i]=sum;
            sum = 0;
        }
        System.out.println(Arrays.toString(arr));
        int max = 0;
        for(int k : arr){
            if(k>max){
                max=k;
            }
        }
        System.out.println(max);
        
        scanner.close();
    }
    
    public static String convertBase10toBase2(int n){
        if(n>0){
            int i = n/2;
            if(i>0){
                return convertBase10toBase2(i)+(n%2+"");
            }else{
                return n%2+"";
            }
        }else{
            return "0";
        }
    }
    
}
