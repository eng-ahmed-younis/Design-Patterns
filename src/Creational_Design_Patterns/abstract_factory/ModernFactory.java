package Creational_Design_Patterns.abstract_factory;

import Creational_Design_Patterns.abstract_factory.interfaces.FurnitureFactory;
import Creational_Design_Patterns.abstract_factory.interfaces.IChair;
import Creational_Design_Patterns.abstract_factory.interfaces.ICoffeeTable;
import Creational_Design_Patterns.abstract_factory.interfaces.ISofa;
import Creational_Design_Patterns.abstract_factory.modern.ModernChair;
import Creational_Design_Patterns.abstract_factory.modern.ModernCoffeeTable;
import Creational_Design_Patterns.abstract_factory.modern.ModernSofa;

public class ModernFactory implements FurnitureFactory {
    @Override
    public IChair createChair() {
        return new ModernChair();
    }

    @Override
    public ISofa createSofa() {
        return new ModernSofa();
    }

    @Override
    public ICoffeeTable createCoffeeTable() {
        return new ModernCoffeeTable();
    }
}
