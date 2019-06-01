/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lienkeqlyhocsinh;

import java.sql.SQLException;
import java.util.List;
import java.util.Scanner;
import static jdk.nashorn.tools.ShellFunctions.input;


/**
 *
 * @author Administrator
 */
public class Main {
    public static void main(String[] args) throws SQLException {
        try {
            Scanner input = new Scanner(System.in);
            System.out.println(" QUIZ ONLINE ");
            System.out.println("----------");
            System.out.println("Email:");
            String email = input.nextLine();
            System.out.println("pass:");
            String pass = input.nextLine();
            StudentManager sm = new StudentManager();
            Student s = sm.login(email, pass);
           
            if(s != null){
                System.out.println("LOGIN SUCCESS");
                input.nextLine();
                System.out.println("----------");
                QuestionManager qm = new QuestionManager();
                List <Question> questions = qm.getQuestions();
                int countCorr = 0;
                int index = 1;
                for (Question q : questions){
                    System.out.printf("Question %d/%d \n", index++,questions.size());
                    System.out.println(q);
                    System.out.print("Your answer >");
                    String answer = input.nextLine();
                    sm.addAnswer(s,q,answer);
                    if (answer.toLowerCase().equals(q.getCorrect().toLowerCase())){
                        countCorr++;
                    }
                }
                System.out.println("Congratulation!");
                System.out.printf("Your result: %d %d \n",countCorr,questions.size());
                System.out.println("See Detail(Y/N)");
                sm.printResult();
                
            } else {
                System.out.println("LOGIN FAIL");
            }
        } catch (ClassNotFoundException ex) {
            ex.printStackTrace();
        }
        
        
    }
   
    
}
