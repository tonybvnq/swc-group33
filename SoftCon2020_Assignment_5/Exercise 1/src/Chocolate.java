/**
 * CHOCOLATE INGRIEDIENT FOR CAKE
 */

public class Chocolate extends CakeDecorator {

    public Chocolate(BasicCake newCake) {
        super(newCake);
    }

    @Override
    public double getCost() {
        return tempCake.getCost() + 2;
    }
}
