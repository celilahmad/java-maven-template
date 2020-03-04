package app.WarmApp13;

import java.io.*;
import java.util.*;
import java.util.stream.Collectors;

public class SentenceApp {
    public static List<String> newList(HashMap<String,List<String>> map1, HashMap<String,List<String>> map2){
        List<String> list = new ArrayList<>();

        for (String s: map1.keySet()){
            for (String v: map1.get(s)){
                for (String o: map2.get(v)){
                    list.add((s+" " + v + " " + o));
                }
            }
        }

        return  list;

    }
    public static void main(String[] args) throws IOException {

        List<String> subj = read("subj_verb_.txt");
        List<String> verb = read("verb_obj_.txt");

        List<String> sentence= new ArrayList<>();

        HashMap<String, List<String>> sv = convert(subj);
        HashMap<String, List<String>> ov = convert(verb);

        sentence.addAll(newList(sv,ov));

        write(sentence);


    }

    private static HashMap<String, List<String>> convert(List<String> subj) {

        HashMap<String, List<String>> newMap = new HashMap<>();
        String[] st;
        String[] st1;
        String key;

        for (int i = 0; i < subj.size(); i++) {
            List<String> list = new ArrayList<>();
            st = subj.get(i).split(":");
            key = st[0].trim();
            st1 = st[1].split(",");
            for (int j = 0; j < st1.length; j++) {
                list.add(st1[j].trim());
            }
            newMap.put(key, list);
        }
        return newMap;

    }


     private static List<String> read(String filename) throws FileNotFoundException {
        File file = new File(filename);
        FileReader fr = new FileReader(file);
        BufferedReader br = new BufferedReader(fr);
        return br.lines().collect(Collectors.toList());
    }

    private static void write(List<String> st) throws IOException {
         BufferedWriter bw = new BufferedWriter(new FileWriter("sentence.txt"));
         for (String s : st){
             bw.write(s);
             bw.write("\n");
         }
         bw.close();
    }
}
