/**
 * Building class with basic methods
 */
public class Building {

    protected String name = "<Name Unknown>";
    protected String address = "<Address Unknown>";
    protected int nFloors = 1;

    /**
     * Constructor of Building class
     * @param name Name of the builiding
     * @param address Address of the building
     * @param nFloors Total number of floors of the building
     */
    public Building(String name, String address, int nFloors) {
        if (name != null) { this.name = name; }
        if (address != null) { this.address = address; } 
        if (nFloors < 1) {
            throw new RuntimeException("Cannot construct a building with fewer than 1 floor.");
        }
        this.nFloors = nFloors;
    }

    /**
     * Accessor of name
     * @return String name
     */
    public String getName() {
        return this.name;
    }

    /**
     * Accessor of address
     * @return String address
     */
    public String getAddress() {
        return this.address;
    }

    /**
     * Accessor of number of floors
     * @return int total number of floors
     */
    public int getFloors() {
        return this.nFloors;
    }

    /**
     * Overrided toString method
     * @return return name, number of floors, and address
     */
    public String toString() {
        return this.name + " is a " + this.nFloors + "-story building located at " + this.address;
    }

    public static void main(String[] args) {
        Building fordHall = new Building("Ford Hall", "100 Green Street Northampton, MA 01063", 4);
        System.out.println(fordHall);
    }

}
