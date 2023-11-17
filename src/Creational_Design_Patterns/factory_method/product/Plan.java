package Creational_Design_Patterns.factory_method.product;

import Creational_Design_Patterns.factory_method.Transport;

public class Plan implements Transport {
    @Override
    public void delivery() {
        System.out.println("delivery Plan");
    }
}
