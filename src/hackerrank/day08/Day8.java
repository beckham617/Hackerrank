/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hackerrank.day08;

//Complete this code or write your own from scratch
import java.util.*;
import java.io.*;

class Day8{
    public static void main(String []argh){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        Map<String,Integer> phoneBookMap = new HashMap<String,Integer>();
        for(int i = 0; i < n; i++){
            String name = in.next();
            int phone = in.nextInt();
            phoneBookMap.put(name, phone);
            // Write code here
        }
        int j =0;
        while(in.hasNext()){
            String s = in.next();
            // Write code here
            if(phoneBookMap.get(s)!=null){
                System.out.println(s+"="+phoneBookMap.get(s));
            }else{
                System.out.println("Not found");
            }
        }
        in.close();
    }
}

