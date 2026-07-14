public class Cwh_24_break_and_continue {

    static void main(String[] args) {
        // break and continue using loops!
        // for loop

//        for (int i = 0; i < 5; i++) {
//            System.out.println(i);
//            System.out.println("Java is great");
//            if (i == 2) {
//                System.out.println("Ending using break");
//                break;
//            }
//        }

        //  while loop
//        int i = 0 ;
//        while (i < 5) {
//            System.out.println(i);
//            System.out.println("Java is great");
//            if (i == 2 )
//            {
//                System.out.println("ending using break");
//                break;
//            }
//            i++ ;
//        }

        // do - while
//        int i = 0;
//        do {
//            System.out.println(i);
//            System.out.println("Java is great");
//            if (i == 2) {
//                System.out.println("ending using break");
//                break;
//            }
//            i++;
//        }
//        while (i < 5);


        for (int i = 0 ; i< 50 ; i++ ) {
            if (i== 2 ) {
                System.out.println("End the loop :- ");
                continue; // skip he line's if condition match's
            }
            System.out.println(i);
            System.out.println("Java is great");
        }
    }
}
