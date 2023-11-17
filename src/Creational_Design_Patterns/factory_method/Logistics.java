package Creational_Design_Patterns.factory_method;
/**. It is implemented by creating an interface or an abstract class
 *  with a factory method responsible for creating objects
 * */
// factory class
abstract public class Logistics {

    Transport transport = createTransport();
    public void welcomeLogistics(){
        System.out.println("welcome Logistics company");
    }

    /***factory method */
    abstract Transport createTransport();

    // this method take object of transport to perform delivery
    public void doDeliveryTransport(){
        transport.delivery();
    }
}
