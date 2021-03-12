class ArrayOperations {
    public static void reverseElements(int[][] twoDimArray) {
        for (int row = 0; row < twoDimArray.length; row++) {
            for (int col = 0; col < twoDimArray[row].length / 2; col++) {
                int temp = twoDimArray[row][col];
                twoDimArray[row][col] = twoDimArray[row][twoDimArray[row].length - 1 - col];
                twoDimArray[row][twoDimArray[row].length - 1 - col] = temp;
            }
        }
    }
}