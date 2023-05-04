/* This is a stub for the Library class */
import java.util.Hashtable;
import java.util.Enumeration;
/**
 * Library extends Building
 */
public class Library extends Building{

  private Hashtable<String, Boolean> collection;

  /**
   * constructor for Library
   * @param name
   * @param address
   * @param nFloors
   */
  public Library(String name, String address, int nFloors) {
    super(name, address, nFloors);
    this.collection = new Hashtable<String, Boolean>();
    System.out.println("You have built a library: 📖");
  }

  /**
   * add a book with title to the collection
   * @param title
   */
  public void addTitle(String title) {
    if (this.collection.containsKey(title)){
      throw new RuntimeException("The book is already in the collection");
    }
    this.collection.put(title, true);
  }

  /**
   * remove a book with the title from collection
   * @param title
   * @return
   */
  public String removeTitle(String title) {
    if (this.collection.containsKey(title)){
      this.collection.remove(title);
    } else {
      throw new RuntimeException("There is no book with title " + title);
    }
    return title;
  } // return the title that we removed

  /**
   * check out a book with the title
   * @param title
   */
  public void checkOut(String title) {
    if (this.collection.containsKey(title)){
      this.collection.replace(title, false);
    } else {
      throw new RuntimeException("There is no book with title " + title);
    }
  }

  /**
   * return a book with the title
   * @param title
   */
  public void returnBook(String title) {
    if (this.collection.containsKey(title)){
      this.collection.replace(title, true);
    } else {
      throw new RuntimeException("There is no book with title " + title);
    }
  }

  /**
   * check if the collection contains a book with the title
   * @param title
   * @return
   */
  public boolean containsTitle(String title) {
    return this.collection.containsKey(title);
  } // returns true if the title appears as a key in the Libary's collection, false otherwise

  /**
   * check if the book with the title is available
   * @param title
   * @return
   */
  public boolean isAvailable(String title) {
    return this.collection.get(title);
  } // returns true if the title is currently available, false otherwise

  /**
   * print out the collection
   */
  public void printCollection() {
    Enumeration<String> keyEmun = this.collection.keys();
    Enumeration<Boolean> valueEmun = this.collection.elements();
    while (keyEmun.hasMoreElements() && valueEmun.hasMoreElements()) {
      System.out.println("Title and Author: " + keyEmun.nextElement()+ ", " + "Checkout Status: " + valueEmun.nextElement());
    }


  } // prints out the entire collection in an easy-to-read way (including checkout status)

  public static void main(String[] args) {
  }
  
}