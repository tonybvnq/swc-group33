public enum Ship {
    CARRIER("Carrier", 6, 1),
    BATTLESHIP("Battleship", 4, 2),
    SUBMARINE("Submarine", 3, 3),
    PATROL_BOAT("Patrol_Boat", 2, 4);

    private final String name;
    private final int size;
    private final int amount;

    Ship(String name, int size, int amount) {
        this.name = name;
        this.size = size;
        this.amount = amount;
    }

    public int getSize() {
        return size;
    }

    public String getName() {
        return name;
    }

    public int getAmount() {
        return amount;
    }

    //Test comment

}
