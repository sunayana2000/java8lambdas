package com.maven.task;

import java.util.Arrays;
import java.util.Scanner;
import java.util.function.Consumer;

public class Palindrome {

    public static void main(String[] args) {
        Scanner io = new Scanner(System.in);

        System.out.println("Enter list spaced by a single space : ");
        String str = io.nextLine();
        String[] arr = str.split(" ");

        Object[] objects = PalindromeInterface.findPalindrome(arr);

        Consumer<Object> consumer = System.out::println;
        Arrays.stream(objects).forEach(consumer::accept);
    }