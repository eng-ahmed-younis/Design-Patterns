package Creational_Design_Patterns.builder.pojo;

public class Drink {
    private String drinkType = "tea";

    public Drink(String drinkType) {
        this.drinkType = drinkType;
    }

    public String getDrinkType() {
        return drinkType;
    }

    public void setDrinkType(String drinkType) {
        this.drinkType = drinkType;
    }
}
