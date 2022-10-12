package pl.markowski.konrad.codewars.com.kata.kyu6;

import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;


public class YourOrderPlease {
// moja wersja
    public static String order(String words){

        String [] splitedWords = words.split(" ");
        if(splitedWords.length == 1)
        {
            return splitedWords[0];
        }

        HashMap<Integer, String> m = new HashMap<>();

        for (String word: splitedWords) {
            char [] chars = word.toCharArray();
            for (char ch: chars) {
                if(Character.isDigit(ch)){
                    m.put(Integer.parseInt(ch + ""),word);
                }
                
            }
            
        }
        int n = m.size();
        StringBuilder sb = new StringBuilder();
        for (int i = 1; i <= n ; i++) {
           sb.append(m.get(i));
           if(i < n){
               sb.append(" ");
           }

        }
        return sb.toString();
    }

    // wersja codewars best practise and clever

//        public static String order2(String words) {
//            return Arrays.stream(words.split(" "))
//                    .sorted(Comparator.comparing(s -> Integer.valueOf(s.replaceAll("\\D", ""))))
//                    .reduce((a, b) -> a + " " + b).get();
//        }

}
