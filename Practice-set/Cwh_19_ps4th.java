import java.util.Scanner;

public class Cwh_19_ps4th {

    static void main(String[] args) {
//
//        //Question 1st
//
//        int a = 10;
//        if (a == 11) {
//            System.out.println("Iam 11 now ");
//        } else {
//            System.out.println("Iam Not 11 now ");
//        }
//
//        //Question 2nd
//
//        //wap to find a stdnt pass or fail criteria total 40 % required and at least 33 % for pass take input
//
//        System.out.println("Hey please enter your subject marks ");
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter subject of 1st subj english :- ");
//        int m1 = sc.nextInt();
//        System.out.println("Enter 2nd subject hindi  :- ");
//        int m2 = sc.nextInt();
//        System.out.println("Enter 3rd subject marks maths :- ");
//        int m3 = sc.nextInt();
//
//        int total = m1 + m2 + m3;
//        int percentage = (total * 100) / 300;
//
//        if (percentage >= 40 && m1 >= 33 && m2 >= 33&& m3 >= 33 ) {
//            System.out.println("you are pass by more than 40% ! your percent :-  " + percentage);
//        } else {
//            System.out.println("You just pass !" + percentage);
//        }

        // Question 3rd

//        Scanner sc = new Scanner(System.in) ;
//        float income = sc.nextFloat() ;
//        float tax = 0 ;
//        if (income < 2.5 ) {
//            tax = tax + 0 ;
//        }
//        else if (income >2.5f && tax <= 5.0f ) {
//            tax = tax + 0.05f * (income - 2.5f ) ;
//        }
//        else if (income >5f && income <= 10f ) {
//            tax = tax + 0.05f * (5.0f - 2.5f);
//            tax = tax + 0.2f * (income - 5.0f ) ;
//        }
//        else if ( income > 10f ) {
//            tax = tax + 0.05f * (5.0f - 2.5f);
//            tax = tax + 0.2f * (10.0f - 5.0f ) ;
//            tax = tax + 0.3f * (income - 10.0f ) ;
//        }
//        System.out.println("the total tax paid by the emplaye is :- " + tax );

//        // Question 4th
//        Scanner sc = new Scanner(System.in);
//        int day = sc.nextInt();
//
//        switch (day) {
//            case 1 -> System.out.println("Monday");    // we dont use  break ; instead of that we use ->
//
//            case 2 -> System.out.println("Tuesday");
//
//            case 3 -> System.out.println("wednesday");
//            case 4 -> System.out.println("thrusday");
//            case 5 -> System.out.println("friday");
//            case 6 -> System.out.println("saturday");
//            case 7 -> System.out.println("sunday");
//    }

//Question 5th
//        Scanner sc = new Scanner(System.in) ;
// int year = sc.nextInt();
//
// if (year % 400 == 0 || ( year % 4 == 0 && year % 100 != 0 ) ) {
//     System.out.println(year + "Is a leap year ") ;
// }
//else  {
//     System.out.println(year + "Is not a leap year ");
// }


// Question 6th
        System.out.println("Enter the url to check which type of this website");
        Scanner sc = new Scanner(System.in);
        String website = sc.next();

        if (website.endsWith(".org" ) ) {
            System.out.println("this is organization website");
        } else if (website.endsWith(".com")) {
            System.out.println("this is commercial website");
        } else if (website.endsWith(".in")) {
            System.out.println("This is an Indian website");

        }

    }
}
