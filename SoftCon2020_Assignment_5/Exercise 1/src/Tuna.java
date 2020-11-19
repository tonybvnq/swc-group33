/**
 * TUNA INGRIEDIENT FOR SANDWICHES
 */
public class Tuna extends SandwichDecorator {

    public Tuna(BasicSandwich newSandwich) {
        super(newSandwich);
    }

    @Override
    public double getCost() {
        return tempSandwich.getCost() + 3;
    }
}
