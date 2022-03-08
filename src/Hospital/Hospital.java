package Hospital;
import java.util.Scanner;

public class Hospital {

    private Scanner sc = new Scanner(System.in);
    private final int maxPatients = 2;
    private Patient[] patients = new Patient[maxPatients];
    private int patientNumber = 0;

    public void close() {
        sc.close();
    }

    public int getInt() {
        int number = sc.nextInt();
        sc.nextLine();
        return number;
    }


    public void bookPatient(Patient patient){
        if(patientNumber < maxPatients) {
            patients[patientNumber] = patient;
            patientNumber++;
            System.out.println(patientNumber);
        } else {
            System.out.println("Maksymalna liczba pacjentow została osiągnięta");
        }
    }

    public void printPatients() {
        if(patientNumber == 0) {
            System.out.println("Brak zarejestrowanych pacjentow");
        }
        for(int i=0; i<patientNumber; i++) {
            patients[i].printInfo();
        }
    }

    public Patient readAndCreateBook() {
        System.out.println("Imie: ");
        String imie = sc.nextLine();
        System.out.println("Nazwisko: ");
        String nazwisko = sc.nextLine();
        System.out.println("Pesel: ");
        int pesel = getInt();

        return new Patient(imie,nazwisko,pesel);
    }

}
