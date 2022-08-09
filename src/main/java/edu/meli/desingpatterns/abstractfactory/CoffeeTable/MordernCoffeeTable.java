package edu.meli.desingpatterns.abstractfactory.CoffeeTable;

public class MordernCoffeeTable implements ICoffeeTable {
    @Override
    public String getType() {
        return "Modern";
    }
    @Override
    public String getColor() {
        return "white";
    }

    @Override
    public String toString() {
        return "CoffeeTable -- Type: [ ".concat(getType()).concat(" ] ").concat(" ] - Color: [ ").concat(getColor()).concat(" ]");
    }
}
