package Creational_Design_Patterns.prototype2;

import java.util.HashMap;
import java.util.Map;

/** BookRegistry class. This is the place where you created the object.
 * we use the “new” keyword only when we created the initial object.
 * */
public class BookRegistry {

    private Map<BookType, Book> books = new HashMap<>();

    public BookRegistry(){
        this.initialize();
    }

    public Book getBook(BookType bookType){
        Book book = null;

        book = (Book) books.get(bookType).clone();

        return book;
    }

    private void initialize(){
        Educational edu = new Educational();
        edu.setPrice(2000);
        edu.setType("High School Books");
        edu.setBookCategory("Science");


        Story story = new Story();
      //  story.setAgelimit(18);
        story.setBookCategory("Comedy");
        story.setPrice(200);


        Literature literature = new Literature();
        literature.setType("EnglishLiterature");
        literature.setPrice(1000);
        literature.setBookCategory("Romance");



        books.put(BookType.EDUCATIONAL,edu);
        books.put(BookType.STORY,story);
        books.put(BookType.LITERATURE,literature);
    }

}
