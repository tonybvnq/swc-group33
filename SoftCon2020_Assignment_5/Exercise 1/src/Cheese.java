/**
 * CHEESE INGRIEDIENT FOR SANDWICHES
 */


public class Cheese extends SandwichDecorator {

    public Cheese(BasicSandwich newSandwich) {
        super(newSandwich);
    }

    @Override
    public double getCost() {
        return tempSandwich.getCost() + 1;
    }
}
