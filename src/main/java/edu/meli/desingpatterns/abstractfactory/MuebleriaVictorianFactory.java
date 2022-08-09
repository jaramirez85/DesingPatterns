package edu.meli.desingpatterns.abstractfactory;


import edu.meli.desingpatterns.abstractfactory.Chair.IChair;
import edu.meli.desingpatterns.abstractfactory.Chair.VictorianChair;
import edu.meli.desingpatterns.abstractfactory.CoffeeTable.ICoffeeTable;
import edu.meli.desingpatterns.abstractfactory.CoffeeTable.VictorianCoffeeTable;
import edu.meli.desingpatterns.abstractfactory.Sofa.ISofa;
import edu.meli.desingpatterns.abstractfactory.Sofa.VictorianSofa;

public class MuebleriaVictorianFactory extends MuebleriaAbstractFactory {
    @Override
    public IChair createChair() {
        IChair chair = new VictorianChair();
        return chair;
    }

    @Override
    public ISofa createSofa() {
        ISofa sofa = new VictorianSofa();
        return sofa;
    }

    @Override
    public ICoffeeTable createCoffeeTable() {
        ICoffeeTable coffeeTable = new VictorianCoffeeTable();
        return coffeeTable;
    }
}
