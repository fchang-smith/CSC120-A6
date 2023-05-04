import java.util.ArrayList;

/**
 * The House class extends Building
 */
public class House extends Building {
  private ArrayList<String> residents;
  private boolean hasDiningRoom;

  /**
   * constructor for House class
   * @param name
   * @param address
   * @param nFloors
   * @param hasDiningRoom
   */
  public House(String name, String address, int nFloors, 
               boolean hasDiningRoom) {
    super(name, address, nFloors);
    this.residents = new ArrayList<String>();
    this.hasDiningRoom = hasDiningRoom;
    System.out.println("You have built a house: 🏠");
  }

  /**
   * check if there is a dining hall
   * @return true if there is a dining hall
   */
  public boolean hasDiningRoom() {
    return this.hasDiningRoom;
  }

  /**
   * get the number of residents
   * @return int number of the residents
   */
  public int nResidents() {
    return this.residents.size();
  }

  /**
   * Move in a resident
   * @param name
   */
  public void moveIn(String name) {
    if (this.residents.contains(name)) {
      throw new RuntimeException("The resident has already moved in");
    }
    this.residents.add(name);
  }

  /**
   * Move out a resident
   * @param name
   * @return
   */
  public String moveOut(String name) {
    if (this.residents.contains(name)) {
      this.residents.remove(name);
    } else {
      throw new RuntimeException("There is no resident "+ name);
    }
    return name;
  }

  /**
   * check if the person is a resident
   * @param person
   * @return
   */
  public boolean isResidents(String person) {
    return this.residents.contains(person);
  }

  public static void main(String[] args) {
  
  }

}