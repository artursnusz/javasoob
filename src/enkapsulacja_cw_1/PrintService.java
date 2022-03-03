package enkapsulacja_cw_1;

import java.sql.SQLOutput;

public class PrintService {
    public void printSummary(Client client, double originalPrice, double discountPrice){
        printWelcomeMessage(client);
        printPrices(originalPrice, discountPrice);
    }

    public void printWelcomeMessage(Client client){
        String firstName = client.getFirstName();
        String lastName = client.getLastName();
        System.out.println("Witaj " + firstName + " " + lastName);
    }

    public void printPrices(double originalPrice, double discountPrice){
        System.out.println("Kwota przed rabatem: " + originalPrice);
        System.out.println("Do zapłaty (po rabacie): " + discountPrice);

    }
}
