import java.util.Scanner ;

public class Cwh_05_input {

    static void main(String[] args) {
        System.out.println( "Taking input from thee user : - " );

      Scanner sc = new Scanner(System.in);
        System.out.println("Enter number 1 :- " );
        int a = sc.nextInt();
        System.out.println("Enter number 2 :- " );
        int b = sc.nextInt();

        int sum = a + b ;

        System.out.println( "SUM IS A + B :-  "+ sum );

//        String strr = sc.next() ;
//        System.out.println(strr);
        String str = sc.nextLine();
        System.out.println(str);






    }

}
