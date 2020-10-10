import java.util.Scanner;

public class Game {
    public static void main(String[] args) {
        Scanner user = new Scanner(System.in);

        int pembantu = 1;

        String welcome = "WELCOME TO GAME!";
        System.out.printf("%75s\n" , welcome);

        System.out.println("What is your name?");
        String nama = user.nextLine();

        System.out.printf("%85s\n" , "Hi " + nama + ", nice to meet you! (next)");

        while(pembantu != 0) {

            String nextSentence = user.next();

            if(nextSentence.equals("next")) {
                System.out.printf("%95s\n" , "In this game we will tell you some rules before started...");

                while(pembantu != 0) {

                   String next2 = user.next();
                   if(next2.equals("next")) {
                       System.out.printf("%90s\n" , "First...you need to answer all question correct!");
                       
                       while(pembantu != 0) {
                          String next3 = user.next();
                          if(next3.equals("next")) {
                              System.out.printf("%100s\n" , "Second...if you get incorrect answer until twice, you will lose!");

                              while(pembantu != 0) {
                                 String next4 = user.next();
                                 if(next4.equals("next")) {
                                     System.out.printf("%110s\n" , "Third...every question must to answer max. 10 second. If you passed, you will lose!");

                                     while(pembantu != 0) {
                                        String next5 = user.next();
                                        if(next5.equals("next")) {
                                            System.out.printf("%80s\n" , "LET'S GET STARTED! (start)");
                                           
                                            while(pembantu != 0) {
                                               String start = user.next();
                                               if(start.equals("start")) {
                                                   System.out.printf("%75s\n" , "Maintenance!");
                                                   pembantu = 0;
                                               } else {
                                                   System.out.println("Please input 'start'!");
                                               }
                                            }
                                        } else {
                                            System.out.println("Please input 'next'!");
                                        }
                                     }

                                 } else {
                                     System.out.println("Please input 'next'!");
                                 }
                              }

                          } else {
                              System.out.println("Please input 'next'!");
                          }
                       }

                   } else {
                       System.out.println("Please input 'next'!");
                   }   
                }
 
            } else {
                System.out.println("Please input 'next'!");
            }
        }
        System.out.println("Loop sudah keluar dari while");
        user.close();
    }
}
