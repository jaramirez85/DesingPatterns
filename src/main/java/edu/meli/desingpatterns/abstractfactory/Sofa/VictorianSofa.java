package edu.meli.desingpatterns.abstractfactory.Sofa;

public class VictorianSofa implements ISofa {
    @Override
    public String style() {
        return "Victorian";
    }

    @Override
    public String material() {
        return "leather";
    }

    @Override
    public String color() {
        return "brown";
    }

    @Override
    public String toString() {
        return "Sofa -- Style: [ ".concat(style()).concat(" ] - material: [ ")
                .concat(String.valueOf(material())).concat(" ] - Color: [ ").concat(color()).concat(" ]");
    }
}
