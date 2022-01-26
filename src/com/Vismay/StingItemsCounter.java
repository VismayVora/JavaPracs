package com.Vismay;

import java.util.*;

public class StingItemsCounter{
    public static void main(String[] args) {
        Scanner s1 = new Scanner(System.in);
        System.out.println("Enter a sentence:");
        String str = s1.nextLine();
        int l = str.length();
        int i =0, alpha=0, digit=0, spaces=0, conso = 0, vow = 0, words =0, special=0;
        while(i < l){
            char c = str.charAt(i);
            if (Character.isLetter(c)) {
                alpha++;
                if(c == 'a' || c == 'e' || c =='i'|| c == 'o' || c == 'u')
                    vow++;
                else
                    conso++;
            }
            else if(Character.isDigit(c))
                digit++;
            else if(c == ' ') {
                spaces++;
                if(i != 0 && str.charAt(i-1) == ' ')
                    words--;
            }
            else
                special++;
            i++;
        }
        words += spaces;
        System.out.println("ALPHABETS " + alpha);
        System.out.println("VOWELS " + vow);
        System.out.println("CONSONANTS " + conso);
        System.out.println("DIGITS " + digit);
        System.out.println("SPACES " + spaces);
        System.out.println("SYMBOLS " + special);
    }
}
