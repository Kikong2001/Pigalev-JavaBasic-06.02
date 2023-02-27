package hillel.java.pigalev.basic.hw8;

public class Person {

    public String name;
    public String lastName;
    public String city;
    public String numberPhone;

    public Person(String name, String lastName, String city, String numberPhone) {
        this.name = name;
        this.lastName = lastName;
        this.city = city;
        this.numberPhone = numberPhone;
    }

    public String personInfo() {
        return "Зателефонувати громадянину " + name + lastName + "із міста " + city + "можна за номером " + numberPhone;
    }
}

