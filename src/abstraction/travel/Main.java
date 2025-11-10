package abstraction.travel;

import abstraction.travel.first.Airline;
import abstraction.travel.second.Train;
import abstraction.travel.third.Travel;

import static abstraction.travel.third.Travel.listOfTravelOptions;

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
