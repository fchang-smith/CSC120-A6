import java.util.ArrayList;
/* This is a stub for the House class */
public class House extends Building {
  private ArrayList<String> residents;
  private boolean hasDiningRoom;

  public House(String name, String address, int nFloors, 
               boolean hasDiningRoom) {
    super(name, address, nFloors);
    this.residents = new ArrayList<String>();
    this.hasDiningRoom = hasDiningRoom;
    System.out.println("You have built a house: 🏠");
  }

  public boolean hasDiningRoom() {
    return this.hasDiningRoom;
  }

  public int nResidents() {
    return this.residents.size();
  }

  public void moveIn(String name) {
    if (this.residents.contains(name)) {
      throw new RuntimeException("The resident has already moved in");
    }
    this.residents.add(name);
  }

  public String moveOut(String name) {
    if (this.residents.contains(name)) {
      this.residents.remove(name);
    } else {
      throw new RuntimeException("There is no resident "+ name);
    }
    return name;
  }

  public boolean isResidents(String person) {
    return this.residents.contains(person);
  }

  public static void main(String[] args) {
  
  }

}