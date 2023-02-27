package hillel.java.pigalev.basic.hw9.FitnesProgram;

public class Account {
    public static void main(String[] args) {
        Information firstUser = new Information("Даня", "12", "07", 2001, "+380976789545", "fasfasf@gmail.com", "Pigalev", 76, 90,"12356");
        Information secondUser = new Information("Igor", "15", "01", 2000, "+38097678675", "igor@gmail.com", "K",80, 90,"20453");
        Information threeUser = new Information("Alyona", "19", "04", 1997, "+3809769832", "alyona@gmail.com", "D",56, 90,"2345");
        System.out.println("");
        System.out.println("firstUser");
        firstUser.printAccountInfo();
        System.out.println("secondUser");
        secondUser.printAccountInfo();
        System.out.println("threeUser");
        threeUser.printAccountInfo();
    }
}
