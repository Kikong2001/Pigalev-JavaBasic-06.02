package hillel.java.pigalev.basic.hw9.Burgers;

public class BurgerMain {
    public static void main(String[] args) {
        Burger classicBurger = new Burger("Bun", "Meat", "Cheese", "Lettuce", "Mayonnaise");
        Burger dieteticBurger = new Burger("Bun", "Meat", "Cheese", "Lettuce");
        Burger doubleMeatBurger = new Burger("Bun", "Meat", "doubleMeat", "Cheese", "Lettuce", "Mayonnaise");

    }
}
