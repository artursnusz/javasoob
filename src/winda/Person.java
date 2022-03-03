package winda;

 class Person {

    private String firstName;
    private String lastName;
    private double waga;
    private int id;

    public Person(String firstName, String lastName, double waga, int id) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.waga = waga;
        this.id = id;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setWaga(double waga) {
        this.waga = waga;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public double getWaga() {
        return waga;
    }

    public int getId() {
        return id;
    }
}
