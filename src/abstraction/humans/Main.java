package abstraction.humans;

import abstraction.humans.base.HumanRace;
import abstraction.humans.base.Place;
import abstraction.humans.subClass.Adaptability;
import abstraction.humans.subClass.HomoSapien;
import abstraction.humans.subClass.Neanderthal;
import abstraction.humans.subClass.Vegetarian;

import static abstraction.humans.base.HumanRace.calculateTotalIQ;
import static abstraction.humans.base.HumanRace.getHumanRaceInformation;

public class Main {

    public static void main(String[] args) {

        Neanderthal neanderthal1 = new Neanderthal(50, 4000, Place.CENTRAL_AFRICA, Vegetarian.VEGETARIAN, 65);
        Neanderthal neanderthal2 = new Neanderthal(20, 3000, Place.INDIA, Vegetarian.NON_VEGETARIAN, 75);

        HomoSapien homoSapien1 = new  HomoSapien(40, 2000, Place.SOUTH_ASIA ,40,  Adaptability.NOT_ADAPTABLE);
        HomoSapien homoSapien2 = new HomoSapien(45, 2000, Place.INDIA, 45, Adaptability.ADAPTABLE);

        HumanRace[] humans = {neanderthal1, neanderthal2, homoSapien1, homoSapien2};

        getHumanRaceInformation(humans);
        System.out.println();

        calculateTotalIQ(humans);
        System.out.println();

    }
}
