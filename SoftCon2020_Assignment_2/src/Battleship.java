abstract class Ship implements ShipInterface{
    public int length;
    public int amount;
    public char shipletter;



    public void setShip(String coordinate1, String coordinate2, NamedRow[] rowList){

        // check if there are more ships of this type to set
        if (this.amount == 0){
            System.out.println("There are no ships of this type available anymore!");
            return;
        }
        rowList = Positioning.position(coordinate1, coordinate2, this.shipletter, rowList);

        amount = amount -1;
    }}

        class Carrier extends Ship{
    public Carrier(){
        this.length = 6;
        this.amount = 1;
        this.shipletter = 'C';
    }
        }

        class Battleship extends Ship {
    public Battleship() {
                this.length = 4;
                this.amount = 2;
                this.shipletter = 'B';
            }
        }
        class Submarine extends Ship{
    public Submarine(){
        this.length = 3;
        this.amount = 3;
        this.shipletter = 'S';
    }
}

        class PatrolBoat extends Ship{
    public PatrolBoat(){
        this.length = 2;
        this.amount = 4;
        this.shipletter = 'P';
    }
}