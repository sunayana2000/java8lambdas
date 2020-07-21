package com.maven.task;

import java.util.Arrays;

public interface PalindromeInterface {

    static Object[] findPalindrome(String[] arr) {
        return Arrays.stream(arr)
                .filter(i -> new StringBuilder(i).reverse().toString().equals(i))
                .toArray();
    }
}