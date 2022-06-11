package tr.mnurdag.factorypattern;

public class Application {

    public static void main(String[] args) {

        FruitJuiceFactory fruitJuiceFactory = new FruitJuiceFactory();

        FruitJuice orangeJuice = fruitJuiceFactory.getFruitJuice("ORANGE");
        orangeJuice.printColor();

        FruitJuice lemonJuice = fruitJuiceFactory.getFruitJuice("LEMON");
        lemonJuice.printColor();

        FruitJuice strawberryJuice = fruitJuiceFactory.getFruitJuice("STRAWBERRY");
        strawberryJuice.printColor();

    }

}
