/*
 * 
 * BookingUtil  class for managing the bill computation
 */
package rgu;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 *
 * @author OLUWASEGUN
 */
public class BookingUtil {
    
    
    
    public List<Double> calculateBill(ArrayList<Booking> bookingList, Tourist tourist){
        
         //initializing class properties
        List<Double> list = new ArrayList<Double>();
        double totalCost = 0.0;
        double totalDiscount = 0.0;
        double totalDiscountedCost = 0.0;
        int index = 1;
        
        Collections.sort(bookingList);
        
        //looping through the booking list to calculate the various discount based on the number of bookings done
        for (Booking booking: bookingList) {
            if(booking.getTourist().equals(tourist)){
                totalCost += booking.getTourPackage().getCost();

                if (index == 1) {
                    totalDiscount += booking.getTourPackage().getCost() * 0.0;
                  } else if (index == 2) {
                    totalDiscount += booking.getTourPackage().getCost() * 0.1;
                    
                  } else if (index == 3) {
                    totalDiscount += booking.getTourPackage().getCost() * 0.15;
                    
                  }else if (index == 4) {
                    totalDiscount += booking.getTourPackage().getCost() * 0.2;
                    
                  }else if (index == 5) {
                    totalDiscount += booking.getTourPackage().getCost() * 0.25;
                    
                  }else if (index == 6) {
                    totalDiscount += booking.getTourPackage().getCost() * 0.3;
                    
                  }else if (index == 7) {
                    totalDiscount += booking.getTourPackage().getCost() * 0.35;
                  }else if (index == 8) {
                    totalDiscount += booking.getTourPackage().getCost() * 0.4;
                  }else if (index == 9) {
                    totalDiscount += booking.getTourPackage().getCost() * 0.45;
                  }else if (index >= 10) {
                    totalDiscount += booking.getTourPackage().getCost() * 0.5;
                  }
     
            }
            
            index++;
        }
        totalDiscountedCost = totalCost - totalDiscount;
        
        list.add(totalCost);
        list.add(totalDiscountedCost);
        return list;
    }
}
