package org.vashonsd;
import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        // GOAL: Calculate the frequency of a given letter within a String
        Scanner scan = new Scanner(System.in);
        System.out.println("Give me a string");
        String answ = scan.nextLine();
        int[] freq = new int[answ.length()];
        char[] string = answ.toCharArray();
        for (int i = 0; i < answ.length(); i++) {
            freq[i] = 1;
            for (int j = i + 1; j < answ.length(); j++) {
                if (string[i] == string[j]) {
                    freq[i]++;
                    string[j] = 0;
                }
            }
        }
        System.out.println("Characters and their corresponding frequencies:");
        for (int i = 0; i < freq.length; i++) {
            if (string[i] != ' ' && string[i] != '0')
                System.out.println(string[i] + "-" + freq[i]);
        }
    }
}
