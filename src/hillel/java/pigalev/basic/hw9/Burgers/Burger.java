package hillel.java.pigalev.basic.hw9.Burgers;

public class Burger {
    public String burgerBun = "burgerBun";
    public String meat = "meat";
    public String cheese = "cheese";
    public String lettuce = "lettuce";
    public String mayonnaise = "mayonnaise";
    public Burger(String burgerBun, String meat, String cheese, String lettuce, String mayonnaise){
        System.out.println("1: " + burgerBun);
        System.out.println("2: " + meat);
        System.out.println("3: " + cheese);
        System.out.println("4: " + lettuce);
        System.out.println("5: " + mayonnaise);
    }
    public Burger(String burgerBun, String meat, String cheese, String lettuce){
        System.out.println("");
        System.out.println("1: " + burgerBun);
        System.out.println("2: " + meat);
        System.out.println("3: " + cheese);
        System.out.println("4: " + lettuce);
    }
    public Burger (String burgerBun, String meat, String doubleMeat, String cheese, String lettuce, String mayonnaise) {
        doubleMeat = meat;
        System.out.println("");
        System.out.println("1: " + burgerBun);
        System.out.println("2: " + meat);
        System.out.println("3: " + doubleMeat);
        System.out.println("4: " + cheese);
        System.out.println("5: " + lettuce);
        System.out.println("6: " + mayonnaise);
    }
}
