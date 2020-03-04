package app.FormatterApp;

public class Formatter2 implements Formatter{

    String s;

    @Override
    public String print(String s) {
        return s.toUpperCase();
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
