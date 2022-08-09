package edu.meli.desingpatterns.abstractfactory;


import edu.meli.desingpatterns.abstractfactory.Chair.IChair;
import edu.meli.desingpatterns.abstractfactory.Chair.ModernChair;
import edu.meli.desingpatterns.abstractfactory.CoffeeTable.ICoffeeTable;
import edu.meli.desingpatterns.abstractfactory.CoffeeTable.MordernCoffeeTable;
import edu.meli.desingpatterns.abstractfactory.Sofa.ISofa;
import edu.meli.desingpatterns.abstractfactory.Sofa.ModernSofa;

public class MuebleriaModernFactory extends MuebleriaAbstractFactory {
    @Override
    public IChair createChair() {
        IChair chair = new ModernChair();
        return chair;
    }

    @Override
    public ISofa createSofa() {
        ISofa sofa = new ModernSofa();
        return sofa;
    }

    @Override
    public ICoffeeTable createCoffeeTable() {
        ICoffeeTable coffeeTable = new MordernCoffeeTable();
        return coffeeTable;
    }
}
