package app.FormatterApp;

public class Formatter1 implements Formatter{

    String s;

    @Override
    public String print(String s){

        return s;
    }

    public Formatter1() {
    }

    public Formatter1(String s) {
        this.s = s;
    }

    @Override
    public String toString() {
        return s;
    }
}
