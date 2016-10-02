package com.innovecs.carriers.qaa;

import java.util.ArrayList;
import java.util.Collections;

/**
 * Created by cherleo on 10/2/16.
 */
public class Dictionary implements IsDictionary {
    ArrayList<String> wordsList = new ArrayList<String>();

    public void store(String word) {
        wordsList.add(word);
    }

    public int getOccurence(String word) {
        int counter = 0;
        for (String wordFromList : wordsList) {
            if (wordFromList.toLowerCase().equals(word.toLowerCase())) {
                counter++;
            }
        }
        return counter;
    }
}
