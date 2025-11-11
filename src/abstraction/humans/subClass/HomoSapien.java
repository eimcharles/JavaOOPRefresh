package abstraction.humans.subClass;

import abstraction.humans.base.HumanRace;
import abstraction.humans.base.Place;

public class HomoSapien extends HumanRace {

    private int senseIQ;
    private Adaptability isAdaptable;

    public HomoSapien(int basicIQ, int yearsEvl, Place place, int senseIQ, Adaptability isAdaptable) {
        super(basicIQ, yearsEvl, place);
        this.senseIQ = senseIQ;
        this.isAdaptable = Adaptability.valueOf(isAdaptable.toString());
    }

    @Override
    public int computeIq() {
        if (this.isAdaptable.getValue()) {
            return 2 * ( this.basicIQ + this.senseIQ);
        }else {
            return (this.basicIQ + this.senseIQ);
        }
    }

    @Override
    public String information() {
        String s = "";
        s+= "\nThe basic IQ of the human race is "+ this.basicIQ;
        s+= "\nHomoSapiens evolved for "+ this.yearsEvolved + " years";
        s+= " and are mostly found in "+ this.place;
        s+= "\nThey are adaptable: "+ this.isAdaptable.getValue();
        s+= "\nTheir senseIQ is "+ this.senseIQ;
        s+= " and total IQ is " + this.computeIq();
        return s;
    }

    @Override
    public String toString() {
        return "HomoSapiens { senseIQ = %d, isAdaptable = %s, basicIQ = %d, yearsEvolved = %d, place = %s}".formatted(senseIQ, isAdaptable, basicIQ, yearsEvolved, place);
    }
}
