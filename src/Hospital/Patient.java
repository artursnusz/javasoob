package Hospital;

public class Patient {
    private String nazwisko;
    private int pesel;
    private String imie;


    public Patient(String imie, String nazwisko, int pesel) {
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.pesel = pesel;
    }


    public void printInfo() {
        String info = imie + "; " + nazwisko + "; " + pesel;
        System.out.println(info);


    }
}