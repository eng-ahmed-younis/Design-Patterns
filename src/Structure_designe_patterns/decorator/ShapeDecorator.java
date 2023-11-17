package Structure_designe_patterns.decorator;

/** create an abstract decorator class ShapeDecorator implementing the Shape interface
 *  and having Shape object as its instance variable.
 * */
public abstract class ShapeDecorator implements Shape {
    // instance of object that represent concrete class of shape
    // instance that want to modify it
    // any operation with old instance is represented by it
    protected Shape decoratedShape;

    public ShapeDecorator(Shape decoratedShape){
        this.decoratedShape = decoratedShape;
    }

   /* public void draw(){
        // display the original fun draw of passed object
        decoratedShape.draw();
    }*/


}
