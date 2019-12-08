public class HumanTest {
    static String type = "Homo Sapiens";

    String name;
    String surname;

    public static String getType() {
        return type;
    }

    public String greeting() {
        return "Hello, I'm" + name + " " + surname;
    }
}

