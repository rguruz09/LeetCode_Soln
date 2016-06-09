package com.company;

import java.util.Set;

/**
 * Created by Raghu on 3/18/2016.
 */
public class SplitWords {

    public static boolean wordBreak(String s, Set<String> wordDict) {

        boolean[] mem = new boolean[s.length()];
        for (int i = 0; i < s.length(); i++) {
            if (mem[i] == false && wordDict.contains(s.substring(0, i + 1))) {
                mem[i] = true;
            }

            if (mem[i] == true) {
                for (int j = i + 1; j < s.length(); j++) {
                    if (wordDict.contains(s.substring(i + 1, j + 1))) {
                        mem[j] = true;
                    }
                }
            }
        }

        return mem[s.length() - 1];
    }

}
