abstract class Ship implements ShipInterface{
    private String shipname;
    private int length;
    private int amount;
    private char shipletter;

    public void setShipName(String name){
        this.shipname = name;
    };

    public void setShipLength(int length){
        this.length = length;
    };

    public  void setShipAmount(int amount){
        this.amount = amount;
    };

    public void setShipLetter(char letter){
        this.shipletter=letter;
    };

    public String getShipname(){
        return this.shipname;
    };

    public int getShipLength(){
        return this.length;
    };

    public  int getShipAmount(){
        return this.amount;
    };

    public char getShipLetter(){
        return this.shipletter;
    };


    public void setShip(String coordinate1, String coordinate2, NamedRow[] rowList){

        // check if there are more ships of this type to set
        if (this.amount == 0){
            System.out.println("There are no ships of this type available anymore!");
            return;
        }
        rowList = Positioning.position(coordinate1, coordinate2, this.shipletter, rowList);

        this.setShipAmount(this.getShipAmount()-1);

    }}

        class Carrier extends Ship{
    public Carrier(){
        setShipName("Carrier");
        setShipLength(6);
        setShipAmount(1);
        setShipLetter('C');
    }
        }

        class Battleship extends Ship {
    public Battleship() {
        setShipName("Battleship");
        setShipLength(4);
        setShipAmount(2);
        setShipLetter('B');
            }
        }
        class Submarine extends Ship{
    public Submarine(){
        setShipName("Submarine");
        setShipLength(3);
        setShipAmount(3);
        setShipLetter('S');;
    }
}

        class PatrolBoat extends Ship{
    public PatrolBoat(){
        setShipName("Patrol boat");
        setShipLength(2);
        setShipAmount(4);
        setShipLetter('P');
    }
}