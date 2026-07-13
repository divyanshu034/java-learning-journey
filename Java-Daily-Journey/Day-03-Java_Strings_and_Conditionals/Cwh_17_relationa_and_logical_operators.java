public class Cwh_17_relationa_and_logical_operators {

    static void main(String[] args) {
 // logical operators :- && ----> (both must be true conditions)  AND , || ---> OR , ! ----> NOT  ;
       boolean a = true ;
       boolean b = true ;
       boolean c = true;

       if  ( a && b  && c){
           System.out.println("yes correct ");

       }
       else {
           System.out.println("No not correct");
       }

       // Or operators ||

        System.out.println();

       boolean d= true ;
       boolean e = false ;
       if (d || e ) {
           System.out.println("yes ");
       }
       else {
           System.out.println( "No ");
       }
   // logical not !

        System.out.print("Not of(a) is ");
        System.out.println(!a);
        System.out.print("Not of(b) is ");
        System.out.println(!b);


    }

}
