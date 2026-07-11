import java.util.Scanner;
public class Exercise1_cbseboard_percentage_calculator {
    static void main(String[] args) {

        System.out.println("Enter your all 5 subject marks :- ");
        int total = 500 ;
        Scanner sc = new Scanner(System.in);
        System.out.println("English :- ");
        byte m1  = sc.nextByte();
        System.out.println("Maths :- ");
        byte m2  = sc.nextByte();
        System.out.println( "History :- ");
        byte m3  = sc.nextByte();
        System.out.println("computer :- ");
        byte m4  = sc.nextByte();
        System.out.println("Physics :- ");
        byte m5  = sc.nextByte();

int obtain = m1 + m2 + m3 + m4 + m5 ;
double pecentage = (obtain * 100 ) / total ;
int average = obtain / 5 ;

        System.out.println("---------Cbse Board marks Calculation---------");
        System.out.println();
        System.out.println( "Total obtain marks In all out of 500 Marks IS :- " + obtain);
        System.out.println("The average marks of all subject :- " + average );
        System.out.println("The percentage you got In all 5 Subject's :- " + pecentage + "%") ;





    }


}

