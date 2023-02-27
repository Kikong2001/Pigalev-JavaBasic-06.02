package hillel.java.pigalev.basic.hw8;

import hillel.java.pigalev.basic.hw8.Person;

public class PersonInfo {
    public static void main(String[] args) {
        Person personOne = new Person("WillSmith",  "Smith", " New York ", " 2936729462846");
        System.out.println(personOne.personInfo());
        Person personTwo = new Person("Jackie ", "Chan", "Shanghai ", "12312412412");
        System.out.println(personTwo.personInfo());
        Person personThree = new Person("Sherlock ", "Holmes", "London ", "37742123513");
        System.out.println(personThree.personInfo());
    }
}
