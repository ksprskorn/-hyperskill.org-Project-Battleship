package battleship;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    private static Scanner scanner = new Scanner(System.in);
    private static BattleField battleField1 = new BattleField();
    private static BattleField battleField2 = new BattleField();
    private static Ships ships = new Ships();

    public static void main(String[] args) {

        String[] playerNames = {"Player 1", "Player 2"};
        BattleField[] battleFields = {battleField1, battleField2};

        for (int i = 0; i < 2; i++) {
            System.out.println(playerNames[i] + ", place your ships on the game field");
            fillField(battleFields[i]);
            System.out.println("Press Enter and pass the move to another player");
            scanner.nextLine();
        }
        String playerPlayed = playerNames[0];
        String playerWait = playerNames[1];

        BattleField battleFieldsPlayed = battleFields[1];
        BattleField battleFieldsWait = battleFields[0];

        while (!battleFieldsPlayed.isGameFinish() || !battleFieldsWait.isGameFinish()) {
            System.out.println(battleFieldsPlayed.printBattleField(true));
            System.out.println("---------------------");
            System.out.println(battleFieldsWait.printBattleField(false));

            System.out.println("\n" + playerPlayed + ", it's your turn:");
            String input = scanner.nextLine();
            battleFieldsPlayed.takeShot(input);

            String tempPlayer = playerPlayed;
            playerPlayed = playerWait;
            playerWait = tempPlayer;

            BattleField tempBattleFields = battleFieldsPlayed;
            battleFieldsPlayed = battleFieldsWait;
            battleFieldsWait = tempBattleFields;

            System.out.println("Press Enter and pass the move to another player");
            scanner.nextLine();
        }
    }

    private static void fillField(BattleField battleField) {
        System.out.println(battleField.printBattleField(false));

        String input;
        int shipCount = 0;
        for (Ship ship : ships.getShips()) {
            System.out.println("Enter the coordinates of the " + ship.getShipName() + " (" + ship.getLenght() + " cells):");
            boolean addSuccessfully = false;
            while (!addSuccessfully) {
                input = scanner.nextLine();
                String[] inputArray = input.toUpperCase().split(" ");

                addSuccessfully = checkInput(inputArray, ship);

                if (addSuccessfully) {
                    addSuccessfully = battleField.addShipOnField(shipCoordinates(inputArray), shipCount);
                }
            }
            shipCount++;
            System.out.println(battleField.printBattleField(false));
        }

    }

    private static boolean checkInput(String[] inputArray, Ship ship) {
        String[] startField = new String[]{inputArray[0].substring(0, 1), inputArray[0].substring(1)};
        String[] endField = new String[]{inputArray[1].substring(0, 1), inputArray[1].substring(1)};

        if (!(startField[0].charAt(0) >= 'A' && startField[0].charAt(0) <= 'J') ||
                !(endField[0].charAt(0) >= 'A' && endField[0].charAt(0) <= 'J') ||
                !(Integer.parseInt(startField[1]) > 0 && Integer.parseInt(startField[1]) < 11) ||
                !(Integer.parseInt(endField[1]) > 0 && Integer.parseInt(endField[1]) < 11)
        ) {
            System.out.println("Error! Wrong ship location! Try again:");
            return false;
        }

        if (startField[0].equals(endField[0])) {
            int len = Math.abs(Integer.parseInt(startField[1]) - Integer.parseInt(endField[1])) + 1;
            if (len == ship.getLenght()) {
                return true;
            } else {
                System.out.println("Error! Wrong length of the " + ship.getShipName() + "! Try again:");
                return false;
            }
        } else if (startField[1].equals(endField[1])) {
            int len = Math.abs(startField[0].charAt(0) - endField[0].charAt(0)) + 1;
            if (len == ship.getLenght()) {
                return true;
            } else {
                System.out.println("Error! Wrong length of the " + ship.getShipName() + "! Try again:");
                return false;
            }
        } else {
            System.out.println("Error! Wrong ship location! Try again:");
            return false;
        }

    }

    private static ArrayList<String> shipCoordinates(String[] inputArray) {
        ArrayList<String> coordinate = new ArrayList<>();

        String[] startField = new String[]{inputArray[0].substring(0, 1), inputArray[0].substring(1)};
        String[] endField = new String[]{inputArray[1].substring(0, 1), inputArray[1].substring(1)};

        if (startField[0].equals(endField[0])) {
            int min = Math.min(Integer.parseInt(startField[1]), Integer.parseInt(endField[1]));
            int len = Math.abs(Integer.parseInt(startField[1]) - Integer.parseInt(endField[1])) + 1;
            for (int i = min; i < min + len; i++) {
                String field = startField[0] + i;
                coordinate.add(field);
            }
        } else if (startField[1].equals(endField[1])) {
            char min = startField[0].charAt(0) < endField[0].charAt(0) ? startField[0].charAt(0) : endField[0].charAt(0);
            int len = Math.abs(startField[0].charAt(0) - endField[0].charAt(0)) + 1;
            for (int i = 0; i < len; i++) {
                String field = "" + min + startField[1];
                min++;
                coordinate.add(field);
            }
        }
        return coordinate;
    }


}
