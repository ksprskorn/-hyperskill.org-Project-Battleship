import java.io.BufferedReader;
import java.io.InputStreamReader;

class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int charAsNumber = reader.read();
        String output = "";
        while (charAsNumber != -1) {
            output = (char) charAsNumber + output;
            charAsNumber = reader.read();
        }
        reader.close();
        System.out.println(output);
    }
}