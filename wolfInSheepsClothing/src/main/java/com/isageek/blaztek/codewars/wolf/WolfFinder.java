package com.isageek.blaztek.codewars.wolf;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class WolfFinder {

    public static String warnTheSheep(String[] array) {
        String answer;

        // Reverse the array to the indexes are in the correct order
        List<String> reverse = Arrays.asList(array);
        Collections.reverse(reverse);

        // The instructions say that there is always a wolf
        int index = reverse.indexOf("wolf");

        if (index == 0) {
            // Wolf is facing you
            answer = "Pls go away and stop eating my sheep";
        } else {
            // Wolf is facing a sheep.
            // The index of the sheep the wolf is going to eat is
            // `index - 1` but adding 1 to that to get an index that starts at
            // 1 is just `index`.
            answer = "Oi! Sheep number " + index + "! You are about to be eaten by a wolf!";
        }

        return answer;
    }

}
