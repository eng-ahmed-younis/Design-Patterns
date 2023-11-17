package Creational_Design_Patterns.abstract_factory.modern;

import Creational_Design_Patterns.abstract_factory.interfaces.ISofa;

public class ModernSofa implements ISofa {
    @Override
    public void hasLeg() {
        System.out.println("has leg ModernSofa");
    }

    @Override
    public void area() {
        System.out.println("area ModernSofa");

    }
}
