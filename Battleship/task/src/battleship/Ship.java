package battleship;

public final class Ship {
    private final String shipName;
    private final int lenght;

    public Ship(String shipName, int lenght) {
        this.shipName = shipName;
        this.lenght = lenght;
    }

    public String getShipName() {
        return shipName;
    }

    public int getLenght() {
        return lenght;
    }
}
