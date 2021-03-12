class ArrayOperations {
    public static void printCorners(int[][] twoDimArray) {
        if (twoDimArray[0].length == 1 && twoDimArray.length == 1) {
//            System.out.print(twoDimArray[0][0]);

        } else if (twoDimArray[0].length == 1) {
//            System.out.println(twoDimArray[0][0]);
//            System.out.print(twoDimArray[twoDimArray.length - 1][0]);

        } else if (twoDimArray.length == 1) {
//            System.out.print(twoDimArray[0][0] + " " + twoDimArray[0][twoDimArray[0].length - 1]);

        } else {
            for (int i = 0; i < twoDimArray.length; i++) {
                for (int j = 0; j < twoDimArray[0].length; j++) {
                    if ((i == 0 && j == 0) ||
                            (i == twoDimArray.length - 1 && j == 0)
                    ) {
                        System.out.print(twoDimArray[i][j] + " ");
                    }

                    if (i == 0 && j == twoDimArray[0].length - 1) {
                        System.out.println(twoDimArray[i][j]);
                    }

                    if (i == twoDimArray.length - 1 && j == twoDimArray[0].length - 1) {
                        System.out.print(twoDimArray[i][j]);
                    }
                }
            }
        }
    }

//    public static void main(String[] args) {
//        System.out.println("\n-------1--------");
//
//        int[][] twoDimArray1 = {{9}};
//        printCorners(twoDimArray1);
//
//        System.out.println("\n-------2--------");
//
//        int[][] twoDimArray2 = {{1},
//                {0},
//                {3}};
//        printCorners(twoDimArray2);
//
//        System.out.println("\n-------3--------");
//
//        int[][] twoDimArray3 = {{1, 2, 3}};
//        printCorners(twoDimArray3);
//
//        System.out.println("\n-------4--------");
//
//        int[][] twoDimArray4 = {{1, 2},
//                                {3, 4}};
//        printCorners(twoDimArray4);
//
//        System.out.println("\n-------5--------");
//
//        int[][] twoDimArray5 = {{1, 0, 2},
//                                {0, 0, 0},
//                                {3, 0, 4}};
//        printCorners(twoDimArray5);
//
//        System.out.println("\n--------6-------");
//
//        int[][] twoDimArray6 = {{1, 0, 2, 5, 9, 4},
//                {0, 0, 0, 7, 8, 5}};
//        printCorners(twoDimArray6);
//
//        System.out.println("\n--------7-------");
//
//        int[][] twoDimArray7 = {{9, 0},
//                {8, 1},
//                {7, 2},
//                {6, 3},
//                {5, 4},
//                {4, 5},
//                {3, 6},
//                {2, 7},
//                {1, 89},
//                {0, 10}};
//        printCorners(twoDimArray7);
//        System.out.println("\n-------end--------");
//    }
}