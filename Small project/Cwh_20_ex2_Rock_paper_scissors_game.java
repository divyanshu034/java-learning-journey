import java.util.Scanner ;
import java.util.Random ;

public class Cwh_20_ex2_Rock_paper_scissors_game {

    static void main(String[] args) {
Scanner sc = new Scanner(System.in) ;
Random ran = new Random() ;
        System.out.println("1. Rock");
        System.out.println("2. Paper");
        System.out.println("3. Scissor");
        System.out.println("Enter your choice");
        int choice = sc.nextInt();
        int computer = ran.nextInt(3) + 1 ;

        System.out.println("Computer choose :- " + computer );

        if (choice == computer ) {
            System.out.println("Result :-  Draw");
        }  else if (choice == 1 && computer ==  2 ) {
            System.out.println("Result :- computer win's");
        }
        else if (choice == 1 && computer ==  3 ) {
            System.out.println("Result :- Human win's");
        }
        else if (choice == 2 && computer ==  1 ) {
            System.out.println("Result :- Human win's");
        }else if (choice == 2 && computer ==  3 ) {
            System.out.println("Result :- computer win's");
        }else if (choice == 3 && computer ==  1 ) {
            System.out.println("Result :- computer win's");
        }else if (choice == 3 && computer ==  2 ) {
            System.out.println("Result :- Human win's");
        }
        else {
            System.out.println("Invalid choice !");
        }
    }
}
