package hillel.java.pigalev.basic.hw9.FitnesProgram;

public class Information {

    private String name;
    private String dayBirthday;
    private String monthBirthday;
    private int yearBirthday;
    private String phoneNumber;
    private String email;
    private String lastName;
    private int weight;
    private int pressure;
    private String stepsTaken;
    private int age;

    public Information(
        String name,
        String dayBirthday,
        String monthBirthday,
        int yearBirthday,
        String phoneNumber,
        String email,
        String lastName,
        int weight,
        int pressure,
        String stepsTaken
    ){
        this.name = name;
        this.dayBirthday = dayBirthday;
        this.monthBirthday = monthBirthday;
        this.yearBirthday = yearBirthday;
        this.phoneNumber = phoneNumber;
        this.email = email;
        this.lastName = lastName;
        this.weight = weight;
        this.pressure = pressure;
        this.stepsTaken = stepsTaken;
        this.age = 2023 - yearBirthday;
    }

    public String getEmail() {
        return email;
    }

    public String getName() {
        return name;
    }

    public String getDayBirthday() {
        return dayBirthday;
    }

    public String getMonthBirthday() {
        return monthBirthday;
    }

    public int getYearBirthday() {
        return yearBirthday;
    }

    public int getAge() {
        return age;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getPressure() {
        return pressure;
    }

    public void setPressure(int pressure) {
        this.pressure = pressure;
    }

    public String getStepsTaken() {
        return stepsTaken;
    }

    public void setStepsTaken(String stepsTaken) {
        this.stepsTaken = stepsTaken;
    }

    public void printAccountInfo() {
        System.out.println("name: " + name);
        System.out.println("dateBirthday: " + dayBirthday + "." + monthBirthday + "." + yearBirthday);
        System.out.println("age: " + age);
        System.out.println("phoneNumber: " + phoneNumber);
        System.out.println("email: " + email);
        System.out.println("lastName: " + lastName);
        System.out.println("weight: " + weight);
        System.out.println("pressure: " + pressure);
        System.out.println("stepsTaken: " + stepsTaken);
        System.out.println("");
    }
}
