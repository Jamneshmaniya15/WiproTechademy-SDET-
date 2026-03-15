package day1;

import java.util.Scanner;

public class CamelCaseWords {

    public static void camelCase(String str) {
        String word = "";

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (Character.isUpperCase(ch)) {
                System.out.println(word);
                word = "" + ch;
            } else {
                word = word + ch;
            }
        }
        System.out.println(word);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        camelCase(input);
        sc.close();
    }
}