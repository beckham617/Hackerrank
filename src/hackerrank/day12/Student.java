/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hackerrank.day12;

/**
 *
 * @author beckh
 */
public class Student extends Person{
    private int[] testScores;

    /*	
    *   Class Constructor
    *   
    *   @param firstName - A string denoting the Person's first name.
    *   @param lastName - A string denoting the Person's last name.
    *   @param id - An integer denoting the Person's ID number.
    *   @param scores - An array of integers denoting the Person's test scores.
    */
    // Write your constructor here
    Student(String firstName, String lastName, int id, int[] scores){
        super(firstName, lastName, id);
        this.testScores = scores;
    }

    /*	
    *   Method Name: calculate
    *   @return A character denoting the grade.
    */
    // Write your method here
    public char calculate(){
        int averageScore = 0;
        int sumScore = 0;
        char grade = ' ';
        for(int score : testScores){
            sumScore+=score;
        }
        averageScore = sumScore/testScores.length;
        if(90<=averageScore && averageScore<=100){
            grade = 'O';
        }else if(80<=averageScore && averageScore<=90){
               grade = 'E';
        }else if(70<=averageScore && averageScore<=80){
               grade = 'A';
        }else if(55<=averageScore && averageScore<=70){
               grade = 'P';
        }else if(40<=averageScore && averageScore<=55){
               grade = 'D';
        }else if(averageScore<40){
               grade = 'T';
        }
        return grade;
    }
}
