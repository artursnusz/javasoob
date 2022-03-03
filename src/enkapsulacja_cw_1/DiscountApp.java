package enkapsulacja_cw_1;

class DiscountApp {
    public static void main(String[] args) {
        Client client1 = new Client("Jan", "Kowalski", true);
        double price1 = 1100;


        DiscountService discountService = new DiscountService();
        double priceDiscount1 = discountService.calculateDiscountPrice(client1, price1);


        PrintService print = new PrintService();
        print.printSummary(client1, price1, priceDiscount1);

    }
}
