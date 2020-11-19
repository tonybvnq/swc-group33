/**
 * TOMATO INGRIEDIENT FOR SANDWICHES
 */
public class Tomatoes extends SandwichDecorator {

    public Tomatoes(BasicSandwich newSandwich) {
        super(newSandwich);
    }

    @Override
    public double getCost() {
        return tempSandwich.getCost() + 1.50;
    }
}
