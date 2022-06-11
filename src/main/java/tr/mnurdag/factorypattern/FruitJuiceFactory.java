package tr.mnurdag.factorypattern;

public class FruitJuiceFactory {

    public FruitJuice getFruitJuice(String name) {
        if(name == null)
            return null;

        if(name.equalsIgnoreCase("orange"))
            return new OrangeJuice();
        else if(name.equalsIgnoreCase("lemon"))
            return new LemonJuice();
        else if(name.equalsIgnoreCase("strawberry"))
            return new StrawberryJuice();

        return null;
    }

}
