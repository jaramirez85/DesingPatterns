package edu.meli.desingpatterns.abstractfactory.CoffeeTable;

public class VictorianCoffeeTable implements ICoffeeTable {
    @Override
    public String getType() {
        return "Vicotrian";
    }

    @Override
    public String getColor() {
        return "Blue";
    }

    @Override
    public String toString() {
        return "CoffeeTable -- Type: [ ".concat(getType()).concat(" ] ").concat(" ] - Color: [ ").concat(getColor()).concat(" ]");
    }
}
