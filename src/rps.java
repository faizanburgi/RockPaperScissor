import java.util.Random;
import java.util.Scanner;

public class rps {
    public static void main(String[] args) {
        Random output = new Random();
        Scanner input = new Scanner(System.in);

        char usrChoice = ' ';

        while(usrChoice != 'e') {
            System.out.println("Enter your choice Rock(r), Paper(p), Scissor(s) or (e) to Exit: ");
            usrChoice = input.next().charAt(0);

            if (usrChoice == 'e') {
                System.out.println("Exiting game. Goodbye!");
                break;
            }
            if (usrChoice != 'r' && usrChoice != 'p' && usrChoice != 's') {
                System.out.println("Invalid Choice! Try Again.");
                continue;
            }

            int rChoice = output.nextInt(3);
            /* 0 means rock, 1 means paper, 2 means scissor*/

            if (rChoice == 0 && usrChoice == 'r') {
                System.out.println("I choose Rock! OOPS, its a draw.");
            } else if (rChoice == 0 && usrChoice == 'p') {
                System.out.println("I choose Rock! Hurray, You won.");
            } else if (rChoice == 0 && usrChoice == 's') {
                System.out.println("I choose Rock! Come on, You lost.");
            } else if (rChoice == 1 && usrChoice == 'r') {
                System.out.println("I choose Paper! Come on, You lost.");
            } else if (rChoice == 1 && usrChoice == 'p') {
                System.out.println("I choose Paper! OOPS, its a draw.");
            } else if (rChoice == 1 && usrChoice == 's') {
                System.out.println("I choose Paper! Hurray, You won.");
            } else if (rChoice == 2 && usrChoice == 'r') {
                System.out.println("I choose Scissor! Oii, You won.");
            } else if (rChoice == 2 && usrChoice == 'p') {
                System.out.println("I choose Scissor! Come on, You lost.");
            } else if (rChoice == 2 && usrChoice == 's') {
                System.out.println("I choose Scissor! OOPS, its a draw.");
            }
        }
    }
}
