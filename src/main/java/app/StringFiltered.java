package app;

public class StringFiltered {
    public static void main(String[] args) {
        final String VOW = "AEOIU";
        final String vow="aeoiu";
        int range = ('Z'-'A' + 1);
        int range1=('z' -'a' +1);
        int start = 'A';
        int start1='a';
        StringBuilder rand_s = new StringBuilder();
        StringBuilder rand_n= new StringBuilder();
        for (int i = 0; i < 30; i++) {
            char letter = (char) (Math.random() * range + start);
            char letter1=(char)(Math.random()* range1+start1);
            rand_s.append(letter);
            rand_n.append(letter1);
        }



        String random = rand_s.toString();
        String random1 = rand_n.toString();

        StringBuilder vowel1= new StringBuilder();
        StringBuilder consonants1 = new StringBuilder();

        StringBuilder vowels = new StringBuilder();
        StringBuilder consonants = new StringBuilder();
        for (int i = 0; i < random.length(); i++) {
            char c = random.charAt(i);
            if(VOW.contains(String.valueOf(c)) )
                vowels.append(c);
            else
                consonants.append(c);
        }

        for (int i = 0; i < random1.length(); i++) {
            char s = random1.charAt(i);
            if (vow.contains(String.valueOf(s))) vowel1.append(s);

            else consonants1.append(s);
        }

        //System.out.println(random);
        System.out.println(vowels.toString());
        System.out.println(consonants.toString());
        System.out.println(vowel1.toString());
        System.out.println(consonants1.toString());
    }
}
