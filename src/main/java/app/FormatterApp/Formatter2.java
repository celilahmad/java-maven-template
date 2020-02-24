package app.FormatterApp;

public class Formatter2 implements Formatter{

    String s;

    @Override
    public String print(String s) {
        System.out.println(s.toUpperCase());
        return s;
    }

    public Formatter2() {
    }

    public Formatter2(String s) {
        this.s = s;
    }

    @Override
    public String toString() {
        return s.toUpperCase();
    }
}
