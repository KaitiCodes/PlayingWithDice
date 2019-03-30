import java.util.Random;
import java.util.Scanner;

public class RollerDice {

    public static void main(String[] args) {
        Scanner taserFace = new Scanner(System.in);
        Random dSix    = new Random();
        Random dTwelve = new Random();
        int number;
        int number2;


        System.out.println("Which dice would you like to roll? ");
        String userInput = taserFace.nextLine();


        if (userInput.equals("D6")) {
            System.out.println("Your D6 rolls are: ");
            for (int roll = 1; roll <= 10; roll++) {
                number = 1 + dSix.nextInt(6);
                System.out.println(number);
            }
        } else if (userInput.equals("D12")) {
            System.out.println("Your D12 rolls are ");
            for (int roll2 = 1; +roll2 <= 10; roll2++) {
                number2 = 1 + dTwelve.nextInt(12);
                System.out.println(number2);
            }
        } else {
            System.out.println("We do not have that die available!");
        }

        System.out.println("Thank you for rolling!");

    }
}
