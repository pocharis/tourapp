# tourapp
A tour operator is looking to implement a software system to manage tour packages, tourists and bookings. 
They want you to create a prototype system in Java in two phases. 
In the first phase you will create a set of interacting Java classes for representing the Tourist, TourPackage and Booking. 

In the second phase you will create a GUI interface.  In the first stage, you will create and test the following Java classes. 

    • A class named Tourist that will encapsulate information relating to the tourist. 
    • A class called TourPackage and subclasses called CityTour and SightseeingTour that will encapsulate information and details about different types of tour packages.
    • An enumerated type called AudioLanguage to indicate the languages in which the audio guides are available. 
    • A class called Booking to encapsulate a tourist, a tour package and a date time, a booking is made for one tourist who select one tour package. 
    • A class called BookingUtils to implement the bill calculation including discounts. 
    • A class called TourApp to demonstrate the functionality that allows the user to 
      o Create a new tourist. 
      o Create a new tour package. 
      o Create a booking.
      o Update tour package costs. 
      o Calculate the bill with discounts. 
  
In the second stage you will design and implement a GUI that makes use of the hierarchy of interacting classes described above and the TourAgent class (provided). 
The GUI should incorporate functionality that allows the user to:  

    • List existing Tour agents, view details of a selected tour agent and create new tour agents. 
    • List existing tourists and tour packages 
    • Select a tourist and a tour package to create a booking. 
    • List existing bookings. 
    • Select a booking to view its details such as the tourist and tour package details. 
    • Cancel a selected booking to remove from the list of bookings. 
    • Create a new tourist. 
    • Create a new tour package.
