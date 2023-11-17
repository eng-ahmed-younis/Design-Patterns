package Creational_Design_Patterns.factory_method.product;

import Creational_Design_Patterns.factory_method.Transport;

public class Ship implements Transport {
    @Override
    public void delivery() {
        System.out.println("ship delivery");
    }
}
