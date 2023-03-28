/* This is a stub for the Cafe class */
public class Cafe extends Building{

    private int nCoffeeOunces = 10; // The number of ounces of coffee remaining in inventory
    private int nSugarPackets = 10; // The number of sugar packets remaining in inventory
    private int nCreams = 10; // The number of "splashes" of cream remaining in inventory
    private int nCups = 10; // The number of cups remaining in inventory

    public Cafe(String name, String address, int nFloors, int nCoffeeOunces, int nSugarPackets, int nCreams, int nCups) {
        super(name, address, nFloors);
        if (nCoffeeOunces != -1) { this.nCoffeeOunces = nCoffeeOunces; }
        if (nSugarPackets != -1) { this.nSugarPackets = nSugarPackets; }
        if (nCreams != -1) { this.nCreams = nCreams; }
        if (nCups != -1) { this.nCups = nCups; }
        System.out.println("You have built a cafe: ☕");
    }

    public void sellCoffee(int size, int nSugarPackets, int nCreams) {
        if (this.nCoffeeOunces < nCoffeeOunces) {throw new RuntimeException("Need " + nCoffeeOunces + "coffee ounces, but only have " + this.nCoffeeOunces); }
        if (this.nSugarPackets < nSugarPackets) {throw new RuntimeException("Need " + nSugarPackets + "sugar packets, but only have " + this.nSugarPackets); }
        if (this.nCreams < nCreams) {throw new RuntimeException("Need " + nCreams + "Creams, but only have " + this.nCreams); }
        if (this.nCups < 1) {throw new RuntimeException("No more cups!"); }
        this.nCoffeeOunces -= size;
        this.nSugarPackets -= nSugarPackets;
        this.nCreams -= nCreams;
        this.nCups -= 1;
    }

    private void restock(int nCoffeeOunces, int nSugarPackets, int nCreams, int nCups) {
        this.nCoffeeOunces += nCoffeeOunces;
        this.nSugarPackets += nSugarPackets;
        this.nCreams += nCreams;
        this.nCups += nCups;
    }

    public static void main(String[] args) {
        new Cafe();
    }
    
    
}
