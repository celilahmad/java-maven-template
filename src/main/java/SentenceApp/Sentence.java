package SentenceApp;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Sentence {

    public static void main(String[] args) {
        List<String> subjects = Arrays.asList("Noel", "The cat", "The dog");
        List<String> verbs =  Arrays.asList("wrote", "chased", "slept on");
        List<String> objects = Arrays.asList("the book","the ball","the bed");

        List<String> sentences = all_possible(subjects, verbs, objects);
        for( String s : sentences){
            System.out.println(s);
        }

    }

    private static List<String> all_possible(List<String> subjects, List<String> verbs, List<String> objects) {

       List<String> sentence = new ArrayList<>();


        for (int i=0; i<subjects.size(); i++){
            for (int j =0; j<verbs.size(); j++){
                for (int k = 0; k<objects.size(); k++){
                    //System.out.println(subjects.get(i) + verbs.get(j) + objects.get(k));
                    sentence.add(subjects.get(i) + " " +verbs.get(j) + " "+ objects.get(k));
                }
            }
        }
        return sentence;
    }
}
