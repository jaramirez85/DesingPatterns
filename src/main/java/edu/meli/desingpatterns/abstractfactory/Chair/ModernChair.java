package edu.meli.desingpatterns.abstractfactory.Chair;

public class ModernChair implements IChair {
    @Override
    public String getStyle() {
        return "Modern";
    }

    @Override
    public int legsNumber() {
        return 4;
    }

    @Override
    public String getColor() {
        return "brown";
    }

    @Override
    public String toString() {
        return "Chair -- Style: [ ".concat(getStyle()).concat(" ] - Legs: [ ")
                .concat(String.valueOf(legsNumber())).concat(" ] - Color: [ ").concat(getColor()).concat(" ]");
    }
}
