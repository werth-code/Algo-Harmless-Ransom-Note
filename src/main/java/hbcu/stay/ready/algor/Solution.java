package hbcu.stay.ready.algor;

import java.util.ArrayList;
import java.util.Arrays;
//import java.util.HashMap;
import java.util.List;

public class Solution {

    public Boolean harmlessRansomNote(String message , String magazineText) {

        //Solution 1:

        List<String> messageWords = new ArrayList<>(Arrays.asList(message.split(" ")));
        List<String> magazineWords = new ArrayList<>(Arrays.asList(magazineText.split(" ")));

        for(int i = 0; i < messageWords.size(); i++) {
            String wordAtCurrentIndex = messageWords.get(i);
            if (magazineWords.indexOf(wordAtCurrentIndex) != -1) magazineWords.set(magazineWords.indexOf(wordAtCurrentIndex), "");
            else return false;
        }
        return true;

      //Solution 2:

//        String[] magTextWords = magazineText.split(" ");
//        HashMap<String, Integer> magText = new HashMap<>();
//        for(int i = 0; i < magTextWords.length; i++) {
//            String current = magTextWords[i];
//            if(!magText.containsKey(current)) magText.put(current, 1);
//            else {
//                Integer count = magText.get(current);
//                magText.put(current, count + 1);
//            }
//        }
//
//        String[] messageWords = message.split(" ");
//        for (int i = 0; i < messageWords.length; i++) {
//            String current = messageWords[i];
//            if(magText.containsKey(current)) {
//                Integer count = magText.get(current);
//                magText.put(current, count -=1);
//                if(magText.get(current) < 0) return false;
//            }
//            else return false;
//        }
//        return true;
    }
}

//String noteText = "this is a secret note for you from a secret admirer";

//magazineText =  "puerto rico is a great place you must hike far from town to find a secret "+
//                "waterfall that i am an admirer of but note that it is not as hard as it seems "+
//                "this is my advice for you";
