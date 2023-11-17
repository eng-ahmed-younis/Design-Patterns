package Creational_Design_Patterns.abstract_factory.modern;

import Creational_Design_Patterns.abstract_factory.interfaces.IChair;

public class ModernChair implements IChair {
    @Override
    public void hasLeg() {
        System.out.println("has leg modern chair");
    }

    @Override
    public void sitOn() {
        System.out.println("sit on modern chair");
    }
}
