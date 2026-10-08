package dz3;

public class Person {


    public static void main(String[] args) {
        Person per1 = new Person("Илья", "Андреев", "123-45-6789");
        Person per2 = new Person("Казимир", "Андреев", "123-45-6786");
        Person per3 = new Person("Вова", "Андреев", "123-45-6489");

        per1.printPersonInfo();
        per2.printPersonInfo();
        per3.printPersonInfo();

        System.out.println("Имя изменилось");

        per1.setFirstName("Богдан");

        per1.printPersonInfo();
        per2.printPersonInfo();
        per3.printPersonInfo();

    }

    private String firstName;
    private String lastName;
    private final String ssn;

    public Person (String firstName, String lastName, String ssn) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.ssn = ssn;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getLastName() {
        return lastName;
    }


    public String getSsn() {
        return ssn;
    }

    public void printPersonInfo() {
        System.out.println("Имя - " + firstName + " Фамилия - " + lastName +" SSN - " + ssn);
    }

}
