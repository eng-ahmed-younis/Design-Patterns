import Creational_Design_Patterns.abstract_factory.Application;
import Creational_Design_Patterns.abstract_factory.ModernFactory;
import Creational_Design_Patterns.builder.Order;
import Creational_Design_Patterns.builder.OrderBuilder;
import Creational_Design_Patterns.builder.pojo.Desert;
import Creational_Design_Patterns.builder.pojo.Food;

import Creational_Design_Patterns.prototype2.BookRegistry;
import Creational_Design_Patterns.prototype2.BookType;
import Creational_Design_Patterns.prototype2.Educational;
import Structure_designe_patterns.adapter.AudioPlayer;
import Structure_designe_patterns.bridge.devices.Device;
import Structure_designe_patterns.bridge.devices.Radio;
import Structure_designe_patterns.bridge.devices.Tv;
import Structure_designe_patterns.bridge.remotes.AdvancedRemote;
import Structure_designe_patterns.bridge.remotes.BasicRemote;
import Structure_designe_patterns.composition.Department;
import Structure_designe_patterns.composition.HeadDepartment;
import Structure_designe_patterns.composition.leaf.FinancialDepartment;
import Structure_designe_patterns.composition.leaf.SalesDepartment;
import Structure_designe_patterns.decorator.Circle;
import Structure_designe_patterns.decorator.Rectangle;
import Structure_designe_patterns.decorator.RedShapeDecorator;
import Structure_designe_patterns.decorator.Shape;
import decorator.Beverage;
import decorator.Espresso;
import decorator.Mocha;


public class Main {
    public static void main(String args[]) {

        Shape circle = new Circle();

        Shape redCircle = new RedShapeDecorator(new Circle());

        Shape redRectangle = new RedShapeDecorator(new Rectangle());

        System.out.println("Circle with normal border");
        circle.draw();

        System.out.println("\nCircle of red border");
        redCircle.draw();

        System.out.println("\nRectangle of red border");
        redRectangle.draw();


    /*    Beverage espresso = new Espresso();
        System.out.println(espresso.getDescription() + espresso.cost());

        Beverage mocha  = new Mocha(espresso);
        System.out.println(mocha.getDescription() + mocha.cost());
*/

    }

}
