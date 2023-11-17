package Creational_Design_Patterns.abstract_factory.modern;

import Creational_Design_Patterns.abstract_factory.interfaces.ICoffeeTable;

public class ModernCoffeeTable implements ICoffeeTable {
    @Override
    public void coffeeTableStyle() {
        System.out.println("coffeeTableStyle");
    }
}
