package metod_i_konstruktory_cw_4;

public class House {
    double water;
    double rope;

    public House(double woda, double ropa) {
        this.water = woda;
        this.rope = ropa;
    }

    void takeShower() {
        water = water-48;
    }

    String getStatus() {
        return "Ilość wody: " + this.water + " litrów, ropa: " + this.rope + " litrów";
    }

}
