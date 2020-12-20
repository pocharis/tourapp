/*
 * 
 * CityTour a sub-class of the TourPackage class
 */

package rgu;

import javax.swing.JOptionPane;

/**
 *
 * @author OLUWASEGUN
 */
public class SightSeeingTour extends TourPackage{
    
    //initializing class properties
    private double ticketCost;
    
     //constructor for the SightSeeingTour class, making efficient re-use of the superclass
    public SightSeeingTour(double ticketCost, String description, String location, double tourCost){
        super(description, location, tourCost);
        this.ticketCost = ticketCost;
       
    }

    //standard getter method for the ticket cost
    public double getTicketCost() {
        return ticketCost;
    }
    
    //standard setter for the ticket cost
    public void updateTicketCost(double cost){
        if(cost > this.ticketCost){
            this.ticketCost = cost;
        }else{
            JOptionPane.showMessageDialog(null, "New ticketCost cannot be less than the current ticketCost: " + this.ticketCost);
        }
    }
    
    //Well formatted summary of SightSeeingTour object
    @Override
    public String toString() {
              
        return "A tour package added to TourApp: " + 
                super.getDescription() +
                "in and around " + super.getLocation() +
                " with a total cost of " + 
                getCost() + "£ " + "including tickets.";
    }
    
        
     //implementing the getCost method inherited from TourPackage
    @Override public double getCost(){
        return ticketCost + super.getTourCost();   
    }
    
    
}
