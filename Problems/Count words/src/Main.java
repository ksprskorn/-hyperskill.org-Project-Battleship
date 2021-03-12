import java.io.BufferedReader;
import java.io.InputStreamReader;

class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String inputLine = reader.readLine().trim();
        reader.close();
        if (inputLine.length() != 0) {
            String[] input = inputLine.split("\\s+");
            System.out.println(input.length);
        } else {
            System.out.println("0");
        }
    }
}