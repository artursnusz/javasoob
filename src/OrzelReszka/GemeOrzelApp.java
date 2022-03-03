package OrzelReszka;

import java.util.Scanner;

public class GemeOrzelApp {
    public static void main(String[] args) {

        int option;
        // create an object of Scanner class
        Scanner input = new Scanner(System.in);
        while (true) {
            System.out.println("Orzel czy reszka (1 orzel, 0 reszka)");
            option = input.nextInt();

            if (option == 5) {
                break;
            } else {
                int losuj = new GameOrzelLogic().getRandom();

                if (option == 0) {
                    if (option == losuj) {
                        System.out.println("Wygrales");
                    } else {
                        System.out.println("Przegrales");
                    }
                }

                if (option == 1) {
                    if (option == losuj) {
                        System.out.println("Wygrales");
                    } else {
                        System.out.println("Przegrales");
                    }
                }
            }
        }
    }

}