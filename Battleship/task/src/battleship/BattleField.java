package battleship;

import java.util.ArrayList;

public class BattleField {
    private final ArrayList<Field> fields;

    public BattleField() {
        this.fields = new ArrayList<>();
        for (char row = 'A'; row <= 'J'; row++) {
            for (int col = 1; col <= 10; col++) {
                String fieldName = "" + row + col;
                Field field = new Field(fieldName);
                fields.add(field);
            }
        }
    }

    public boolean isGameFinish() {
        for (Field field : fields) {
            if (field.getShipID() != null && !field.isHit()) {
                return false;
            }
        }
        return true;
    }

    public boolean addShipOnField(ArrayList<String> shipLocations, int shipID) {
        if (!isFreeForFill(shipLocations)) {
            System.out.println("Error! You placed it too close to another one. Try again:");
            return false;
        } else {
            for (String loc : shipLocations) {
                for (Field field : fields) {
                    if (field.getName().equals(loc)) {
                        field.setShipID(shipID);
                    }
                }
            }
            return true;
        }
    }

    public boolean shipStillAlive(int shipID) {
        for (Field field : fields) {
            int getShipID = field.getShipID() == null?-1:field.getShipID();
            if (getShipID == shipID && !field.isHit()) {
                return true;
            }
        }
        return false;
    }

    public boolean takeShot(String input) {
        Field field = selectField(input);
        if (field == null) {
            System.out.println("Error! You entered the wrong coordinates! Try again:");
            return false;
        } else {
            if (field.getShipID() != null) {
                field.setHit(true);
                System.out.println(this.printBattleField(true));
                if (isGameFinish()) {
                    System.out.println("You sank the last ship. You won. Congratulations!");
                } else if (!shipStillAlive(field.getShipID())) {
                    System.out.println("You sank a ship! Specify a new target:");
                } else {
                    System.out.println("You hit a ship!");
                }
            } else {
                field.setMiss(true);
                System.out.println("You missed!");
            }
            return true;
        }

    }

    private Field selectField(String input) {
        char row = input.charAt(0);
        int col = Integer.parseInt(input.substring(1));
        if (validRow(row) && validCol(col)) {
            for (Field field : fields) {
                if (field.getName().equals(input)) {
                    return field;
                }
            }
        }
        return null;
    }

    private boolean isFreeForFill(ArrayList<String> shipLocations) {
        for (String shipLoc : shipLocations) {
            ArrayList<String> surroundFields = allSurroundFields(shipLoc);
            for (String loc : surroundFields) {
                for (Field field : fields) {
                    if (field.getName().equals(loc) && field.getShipID() != null) {
                        return false;
                    }
                }
            }
        }
        return true;
    }

    private ArrayList<String> allSurroundFields(String fieldName) {
        ArrayList<String> surroundFields = new ArrayList<>();
        char row = fieldName.charAt(0);
        int col = Integer.parseInt(fieldName.substring(1));
        surroundFields.add("" + row + col);

        for (int i = -1; i < 2; i += 2) {
            if (validRow((char) (row + i)) && validCol(col + i)) {
                surroundFields.add("" + ((char) (row + i)) + (col + i));
            }
            if (validCol(col + i)) {
                surroundFields.add("" + (row) + (col + i));
            }
            if (validRow((char) (row + i))) {
                surroundFields.add("" + ((char) (row + i)) + (col));
            }
            if (validRow((char) (row + i)) && validCol(col - i)) {
                surroundFields.add("" + ((char) (row + i)) + (col - i));
            }
        }
        return surroundFields;
    }

    private static boolean validRow(char value) {
        return value >= 'A' && value <= 'J';
    }

    private static boolean validCol(int value) {
        return value >= 1 && value <= 10;
    }

    public String printBattleField(boolean fog) {
        StringBuilder output = new StringBuilder(" ");

        for (int i = 1; i <= 10; i++) {
            output.append(" ").append(i);
        }
        char a = 'A';
        output.append("\n").append(a);
        int i = 1;
        for (Field field : fields) {
            String fieldStatus;
            if (field.isHit()) {
                fieldStatus = "X";
            } else if (field.isMiss()) {
                fieldStatus = "M";
            } else if (field.getShipID() != null && !fog) {
                fieldStatus = "O";
            } else {
                fieldStatus = "~";
            }
            output.append(" ").append(fieldStatus);
            if (i > 9 && a < 'J') {
                a++;
                output.append("\n").append(a);
                i = 0;
            }
            i++;
        }
        return output.toString();
    }
}
