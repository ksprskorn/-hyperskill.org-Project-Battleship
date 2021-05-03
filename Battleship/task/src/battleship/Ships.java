package battleship;

import java.util.ArrayList;

public final class Ships {
    private final ArrayList<Ship> ships;

    public Ships() {
        this.ships = new ArrayList<>();
        ships.add(new Ship("Aircraft Carrier",5));
        ships.add(new Ship("Battleship",4));
        ships.add(new Ship("Submarine",3));
        ships.add(new Ship("Cruiser",3));
        ships.add(new Ship("Destroyer",2));
    }

    public ArrayList<Ship> getShips() {
        return ships;
    }
}