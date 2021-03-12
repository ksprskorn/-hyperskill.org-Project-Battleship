class Problem {
    public static void main(String[] args) {
        String output = "default";

        for (int i = 0; i < args.length; i += 2) {
            if (args[i].equals("mode")) {
                output = args[i + 1];
            }
        }
        System.out.println(output);
    }
}