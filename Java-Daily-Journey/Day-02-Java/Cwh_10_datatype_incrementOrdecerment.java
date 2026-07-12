import java.util.Scanner;

public class Cwh_10_datatype_incrementOrdecerment {

    static void main(String[] args) {
       // resulting data type after arithmetic operations
        // means when we use 2 data type so one  will evalute in 2 different datatype
        byte x =  5 ;
        short y = 55 ;
        float a  = 65.4f + x ;
       int b  = 45 ;

        System.out.println( a );


        // !!!!!! Increment and decremnet operators !!!!!!
        Scanner sc = new Scanner(System.in) ;
        int i = sc.nextInt();


        System.out.println(i++);  // phele i value print hojayegi  then ++ operator + 1 karega value's ko
        System.out.println(i); //and yaha per i++ ki overall value ayegi yani assign value  56 + 1
        ////////////////////////////

        System.out.println(++i); // Now here 1 st ++ operator works means phele 1+ value aage agayi the i ki value agyei so assigne value and +1 phele hi hoajyegi
        System.out.println(i); // so same output come as ++i come's

        System.out.println("DECREMENT !!!!!!!! ");

        System.out.println(i--);   // 58 print then  58 - 1
        System.out.println(i); //  so 58 - 1 = 57
        System.out.println(--i); // -1+57 = 56
        System.out.println(i); // same as --i 56



         int c = 7 ;
         int d = ++c * 8 ;
        System.out.println( d ); // 64
    }
}
