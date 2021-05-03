class ChristmasTree {

    private String color;

    public ChristmasTree(String color) {
        this.color = color;
    }

    public void putTreeTopper(String color) {
        new TreeTopper(color).sparkle();
    }

    class TreeTopper {

        private String color;

        public TreeTopper(String color) {
            this.color = color;
        }

        public void sparkle() {
            if ("green".equals(ChristmasTree.this.color) && "silver".equals(this.color)) {
                System.out.println("Sparkling silver tree topper looks stunning with green Christmas tree!");
            }
        }
    }
}

// this code should work
class CreateHoliday {

    public static void main(String[] args) {

        ChristmasTree christmasTree = new ChristmasTree("green");
        christmasTree.putTreeTopper("silver");
    }
}