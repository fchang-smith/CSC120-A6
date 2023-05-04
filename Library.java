/* This is a stub for the Library class */
import java.util.Hashtable;
import java.util.Enumeration;

public class Library extends Building{

  private Hashtable<String, Boolean> collection;

    public Library(String name, String address, int nFloors) {
      super(name, address, nFloors);
      this.collection = new Hashtable<String, Boolean>();
      System.out.println("You have built a library: 📖");
    }

    public void addTitle(String title) {
      if (this.collection.containsKey(title)){
        throw new RuntimeException("The book is already in the collection");
      }
      this.collection.put(title, true);
    }

    public String removeTitle(String title) {
      if (this.collection.containsKey(title)){
        this.collection.remove(title);
      } else {
        throw new RuntimeException("There is no book with title " + title);
      }
      return title;
    } // return the title that we removed

    public void checkOut(String title) {
      if (this.collection.containsKey(title)){
        this.collection.replace(title, false);
      } else {
        throw new RuntimeException("There is no book with title " + title);
      }
    }

    public void returnBook(String title) {
      if (this.collection.containsKey(title)){
        this.collection.replace(title, true);
      } else {
        throw new RuntimeException("There is no book with title " + title);
      }
    }

    public boolean containsTitle(String title) {
      return this.collection.containsKey(title);
    } // returns true if the title appears as a key in the Libary's collection, false otherwise

    public boolean isAvailable(String title) {
      return this.collection.get(title);
    } // returns true if the title is currently available, false otherwise

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