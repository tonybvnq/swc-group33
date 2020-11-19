/**
 * CREAM INGRIEDIENT FOR CAKE
 */

public class Cream extends CakeDecorator {

    public Cream(BasicCake newCake) {
        super(newCake);
    }

    @Override
    public double getCost() {
        return tempCake.getCost() + 1.50;
    }
}
