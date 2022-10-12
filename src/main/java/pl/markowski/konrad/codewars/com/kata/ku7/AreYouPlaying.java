package pl.markowski.konrad.codewars.com.kata.ku7;

import java.util.Locale;

public class AreYouPlaying {

    // moja wersja
    static String validate(String name){
       char [] chars =  name.toLowerCase(Locale.ROOT).trim().toCharArray();
        if(chars[0] == 'r'){
            return name + " plays banjo";
        }
       return name + " does not play banjo";
    }

// wersja z codewars
    static String validate2(String name){
        if(name.toLowerCase().startsWith("r")){
            return name + " plays banjo";
        }
        return name + " does not play banjo";
    }
}
