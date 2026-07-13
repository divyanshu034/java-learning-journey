import java.util.Scanner ;
public class Cwh_18_switchcase_statement {

    static void main(String[] args) {
        System.out.println("Enter your age :- ");
        Scanner sc = new Scanner(System.in);
        byte age = sc.nextByte();
        // if -  else if ladder
        if (age > 56)
        {
            System.out.println("You are experienced ! ");
        } else if (age > 46)
        {
            System.out.println("you are semi experienced !");
        } else if (age > 36)
        {
            System.out.println("you are semi-semi- experienced ! ");
        } else
        {
            System.out.println("Your are not too much experienced ! ");
        }
        // switch statement
        System.out.println("Enter your age for job :- ");
        int agenew ;
        agenew = sc.nextInt();
        switch (agenew) {
            case 18 :
                System.out.println("You can join college  ");
                break;
            case 21 :
                System.out.println("You are going to join a job ");
                break;
            case 60 :
                System.out.println("You can retire now !  ");
                break;

            default:
                System.out.println("Enjoy your life ");

                // if we not use break so they will print all statement !
        }


    }
}
