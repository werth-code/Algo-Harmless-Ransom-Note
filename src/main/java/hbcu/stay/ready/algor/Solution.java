package hbcu.stay.ready.algor;

import java.util.ArrayList;
import java.util.Arrays;
//import java.util.HashMap;
import java.util.List;

public class Solution {

    public Boolean harmlessRansomNote(String message , String magazineText) {

        //Solution 1:
        //Convert the strings into ArrayLists, words are split on a " ".
        //Loop and ask if our messageWords ArrayList has the wordAtCurrentIndex exists -
        //If it does, remove it from our list and continue to the next index.
        //If if does NOT - immediately return false.
        // -- If our loop finished, that means that all words sufficient to complete our message are present --- return true.

        List<String> messageWords = new ArrayList<>(Arrays.asList(message.split(" ")));
        List<String> magazineWords = new ArrayList<>(Arrays.asList(magazineText.split(" ")));

        for(int i = 0; i < messageWords.size(); i++) {
            String wordAtCurrentIndex = messageWords.get(i);
            if (magazineWords.indexOf(wordAtCurrentIndex) != -1) magazineWords.remove(magazineWords.indexOf(wordAtCurrentIndex));
            else return false;
        }
        return true;

        //Solution 2:
        //Create an array from our magazineText, split on " ".
        //Create a new HashMap <String, Integer>
        //Loop and ask if our currentWord is in our HashMap
        //If it is, add 1 to our Integer contained within the Hashmap with .put("currentWord", count + 1)
        //If it is not - add it to our HashMap with .put("currentWord", 1)

        //Next, create an array from our messageText, split on " ".
        //If our magazineText includes the key for our currentWord - .put(""currentWord" count -1)
        //  Ask If our count is now less than 0 - If it is, return false.
        //If our magazineTest does not include the key for our currentWord - return false.
        //-- If our loop finished, that means that all words sufficient to complete our message are present --- return true.

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
