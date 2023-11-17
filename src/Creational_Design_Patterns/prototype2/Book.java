package Creational_Design_Patterns.prototype2;

public abstract class Book implements Cloneable{

    private String bookCategory;
    private int price;

    public String getBookCategory() {
        return bookCategory;
    }

    public void setBookCategory(String bookCategory) {
        this.bookCategory = bookCategory;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

   // Line 25- super.clone() means it goes to the superclass clone method.
    public Object clone(){
        Object clone = null;
        try {
            clone = super.clone();
        }catch (CloneNotSupportedException exception){
            exception.getStackTrace();
        }
        return clone;
    }






}