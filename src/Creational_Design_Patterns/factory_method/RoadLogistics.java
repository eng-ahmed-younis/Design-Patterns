package Creational_Design_Patterns.factory_method;

// concrete class

import Creational_Design_Patterns.factory_method.product.Truck;

/** Then, subclasses override the factory method to specify what type of object should be created
 * */
public class RoadLogistics extends Logistics{
    @Override
    Transport createTransport() {
        return new Truck();
    }

}
