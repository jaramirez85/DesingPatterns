package edu.meli.desingpatterns.abstractfactory.CoffeeTable;

public interface ICoffeeTable {
    String getType();
    String getColor();
    static String me(){
        return "CoffeTable";
    }
}
