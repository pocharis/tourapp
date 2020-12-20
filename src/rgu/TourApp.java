/*
 * 
 * TourApp  class to test the functionality of the implemented classes
 */
package rgu;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date; 

/**
 *
 * @author OLUWASEGUN
 */
public class TourApp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)throws Exception  {
        
        /*Create two tour packages; one CityTour and one SightseeingTour and add to an ArrayList
        data structure*/
        CityTour cTour = new CityTour(true, 70.0, "City tour ", "Aberdeen", 80);
        System.out.println(cTour.toString() + "\n");
        
        SightSeeingTour sightSee = new SightSeeingTour(20, "A Sightseeing tour ", "Amsterdam", 100);
        System.out.println(sightSee.toString() + "\n");
        
        
        ArrayList<TourPackage> tour  = new ArrayList<TourPackage>();
        tour.add(cTour);
        tour.add(sightSee);
        System.out.println(tour.size() + " tour packages are available in TourApp. \n");
             
        //Create a tourist, set their audio language preference to ENGLISH
        Tourist tourist1 = new Tourist("Oluwaseun Baba", "United Kingdom", AudioLanguage.ENGLISH);
        System.out.println("Tourist " + tourist1.getName() + " added to the TourApp! \n");
        
        //using a specific datetime, instead of the current datetime of system
        SimpleDateFormat format = new SimpleDateFormat("dd-MMM-yyyy HH:mm:ss");  
        String bookingStrDate1 = "31-Dec-2020 23:37:50";
        Date bookingDate1 = format.parse(bookingStrDate1);
        
        //Create a booking for the tourist who selected the sightseeing tour
        Booking booking1 = new Booking(tourist1, sightSee,bookingDate1 );
        System.out.println(booking1.toString() + "\n");
        
        
        /*Create a custom tour package for city tour without a guide(Hint: withGuide set to false),
        create a booking using this tour package for the tourist. */
        CityTour customCityTour = new CityTour(false, 70.0, "Safari City tour ", "Aberdeen", 60);
        System.out.println(customCityTour.toString() + "\n");
        
        
        String bookingStrDate2 = "31-Dec-2020 20:37:50";
        Date bookingDate2 = format.parse(bookingStrDate2);
        
        //Add both bookings to an ArrayList data structure
        Booking booking2 = new Booking(tourist1, customCityTour,  bookingDate2);
        System.out.println(booking2.toString() + "\n");
        
        
        ArrayList<Booking> bookingList  = new ArrayList<Booking>();
        bookingList.add(booking1);
        bookingList.add(booking2);
        
        
        //Print the bill and the discounted bill for the tourist
        BookingUtil b = new BookingUtil();
        System.out.println("Total bill for " + tourist1.getName() + ": " + b.calculateBill(bookingList, tourist1).get(0)  + "£");
        System.out.println("Discounted bill for " + tourist1.getName() + ": " + b.calculateBill(bookingList, tourist1).get(1)  + "£" + "\n");
        
        
        //Update the base tour cost of one of the tour packages 
        customCityTour.updateTourCost(100);
        System.out.println("Update, " + customCityTour.toString() + "\n");
        
        //Again, print the bill and the discounted bill for the tourist
        System.out.println("Total bill for " + tourist1.getName() + ": " + b.calculateBill(bookingList, tourist1).get(0)  + "£");
        System.out.println("Discounted bill for " + tourist1.getName() + ": " + b.calculateBill(bookingList, tourist1).get(1) + "£");
        
        
        //invoking the GUI to manage the tour app
        TourAppSystemGUI form = new TourAppSystemGUI();
        form.setVisible(true);
         
    }
    
}
