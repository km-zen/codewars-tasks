package sentenceSmash;

public class SentenceSmash {

    public static String smashWords(String [] words){
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < words.length; i++) {
            sb.append(words[i]);
            if(i < words.length - 1){
                sb.append(" ");
            }
        }




        return sb.toString();
    }
    public static void main(String[] args) {

    }
}
