/**
 * HAM INGRIEDIENT FOR SANDWICHES
 */

public class Ham extends SandwichDecorator {

    public Ham(BasicSandwich newSandwich) {
        super(newSandwich);
    }

    @Override
    public double getCost() {
        return tempSandwich.getCost() + 2;
    }
}
