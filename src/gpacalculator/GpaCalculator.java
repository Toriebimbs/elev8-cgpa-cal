/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package gpacalculator;

/**
 *
 * @author ABIMBOLA VICTORIA
 */
import java.util.Scanner;

public class GpaCalculator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        
        System.out.println("SIMPLE GRADING SYSTEM");

        Scanner input = new Scanner(System.in);
        
        System.out.println("Enter number of courses");
       
        int cLength=input.nextInt();
        
        String courseName[] = new String[cLength];
        
        int creditUnit[] = new int[cLength];
        
        String grades[] = new String[cLength];
        
        int scores[] = new int[cLength];

        int totalWeight = 0;

        int totalScoreWeight = 0;

        GpaCalculator t = new GpaCalculator();
        input.nextLine();
        for (int j = 0; j < courseName.length; j++) {

            System.out.print("\n Enter Course Name " + (j+1)+": ");
            courseName[j] = input.nextLine();

            System.out.print("\nEnter " + courseName[j] + " grade Unit: ");
            creditUnit[j] = input.nextInt();

            System.out.print("\n Enter " + courseName[j] + " score: ");
            scores[j] = input.nextInt();
            
            input.nextLine();

        }

        for (int i = 0; i < scores.length; i++) {

            int scoreGrade = t.check(scores[i]);
           grades[i] = t.getGrade(scoreGrade);
          
            totalWeight += creditUnit[i];

            totalScoreWeight += scoreGrade * creditUnit[i];

        }

        double gpa = (double) totalScoreWeight / totalWeight;

        System.out.println("|-------------|---------------|------------|----------|");
        System.out.println();
        System.out.printf("|%-13s|%-15s|%-12s|%-10s|\n", "Course", "Grade unit", "Score","Grade");
        System.out.println();
        System.out.println("|-------------|---------------|------------|----------|");
        
         for (int i = 0; i < courseName.length; i++) {
 
        System.out.printf("|%-13s|%-15s|%-12s|%-10s|\n", courseName[i], creditUnit[i], scores[i],grades[i]);
       
            
        }
             System.out.printf("\nYour GPA is: %.2f%n", gpa);
         

    }

    public int check(int score) {
        if (score >= 70) {
            return 5;
        } else if (score >= 60 && score<=69) {
            return 4;
        } else if (score >= 50 && score<=59) {
            return 3;
        } else if (score >= 45  && score<=49) {
            return 2;
        } else if(score >= 44 && score<=40) {
            return 1;
        }else{
            return 0;
        }
    }
    
     public String getGrade(int unit) {
    String result="";
    
           switch (unit) {
                case 5:
                    result= "A";
                    break;
                case 4:
                   result= "B";
                    break;
                case 3:
                    result = "C";
                    break;
                case 2:
                   result = "D";
                    break;
                case 1:
                  result = "E";
                    break;
                case 0:
                   result= "F";
                    break;
            }
    return result;
}
     
    }
    

