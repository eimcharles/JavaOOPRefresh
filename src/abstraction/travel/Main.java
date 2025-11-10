package abstraction.travel;

import abstraction.travel.subClass.Airline;
import abstraction.travel.subClass.Train;
import abstraction.travel.base.Travel;

import static abstraction.travel.base.Travel.listOfTravelOptions;

public class Main {

    public static void main(String[] args) {

        // Initializing two Airline object and storing them in a parent class Travel array - show information
        Airline airline1 = new Airline(10_000, 3_000, 5, true);
        Airline airline2 = new Airline(10_000, 1_500, 50, false);
        Travel[] travelAirlines = {airline1, airline2};
        listOfTravelOptions(travelAirlines);

        // Initializing two Train object and storing them in a parent class Travel array - show information
        Train train1 = new Train(3_000,25, 100, false );
        Train train2 = new Train(3_000, 150, 100, true);
        Travel[] travelTrains = {train1, train2};
        listOfTravelOptions(travelTrains);

    }
}
