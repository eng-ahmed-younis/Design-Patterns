package Creational_Design_Patterns.builder;

import Creational_Design_Patterns.builder.pojo.Desert;
import Creational_Design_Patterns.builder.pojo.Drink;
import Creational_Design_Patterns.builder.pojo.Food;

 public  class  OrderBuilder {
    private int _id;
    private String customer_name ;
    private int tableNumber;

    private Food _food;
    private Drink _drink;

    private Desert _desert;

    public OrderBuilder addId(int id){
        this._id = id;
        return this;
    }

     public OrderBuilder addCustomerName(String name){
         this.customer_name = name;
         return this;
     }

     public OrderBuilder addTableNumber(int number){
         this.tableNumber = number;
         return this;
     }

    public OrderBuilder addFood(Food food){
        this._food = food;
        return this;
    }

    public OrderBuilder addDrink(Drink drink){
        this._drink = drink;
        return this;
    }

    public OrderBuilder addDesert(Desert desert){
        this._desert = desert;
        return this;
    }



    public Order build(){
        return new Order(_id,_food,_drink,_desert);
    }
}
