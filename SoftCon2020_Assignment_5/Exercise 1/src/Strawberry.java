/**
 * STRAWBERRY INGRIEDIENT FOR CAKE
 */

public class Strawberry extends CakeDecorator {

    public Strawberry(BasicCake newCake) {
        super(newCake);
    }

    @Override
    public double getCost() {
        return tempCake.getCost() + 1;
    }
}
