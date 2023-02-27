package hillel.java.pigalev.basic.hw9.FitnesProgram;

public class Information {
    private String name;
    private String dayBirthday;
    private  String monthBirthday;
    private int yearBirthday;
    private String phoneNumber;
    private String email;

    public String lastName;
    public int weight;
    public int pressure;
    public  String stepsTaken;
    public Information(String name, String dayBirthday, String monthBirthday, int yearBirthday, String phoneNumber, String email, String lastName, int weight, int pressure, String stepsTaken){
        this.name = name;
        this.dayBirthday = dayBirthday;
        this.monthBirthday = monthBirthday;
        this.yearBirthday = yearBirthday;
        this.phoneNumber = phoneNumber;
        this.email = email;
        this.lastName = lastName;
        this.weight = weight;
        this.pressure = pressure;
        this.stepsTaken =stepsTaken;
    }
    private  int age ;

    public String getEmail() {
        return email;
    }

    public String getName() {
        return name;
    }

    public String getDayBirthday() {
        return dayBirthday;
    }
    public String getMonthBirthday(){
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

    public void printAccountInfo(){
        this.age = 2023 - yearBirthday;
        System.out.println("name: " + getName());
        System.out.println("dateBirthday: " + getDayBirthday() + "." + getMonthBirthday() + "." + getYearBirthday());
        System.out.println("age: " + getAge());
        System.out.println("phoneNumber: " + getPhoneNumber());
        System.out.println("email: " + getEmail());
        System.out.println("lastName: " + lastName);
        System.out.println("weight: " + weight);
        System.out.println("pressure: " + pressure);
        System.out.println("stepsTaken: " + stepsTaken);
        System.out.println("");
    }

}
