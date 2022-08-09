package edu.meli.desingpatterns.abstractfactory;


import edu.meli.desingpatterns.abstractfactory.Chair.IChair;
import edu.meli.desingpatterns.abstractfactory.CoffeeTable.ICoffeeTable;
import edu.meli.desingpatterns.abstractfactory.Sofa.ISofa;

public abstract class MuebleriaAbstractFactory {
    public abstract IChair createChair();
    public abstract ISofa createSofa();
    public abstract ICoffeeTable createCoffeeTable();
}