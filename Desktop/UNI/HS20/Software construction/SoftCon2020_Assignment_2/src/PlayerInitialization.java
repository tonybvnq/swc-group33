public class PlayerInitialization {


    // PLAYER INITIALIZATION SHOULD REMAIN THE ONLY OF ITS KIND, WE CREATE ONE AND NO MORE, IT REMAINS A SINGLETON

    private static PlayerInitialization playerinit;

    private PlayerInitialization(){};

    public static PlayerInitialization getInitialization(){
        if (playerinit == null){
            PlayerInitialization playerinit = new PlayerInitialization();
        }
        return playerinit;
    }


    public NamedRow[] returnRowList(){
    //Create and maintain rows with Lists
    NamedRow player1_row0 = new NamedRow(0);
    NamedRow player1_row1 = new NamedRow(1);
    NamedRow player1_row2 = new NamedRow(2);
    NamedRow player1_row3 = new NamedRow(3);
    NamedRow player1_row4 = new NamedRow(4);
    NamedRow player1_row5 = new NamedRow(5);
    NamedRow player1_row6 = new NamedRow(6);
    NamedRow player1_row7 = new NamedRow(7);
    NamedRow player1_row8 = new NamedRow(8);
    NamedRow player1_row9 = new NamedRow(9);

    // create iterable lists
    NamedRow[] rowList = new NamedRow[]{player1_row0, player1_row1, player1_row2, player1_row3, player1_row4,
            player1_row5, player1_row6, player1_row7, player1_row8, player1_row9};
    return rowList;};


    public Ship[] returnShipList(){
    // create ships as objects
    Carrier player1_carriership = new Carrier();

    Battleship player1_battleship1 = new Battleship(); player1_battleship1.setShipName("Battleship 1");
    Battleship player1_battleship2 = new Battleship(); player1_battleship2.setShipName("Battleship 2");

    Submarine player1_submarine1 = new Submarine(); player1_submarine1.setShipName("Submarine 1");
    Submarine player1_submarine2 = new Submarine(); player1_submarine2.setShipName("Submarine 2");
    Submarine player1_submarine3 = new Submarine(); player1_submarine3.setShipName("Submarine 3");

    PatrolBoat player1_patrolBoat1 = new PatrolBoat(); player1_patrolBoat1.setShipName("PatrolBoat 1");
    PatrolBoat player1_patrolBoat2 = new PatrolBoat(); player1_patrolBoat2.setShipName("PatrolBoat 2");
    PatrolBoat player1_patrolBoat3 = new PatrolBoat(); player1_patrolBoat3.setShipName("PatrolBoat 3");
    PatrolBoat player1_patrolBoat4 = new PatrolBoat(); player1_patrolBoat4.setShipName("PatrolBoat 4");

    // cerate list with ships
    Ship[] shipList = new Ship[]{player1_carriership, player1_battleship1, player1_battleship2, player1_submarine1,
            player1_submarine2, player1_submarine3, player1_patrolBoat1,
            player1_patrolBoat2, player1_patrolBoat3, player1_patrolBoat4};
    return shipList;}}



