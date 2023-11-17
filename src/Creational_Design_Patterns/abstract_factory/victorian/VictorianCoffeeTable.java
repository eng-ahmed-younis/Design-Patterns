package Creational_Design_Patterns.abstract_factory.victorian;

import Creational_Design_Patterns.abstract_factory.interfaces.ICoffeeTable;

public class VictorianCoffeeTable implements ICoffeeTable {
    @Override
    public void coffeeTableStyle() {
        System.out.println("coffeeTableStyle");
    }
}
