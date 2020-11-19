/**
 * DECORATOR FOR SANDWICHES
 */


abstract class SandwichDecorator implements Sandwich {

    protected BasicSandwich tempSandwich;

    public SandwichDecorator(BasicSandwich newSandwich){
        tempSandwich = newSandwich;
    }

    public double getCost() {
        return tempSandwich.getCost();
    }

}
