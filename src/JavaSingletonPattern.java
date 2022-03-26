public class JavaSingletonPattern {

    private JavaSingletonPattern() {}

    public String str;

    public static JavaSingletonPattern getInstance() {
        return new JavaSingletonPattern();
    }
}
