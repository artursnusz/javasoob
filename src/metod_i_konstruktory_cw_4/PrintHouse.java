package metod_i_konstruktory_cw_4;

class PrintHouse {
    public static void main(String[] args) {
        House product1 = new House(10000, 1000);
        System.out.println(product1.water);
        product1.takeShower();
        System.out.println(product1.getStatus());
        product1.takeShower();
        System.out.println(product1.getStatus());
        //System.out.println(product1.water);

    }
}