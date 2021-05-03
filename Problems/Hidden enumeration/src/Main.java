public class Main {

    public static void main(String[] args) {
        Secret[] secretEnum = Secret.values();
        int count = 0;
        for (Secret secret : secretEnum) {
            if (secret.name().startsWith("STAR")) {
                count++;
            }
        }
        System.out.println(count);
    }
}

/* sample enum for inspiration
   enum Secret {
    STAR, CRASH, START, // ...
}
/*/