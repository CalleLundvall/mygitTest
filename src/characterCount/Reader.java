package characterCount;

import java.util.Scanner;

public class Reader {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        CharacterCounter Book = new CharacterCounter();
        System.out.println("Greetings! are you ready? Answer with \"yes\" if you wish to proceed.");
        String input = scan.nextLine();

        if (input.equals("yes")) {
            System.out.println("Initalzing Character and line counter");
            System.out.println("Start Typing!");


            while (!input.equals("stop")) {
                input = scan.nextLine();
                System.out.println(input);

                Book.countCharacters(input);
                Book.countLines(input);
                Book.Stopper(input);
            }
        } else {
            System.out.println("Alright... shutting off");
        }

    }

}
