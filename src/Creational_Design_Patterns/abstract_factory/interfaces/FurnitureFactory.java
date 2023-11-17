package Creational_Design_Patterns.abstract_factory.interfaces;

/** any one  implement interface need to implement three method
 * 1- createChair
 * 2- createSofa
 * 3- createCoffeeTable
 *
 * */
// is abstract factory
public interface FurnitureFactory {
    IChair createChair(); // get ArtChair or Modern chair or victorian chair
    ISofa createSofa();   // get ArtChair sofa or Modern sofa or victorian sofa
    ICoffeeTable createCoffeeTable();    // get ArtChair CoffeeTable or Modern CoffeeTable or victorian CoffeeTable
}
