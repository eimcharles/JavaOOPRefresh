package abstraction.humans.base;

import abstraction.humans.subClass.HomoSapien;
import abstraction.humans.subClass.Neanderthal;

abstract public class HumanRace {

    protected int basicIQ;
    protected int yearsEvolved;
    protected Place place;

    public HumanRace(int basicIQ, int yearsEvl, Place place){
        this.basicIQ = basicIQ;
        this.yearsEvolved = yearsEvl;
        this.place = place;
    }

    /**
     *          The purpose of an abstract class is
     *          to function as a base for subclass.
     *
     *          HumanRace contains common functionality to
     *          calculateTotalIQ and getHumanRaceInformation.
     *
     *          Encapsulates some common functionality in one place
     *          and lets subclasses implement differences:
     *
     *          - computeIq()
     *          - information()
     *
     *          Avoids code duplication and increases reusability.
     * */

    protected abstract int computeIq();
    protected abstract String information();

    public static void getHumanRaceInformation(HumanRace[] humanRaces){
        for (int i = 0; i < humanRaces.length; i++) {
            System.out.println(humanRaces[i].information());
        }
    }

    public static void calculateTotalIQ(HumanRace[] humanRaces) {

        int totalIQNeanderthal = 0;
        int totalIQHomoSapien = 0;

        for (int i = 0; i < humanRaces.length; i++) {

            if (humanRaces[i] instanceof Neanderthal){
                totalIQNeanderthal += humanRaces[i].computeIq();
            }

            if (humanRaces[i] instanceof HomoSapien)
                totalIQHomoSapien += humanRaces[i].computeIq();
        }

        if (totalIQNeanderthal != 0) {
            System.out.println("Total IQ of all Neanderthals is " + totalIQNeanderthal);
        }

        if (totalIQHomoSapien != 0) {
            System.out.println("Total IQ of all Homo sapiens is " + totalIQHomoSapien);
        }

    }

    @Override
    public String toString() {
        return "HumanRace { basicIQ = %d, yearsEvolved = %d, place = %s}".formatted(basicIQ, yearsEvolved, place);
    }
}
