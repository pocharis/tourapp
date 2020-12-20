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
public class CityTour extends TourPackage{
    
    //adding the additional properties
    private boolean withGuide;
    private double guideCost;
    
    
    //constructor for the CityTour class, making efficient re-use of the superclass
    public CityTour(boolean withGuide, double guideCost, String description, String location, double tourCost){
        super(description, location, tourCost);
        this.withGuide = withGuide;
        this.guideCost = guideCost;
    }


    //standard getter for the guideCost property
    public double getGuideCost() {
        return guideCost;
    }
    
    //setter method for the guideCost property
    public void updateGuideCost(double cost){
        if(cost > this.guideCost){
            this.guideCost = cost;
        }else{
            JOptionPane.showMessageDialog(null, "New guideCost cannot be less than the current guideCost: " + this.guideCost);
        }
    }
    
    
    //standard getter for the withGuide property
    public boolean isWithGuide() {
        return withGuide;
    }
    
  
   
    //Well formatted summary of CityTour object
    @Override
    public String toString() {
        
        String wGuideMessage = "";
        if(isWithGuide()){
            wGuideMessage = " including a personal guide";
        }else{
            wGuideMessage = " no personal guide";
        }
                
        return "A tour package added to TourApp: " + 
                super.getDescription() +
                "in " + super.getLocation() +
                " with a total cost of " + 
                getCost() + "£" + wGuideMessage;
      
    }
    
      //implementing the getCost method inherited from TourPackage
    @Override public double getCost(){
      
       if(this.withGuide){ 
            return guideCost + super.getTourCost();
        
       }else{
         
            return super.getTourCost();
       }
       
    }
    
    
    //testing the class
    public static void main(String[] args) {
        CityTour customCityTour = new CityTour(false, 70.0, "Safari City tour ", "Aberdeen", 60);
        System.out.println(customCityTour.toString() + "\n");
        
        customCityTour.updateTourCost(100);
        System.out.println(customCityTour.toString() + "\n");
    }
            
    
}
