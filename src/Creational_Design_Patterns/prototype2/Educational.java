package Creational_Design_Patterns.prototype2;

public class Educational extends Book{

    private String type;


    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {

        return "Educational{" +
                "type=" +type+
                '}';
    }
}