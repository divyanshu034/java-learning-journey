import java.util.Scanner ;
public class Cwh_12_ps2 {
    static void main(String[] args) {
     //Question 1

     float a = 7/4.0f  * 9/2.0f  ;   // yeh concept presedence and associtivity ka
        // jisme  * / ki presedence same hoti hai so associativty ke hisaab se left to right calulation hogi
        System.out.println(a);

        // Question 2
        // problem 2nd

        char grade = 'B' ;
        grade = (char)(grade + 8 ) ;

        System.out.println(grade);

        // decrypting the grade
        grade = (char)(grade  - 8 ) ;
        System.out.println(grade);

        // question 3rd
        System.out.println("3rd question :- ");
        Scanner sc = new Scanner(System.in) ;
        int b = sc.nextInt();
        System.out.println(b >  8   );

        // Question 4th

        int v = 1 ;
        int u = 2 ;
        int q = 3 ;
        int s  = 4 ;
        int express = ( v*v - u-u ) / 2* q *s ;
        System.out.println(express);

        //Question 5th

        int x = 7 ;
        int y = 7 * 49 / 7 + 35/7 ;
        System.out.println(y);





    }
}
