package Creational_Design_Patterns.abstract_factory.victorian;

import Creational_Design_Patterns.abstract_factory.interfaces.IChair;

public class VictorianChair implements IChair {
    @Override
    public void hasLeg() {
        System.out.println("has leg VictorianChair");
    }

    @Override
    public void sitOn() {
        System.out.println("sit on VictorianChair");
    }
}
