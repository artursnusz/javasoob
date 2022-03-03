package winda;

public class Winda {
    private Person[] people = new Person[4];
    private int peopleNumber = 0;
    private final int maxWeight = 400;

    void add(Person person) {
           if(peopleNumber < 4) {
               people[peopleNumber] = person;
               peopleNumber++;
               System.out.println(people.length);
           }
           else{
                System.out.println("W windzie nie ma juz miejsca");
                System.out.println("uu");
            }
    }

    void start() {
        System.out.println("Czas start");
    }

    void getTotalWeight() {
        System.out.println("Czas start");
    }

    void clear() {
        for (int i=0; i< people.length - 1; i++){
            people[i] = null;
        }
        peopleNumber = 0;
    }
}
