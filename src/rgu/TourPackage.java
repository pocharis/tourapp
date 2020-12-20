/*
 * 
 * TourPackage class for key information of different tour packages
 */
package rgu;

/**
 *
 * @author OLUWASEGUN
 */
public abstract class TourPackage {
    
    //properties representing description, location and  tour cost
    private String description;
    private String location;
    private double tourCost;
    
    //constructor fo the TourPackage Class
    public TourPackage(String des, String loc, double tc){
        this.description = des;
        this.location = loc;
        this.tourCost = tc;
    }

    //getter method for the description
    public String getDescription() {
        return description;
    }

    //Getter method  for the location
    public String getLocation() {
        return location;
    }

    //Gettter method for the tour cost
    public double getTourCost() {
        return tourCost;
    }
    
    
    //updating the tourcost if the new value is higher than the current tourCost.
    public void updateTourCost(double cost){
        if (cost > this.tourCost) {
            this.tourCost = cost;
        }
    }
    
    //Well formatted summary of Tourpackage object
    @Override
    public String toString() {
        return  description + " in " + location + " with a total cost of " + tourCost + "£";
    }
    
    //getcost abstract class
    public abstract double getCost();


    
}
