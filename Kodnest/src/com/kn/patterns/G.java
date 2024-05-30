package com.kn.patterns;

public class G {

    public static void main(String[] args) {
        for (int r = 1; r <= 5; r++) {
            for (int c = 1; c <= 5; c++) {
                // Print "*" if any of the conditions match, otherwise print " "
                System.out.print((r == 1 || r == 5 || c == 1 || (r == 3 && c >= 2) || (c == 5 && r > 2)) ? "*" : " ");
            }
            System.out.println(" ");
        }
    }
}
