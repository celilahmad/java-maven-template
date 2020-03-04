package app.FormatterApp;

import java.util.Arrays;

public class FormatterApp {

    public static void print(String s, Formatter f){

        System.out.println(f.print(s));

    }
    public static void main(String[] args) {

        Formatter ftm1 = new Formatter1();
        Formatter ftm2 = new Formatter2();
        Formatter ftm3 = new Formatter3();


        /*ftm1.print("hello");
        ftm2.print("hello");
        ftm3.print("hello");*/

        System.out.println(ftm1.print("hello"));
        System.out.println(ftm2.print("hello"));
        System.out.println(ftm3.print("hello"));

       print("hello", ftm1);
       print("hello", ftm2);
       print("hello", ftm3);

        System.out.println(new Formatter1("hello"));
        System.out.println(new Formatter2("hello"));
        System.out.println(new Formatter3("hello"));
    }

}
