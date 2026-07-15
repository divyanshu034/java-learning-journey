import java.util.Scanner ;
public class Cwh_27_arrays_for_each_loops {
    static void main(String[] args) {
//        int[] first = new int[5] ;
//        int[] second;
//        second = new int[5] ;

        int[] marks = {31, 97, 68, 48, 57};
        System.out.println(marks.length);
        // Display all array we use loops
//        System.out.println("printing using for loop");
//
//        for (int i = 0; i < marks.length; i++) {
//            System.out.println(marks[i]);
//        }
//
//        // reverse order
//        System.out.println("Reverse order of Araay's");
//        Scanner sc =new Scanner(System.in) ;
//
//        for (int i = marks.length - 1 ; i>= 0 ; i--  ) {
//            System.out.println(marks[i]);
//        }
//
        // For - Each Loop
    for (int element: marks){
        System.out.println(element);
    }
    }

}