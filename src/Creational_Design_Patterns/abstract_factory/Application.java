package Creational_Design_Patterns.abstract_factory;

import Creational_Design_Patterns.abstract_factory.interfaces.FurnitureFactory;
import Creational_Design_Patterns.abstract_factory.interfaces.IChair;
import Creational_Design_Patterns.abstract_factory.interfaces.ICoffeeTable;
import Creational_Design_Patterns.abstract_factory.interfaces.ISofa;

public class Application {
    private ISofa sofa;
    private IChair chair;
    private ICoffeeTable coffeeTable;


    public Application(FurnitureFactory furnitureFactory) {
        this.chair = furnitureFactory.createChair();
        this.sofa = furnitureFactory.createSofa();
        this.coffeeTable = furnitureFactory.createCoffeeTable();
    }


    public void chairStyle(){
        chair.hasLeg();
        chair.sitOn();
    }
}
