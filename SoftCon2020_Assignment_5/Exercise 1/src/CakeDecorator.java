/**
 * DECORATOR FOR CAKE
 */



abstract class CakeDecorator implements Cake {

    protected BasicCake tempCake;

    public CakeDecorator(BasicCake newCake){
        tempCake = newCake;
    }

    public double getCost() {
        return tempCake.getCost();
    }

}
