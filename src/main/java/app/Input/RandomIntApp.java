package app.Input;

import java.io.*;
import java.util.*;
import java.util.stream.Collectors;

public class RandomIntApp {
    public static void main(String[] args) throws IOException {

        List<Integer> radoms = generate(100, 30, -30);
        String.valueOf(radoms);

        List<String> newStr = convertSi(radoms);
        write(newStr, "file1.txt");

        List<String> randoms2 = read("file1.txt");
        List<Integer> convert = convert(randoms2);
        List<Integer> sorted_randoms = sorting(convert);
        List<String> sorted_randomss = convertSi(sorted_randoms);
        write(sorted_randomss, "file2.txt");


    }

    public static List<Integer> generate(int length, int plus, int minus) {
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < length; i++) {
            int rand = ((int) (Math.random() * (plus - minus) + minus));
            list.add(rand);
        }
        return list;
    }

    private static void write(List<String> processed, String name) throws IOException {
        File ofile = new File(name);
        BufferedWriter bw = new BufferedWriter(new FileWriter(ofile));
        for (String line : processed) {
            bw.write(line);
            bw.write("\n");
        }
        bw.close();
    }

    private static List<String> read(String name) throws IOException {
        File ifile = new File(name);
        FileReader fr = new FileReader(ifile);
        BufferedReader br = new BufferedReader(fr);
        List<String> lines = br.lines().collect(Collectors.toList());
        br.close();
        return lines;
    }



    private static List<String> convertSi(List<Integer> sorted_randoms) {
        List<String> list = new ArrayList<>();

        sorted_randoms.stream().map(m -> String.valueOf(m)).forEach(n -> list.add(n));

        return list;

    }

    private static List<Integer> sorting(List<Integer> convert) {
        Comparator<Integer> comp = new Comparator<Integer>() {
            @Override
            public int compare(Integer t0, Integer t1) {
                if (t0 > t1) return 1;
                else return -1;
            }
        };
        List<Integer> list = new ArrayList<>();
        convert.sort(comp);
        list.addAll(convert);
        return list;

    }

    private static List<Integer> convert(List<String> randoms2) {
        List<Integer> list = new ArrayList<>();

        randoms2.stream().mapToInt(m -> Integer.parseInt(m)).forEach(n -> list.add(n));
        return list;
    }


}
