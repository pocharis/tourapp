/*
 * 
 * Booking  class for tour package selection
 */

package rgu;

import java.util.Date;
import java.text.SimpleDateFormat;
/**
 *
 * @author OLUWASEGUN
 */
public class Booking implements Comparable<Booking>{
    
    //initializing class properties
    private Tourist tourist;
    private TourPackage tourPackage;
    private Date datetime;
    
     //constructor for the Booking class
    public Booking(Tourist tourist, TourPackage tourPackage, Date date){
        this.tourist = tourist;
        this.tourPackage = tourPackage;
        this.datetime = date;
    }

    //standard getter for tourist 
    public Tourist getTourist() {
        return tourist;
    }

    //standard getter for tour package  
    public TourPackage getTourPackage() {
        return tourPackage;
    }

    //standard getter for date
    public Date getDatetime() {
        return datetime;
    }

    //Well formatted summary of Booking object
    @Override
    public String toString() {
//        return "Tourist info: \n" + tourist.toString() + "\nTour Package info: \n" + tourPackage.toString() + "\nBooking Date: " + getDatetimeAsString();
   
        return tourist.getName() 
                + ", booked " 
                + tourPackage.getDescription() 
                + " in and around " 
                + tourPackage.getLocation()
                + " with a total cost of "
                + tourPackage.getCost() + "£"
                + " including tickets on "
                + getDatetimeAsString();
    }

    
    
    
    //converting the datetime to string
    public String getDatetimeAsString(){
        SimpleDateFormat dateTimeFormatter = new SimpleDateFormat("dd-MMM-yyyy HH:mm:ss");
        return dateTimeFormatter.format(datetime);
    }
    
    
    //helper method for the comparator
    public Date getDate() {
        return datetime;
    }
    
    //comparator override method
    @Override
    public int compareTo(Booking b) {
      return getDate().compareTo(b.getDate());
    }
}
