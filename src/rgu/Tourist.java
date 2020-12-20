/*
 * 
 * Tourist class for key information of tourists booking a tour
 */


package rgu;

/**
 *
 * @author OLUWASEGUN
 */
public class Tourist {
    
    //properties representing name and country of tourist
    private final String name;
    private final String country;
    private AudioLanguage audioLanguage;
    
    //Constructor for the Tousist class
    public Tourist(String name, String country){
        this.name = name;
        this.country = country;
    }
    
    //Overload constructor for the audiolanguage
    public Tourist(String name, String country, AudioLanguage aLang){
        this.name = name;
        this.country = country;
        this.audioLanguage = aLang;
    }

    //A getter name for the name of tourist
    public String getName() {
        return name;
    }

    //A getter method for the country
    public String getCountry() {
        return country;
    }

    //getter method for the audiolangauge
    public AudioLanguage getAudioLanguage() {
        return audioLanguage;
    }

    //setter method for the audiolangauge
    public void setAudioLanguage(AudioLanguage audioLanguage) {
        this.audioLanguage = audioLanguage;
    }
    
    
    //Well formatted summary of Tourist object
    @Override
    public String toString() {
        return name + " from " + country + ", prefered audio guide language in " + audioLanguage;
    }
    
    
    //Testing the Tourist class
    public static void main(String[] args) {
        Tourist T1 = new Tourist("Oluwaseun", "United Kingdom", AudioLanguage.ENGLISH);
        Tourist T2 = new Tourist("General Baba", "France", AudioLanguage.FRENCH);
        System.out.println(T1.toString());
        System.out.println(T2.toString());
        System.out.println("\ngetName Method: " + T1.getName());
        System.out.println("\ngetCountry Method: " + T1.getCountry()); 
    }
    
    
}
