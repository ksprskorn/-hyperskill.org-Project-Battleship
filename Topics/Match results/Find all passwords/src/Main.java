import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String text = scanner.nextLine();
        // write your code here
        Pattern pattern = Pattern.compile("password:? *", Pattern.CASE_INSENSITIVE);
        Matcher matcher = pattern.matcher(text);

        Pattern patternPasword = Pattern.compile("",Pattern.CASE_INSENSITIVE);
        Matcher matcherPasword = patternPasword.matcher(text);

        if (!matcher.find()) {
            System.out.println("No passwords found.");
        } else {
            matcher.reset();
        }
        String textModify;
        int lastIndex;
        while (matcher.find()) {
            textModify = text.substring(matcher.end(),text.length());
            if (textModify.indexOf(".") < textModify.indexOf(" ")) {
                lastIndex = textModify.indexOf(".");
            } else {
                lastIndex = textModify.indexOf(" ");
            }
            if (textModify.indexOf(".") < 0 ) {
                lastIndex = textModify.indexOf(" ");
            }
            if (textModify.indexOf(" ") < 0 ) {
                lastIndex = textModify.indexOf(".");
            }

            System.out.println(textModify.substring(0,lastIndex));
            lastIndex = -1;
        }

    }
}
