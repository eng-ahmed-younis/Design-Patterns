package decorator;

public class Mocha extends CondimentDecorator {

    public Mocha(Beverage beverage){
        this.beverage = beverage;
    }

    @Override
    public double cost() {
        return this.beverage.cost() + .50 ;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + " and Mocha ";
    }
}
