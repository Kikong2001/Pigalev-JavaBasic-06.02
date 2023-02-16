package hillel.java.pigalev.basic.hw8;

public class Person {
    public String personInfo(String name, String lastName, String city, String numberPhone) {
        return "Зателефонувати громадянину " + name + lastName + "із міста " + city + "можна за номером " + numberPhone;
    }
    public static void main(String[] args) {
        Person personOne = new Person();
        System.out.println(personOne.personInfo("WillSmith ",  "Smith", " New York ", " 2936729462846"));
        Person personTwo = new Person();
        System.out.println(personTwo.personInfo("Jackie ", "Chan", "Shanghai ", "12312412412"));
        Person personThree = new Person();
        System.out.println(personThree.personInfo("Sherlock ", "Holmes", "London ", "37742123513"));
    }
}

