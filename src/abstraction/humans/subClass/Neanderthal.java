package abstraction.humans.subClass;

import abstraction.humans.base.HumanRace;
import abstraction.humans.base.Place;

public class Neanderthal extends HumanRace {

    private Vegetarian isVegetarian;
    private int personnalIQ;

    public Neanderthal(int basicIQ, int yearsEvl, Place place, Vegetarian isVegetarian, int personnalIQ) {
        super(basicIQ, yearsEvl, place);
        this.isVegetarian = Vegetarian.valueOf(isVegetarian.toString());
        this.personnalIQ = personnalIQ;
    }


    @Override
    public int computeIq() {
        return this.basicIQ + this.personnalIQ;
    }

    @Override
    public String information() {
        String s = "";
        s+= "\nThe basic IQ of the human race is "+ this.basicIQ;
        s+= "\nNeanderthals evolved for "+ this.yearsEvolved + " years";
        s+= " and are mostly found in "+ this.place;
        s+= "\nThey are vegetatian: "+ this.isVegetarian.getValue();
        s+= "\nTheir personal IQ is "+ this.personnalIQ;
        s+= " and total IQ is " + this.computeIq();
        return s;
    }

    @Override
    public String toString() {
        return "Neanderthals { isVegetarian = %s, personnalIQ = %d, basicIQ = %d, yearsEvolved = %d, place = %s}".formatted(isVegetarian, personnalIQ, basicIQ, yearsEvolved, place);
    }
}
