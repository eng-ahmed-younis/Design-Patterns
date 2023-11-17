package Creational_Design_Patterns.abstract_factory.victorian;

import Creational_Design_Patterns.abstract_factory.interfaces.ISofa;

public class VictorianSofa implements ISofa {
    @Override
    public void hasLeg() {
        System.out.println("has leg VictorianSofa");
    }

    @Override
    public void area() {
        System.out.println("area VictorianSofa");

    }
}
