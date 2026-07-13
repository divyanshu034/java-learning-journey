public class Cwh_15_ps3rd {
    static void main(String[] args) {
        // Question 1 convert a string in lowercases

        String name = "DivyAnsHU" ;
        System.out.println(name.toLowerCase());
        // Question 2 replace space with underscores
        String name2 = "Hey My name is " ;
        System.out.println(name2.replace(" " , "_"));

        //Question 3rd
        String name3 = "Divyanshu" ;
        System.out.println("\"Dear " + name3 + ", Thanks a lot! \"");
        // or may be
        String letter = "Dear <|name|>, Thanks a lot!" ;
        System.out.println(letter.replace("<|name|>" , "Divyanshu"));

        //Question 4th
        String name4 = "This string conatains  double and   triple spaces " ;
        System.out.println(name4.indexOf("   ")); // 3 space
        System.out.println(name4.indexOf("    ")); // 4 space

        // Question 5th
        String newletter = "Dear Harry, \n \t This Java Course is Nice. \n \tThanks!" ;
        System.out.println(newletter);
    }
}
