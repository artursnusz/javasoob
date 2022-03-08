package Hospital;

public class HospitalApp {

    private final int exit = 0;
    private final int addPatient = 1;
    private final int printPatient = 2;

    private Hospital hospital = new Hospital();

    public void controlLoop() {
        int option;

        do {
            printOptions();
            option = hospital.getInt();
            switch (option) {
                case addPatient:
                    addPatient();
                    break;
                case printPatient:
                    printPatient();
                    break;
                case exit:
                    exit();
                    break;
                default:
                    System.out.println("Nie ma takiej opcji, wprowadź ponownie: ");
            }
        } while(option != exit);
    }

    private void printOptions() {
        System.out.println("Wybierz opcję: ");
        System.out.println(exit + " - wyjście z programu");
        System.out.println(addPatient + " - dodanie nowego pacjenta");
        System.out.println(printPatient + " - wyświetlenie danych pacjenta");
    }

    private void addPatient() {
        Patient patient = hospital.readAndCreateBook();
        hospital.bookPatient(patient);
    }

    private void printPatient() {
        hospital.printPatients();
    }

    private void exit() {
        System.out.println("Koniec programu, papa!");
        // zamykamy strumień wejścia
        hospital.close();
    }
}
