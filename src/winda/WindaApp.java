package winda;

public class WindaApp {
    public static void main(String[] args) {

        Person person = new Person("Artur", "snusz",34,1);
        Person person1 = new Person("Artur", "snusz",34,1);
        Person person2 = new Person("Artur", "snusz",34,1);
        Person person3 = new Person("Artur", "snusz",34,1);
        Person person4 = new Person("Artur", "snusz",34,1);

        Winda winda = new Winda();
        winda.add(person);
        winda.add(person1);
        winda.add(person2);
        winda.add(person3);
        winda.add(person4);
        winda.clear();
        winda.add(person);
    }
}
