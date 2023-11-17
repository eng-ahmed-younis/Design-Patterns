package Creational_Design_Patterns.abstract_factory;

import Creational_Design_Patterns.abstract_factory.interfaces.FurnitureFactory;
import Creational_Design_Patterns.abstract_factory.interfaces.IChair;
import Creational_Design_Patterns.abstract_factory.interfaces.ICoffeeTable;
import Creational_Design_Patterns.abstract_factory.interfaces.ISofa;
import Creational_Design_Patterns.abstract_factory.victorian.VictorianChair;
import Creational_Design_Patterns.abstract_factory.victorian.VictorianCoffeeTable;
import Creational_Design_Patterns.abstract_factory.victorian.VictorianSofa;

public class VictorianFactory implements FurnitureFactory {
    @Override
    public IChair createChair() {
        return new VictorianChair();
    }

    @Override
    public ISofa createSofa() {
        return new VictorianSofa();
    }

    @Override
    public ICoffeeTable createCoffeeTable() {
        return new VictorianCoffeeTable();
    }
}
