package Structure_designe_patterns.decorator;

public class RedShapeDecorator extends ShapeDecorator {

    public RedShapeDecorator(Shape decoratedShape) {
        // pass the instance of shape that want to modify it
        super(decoratedShape);
    }

    @Override
    public void draw() {
        // display the original draw() with additional functionality
        decoratedShape.draw();
        // new functionality that add to shape
        setRedBorder(decoratedShape);
    }

    private void setRedBorder(Shape decoratedShape){
        System.out.println("Border Color: Red");
    }
}