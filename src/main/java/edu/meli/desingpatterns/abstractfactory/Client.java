package edu.meli.desingpatterns.abstractfactory;


import edu.meli.desingpatterns.abstractfactory.Chair.IChair;
import edu.meli.desingpatterns.abstractfactory.CoffeeTable.ICoffeeTable;
import edu.meli.desingpatterns.abstractfactory.Sofa.ISofa;

public class Client {

    public static void main (String [] args) {
        // Instanciando el abstract factory para productos modernos
        MuebleriaAbstractFactory modernFactory = new MuebleriaModernFactory();
        // Instanciando producto silla moderna
        IChair modernChair =  modernFactory.createChair();
        System.out.println(modernChair.toString());
        // Instanciando producto mesilla moderna
        ICoffeeTable moderCoffeeTable = modernFactory.createCoffeeTable();
        System.out.println(moderCoffeeTable.toString());
        // Instanciando producto sofa moderna
        ISofa moderSofa = modernFactory.createSofa();
        System.out.println(moderSofa.toString());

        System.out.println();
        System.out.println("-------------------------------------------");
        MuebleriaAbstractFactory victorianFactory = new MuebleriaVictorianFactory();

        IChair victorianChair = victorianFactory.createChair();
        System.out.println(victorianChair.toString());
    }
}
