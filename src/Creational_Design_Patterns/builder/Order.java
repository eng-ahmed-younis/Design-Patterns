package Creational_Design_Patterns.builder;

import Creational_Design_Patterns.builder.pojo.Desert;
import Creational_Design_Patterns.builder.pojo.Drink;
import Creational_Design_Patterns.builder.pojo.Food;

public class Order {
    // required
    public int id;
    public String customer_name ;
    public int tableNumber;
    // optional
    public Food food;
    public Drink drink;
    public Desert desert;

    public Order(int id, Food food, Drink drink, Desert desert) {
        this.id = id;
        this.food = food;
        this.drink = drink;
        this.desert = desert;
    }


    public void orderDetails(){
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("id is ".concat(String.valueOf(id)));
        stringBuilder.append("food type is " + food.getType() + " ammount is "+ food.getAmount());

        System.out.println(
                stringBuilder
        );
    }

}
