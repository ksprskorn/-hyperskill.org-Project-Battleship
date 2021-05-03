package battleship;

public class Field {
    private String name;
    private boolean isHit;
    private boolean isMiss;
    private Integer shipID;

    public Field(String name) {
        this.name = name;
        this.isHit = false;
        this.isMiss = false;
        this.shipID = null;
    }

    public String getName() {
        return name;
    }

    public boolean isHit() {
        return isHit;
    }

    public boolean isMiss() {
        return isMiss;
    }

    public void setHit(boolean hit) {
        isHit = hit;
    }

    public Integer getShipID() {
        return shipID;
    }

    public void setShipID(Integer shipID) {
        this.shipID = shipID;
    }

    public void setMiss(boolean miss) {
        isMiss = miss;
    }
}
