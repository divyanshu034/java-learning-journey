import java.util.Scanner ;
public class Cwh_13_Strings {

    static void main(String[] args) {
//        String name = new String("Divyanshu") ;
        String name = "Divyanshu" ;
        int a = 6 ;
        float b = 5.64f ;
        // print f and format ke  bare me
        System.out.printf("The value of a %d and valut of b is %f",a,b);
        System.out.println();
        System.out.format("The value of a %d and valut of b is %f",a,b);
        System.out.println();
        // string's
        System.out.print("The name is :-  ");
         System.out.println(name);


         Scanner sc = new Scanner(System.in);
//         String st = sc.next(); // only one word is print not whole sentence
        String st2 = sc.nextLine(); // with the help of that we can print whole sentence
//        System.out.println(st);
        System.out.println(st2);

    }
}
