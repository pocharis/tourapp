/*
 * 
 * TourAgent class
 */

package rgu;

/**
 *
 * @author OLUWASEGUN
 */
public class TourAgent implements Comparable<TourAgent> {
    
     //initializing class properties
    private String name;
    private String location;
    
    
    //constructor for the TourAgent class
    public TourAgent(String name, String location){
        this.name = name;
        this.location = location;
    }
    
    //standard getter for the name
    public String getName() {
        return name;
    }
    
    //standard getter for the location
    public String getLocation() {
        return location;
    }
    
    
    //Well formatted summary of TourAgent object
    @Override
    public String toString() {
        return "Agent " + name + " is based in " + location;
    }
    
    //comparator for implementing sorting
    @Override
    public int compareTo(TourAgent other) {
        return this.name.compareTo(other.getName());
    }
}
