package app.FormatterApp;

public class Formatter3 implements Formatter{

    String s;

    @Override
    public String print(String s) {
        return "*************\n****" + s.toUpperCase() + "****\n*************";
    }

    public Formatter3() {
    }

    public Formatter3(String s) {

        this.s = s;
    }

    @Override
    public String toString() {
        return "*************\n****" + s.toUpperCase() + "****\n*************";
    }
}
