package hillel.java.pigalev.basic.hw8;

public class Person {
    String name;
    String lastName;
    String city;
    String numberPhone;
    public void personInfo(String name, String lastName, String city, String numberPhone){
        this.name = name;
        this.lastName = lastName;
        this.city = city;
        this.numberPhone = numberPhone;
        System.out.println("Зателефонувати громадянину " + name + lastName + "із міста " + city + "можна за номером " + numberPhone);
    }

    public static void main(String[] args) {
        Person personOne = new Person();
        personOne.personInfo("WillSmith ",  "Smith", " New York ", " 2936729462846");
        Person personTwo = new Person();
        personTwo.personInfo("Jackie ", "Chan", "Shanghai ", "12312412412");
        Person personThree = new Person();
        personThree.personInfo("Sherlock ", "Holmes", "London ", "37742123513");
    }
}
