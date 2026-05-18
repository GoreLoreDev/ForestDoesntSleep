/*Aim of the program -Write a program to perform following operations on user entered strings and
a character –
i) Change the case of the string
ii) Reverse the string
iii) Compare two strings
iv) Insert one string into another string
v) Convert the string to upper case and lower case
vi) Check whether the character is present in the string and at which position
vii) Check whether the string is palindrome or not.
viii) Check the number of word, vowel and consonant in the string*/

import java.util.Scanner;

public class Main2 {

    
    public static String changeCase(String str) {
        StringBuilder sb = new StringBuilder();
        for (char c : str.toCharArray()) {
            if (Character.isLowerCase(c))
                sb.append(Character.toUpperCase(c));
            else if (Character.isUpperCase(c))
                sb.append(Character.toLowerCase(c));
            else
                sb.append(c);
        }
        return sb.toString();
    }

    
    public static String reverseString(String str) {
        return new StringBuilder(str).reverse().toString();
    }

    
    public static void compareStrings(String str1, String str2) {
        int cmp = str1.compareTo(str2);
        if (cmp == 0)
            System.out.println("Strings are equal.");
        else if (cmp < 0)
            System.out.println("First string is smaller.");
        else
            System.out.println("First string is greater.");
    }

    
    public static String insertString(String str1, String str2, int pos) {
        return str1.substring(0, pos) + str2 + str1.substring(pos);
    }

    
    public static void convertCases(String str) {
        System.out.println("Upper case: " + str.toUpperCase());
        System.out.println("Lower case: " + str.toLowerCase());
    }

    
    public static void checkCharacter(String str, char ch) {
        int pos = str.indexOf(ch);
        if (pos == -1)
            System.out.println("Character not found.");
        else
            System.out.println("Character found at position: " + (pos + 1));
    }

    
    public static void checkPalindrome(String str) {
        String rev = reverseString(str);
        if (str.equalsIgnoreCase(rev))
            System.out.println("String is a palindrome.");
        else
            System.out.println("String is not a palindrome.");
    }

    
    public static void countWordsVowelsConsonants(String str) {
        String[] words = str.trim().split("\\s+");
        int wordCount = words.length;

        int vowels = 0, consonants = 0;
        str = str.toLowerCase();
        for (char c : str.toCharArray()) {
            if ("aeiou".indexOf(c) != -1) vowels++;
            else if (Character.isLetter(c)) consonants++;
        }

        System.out.println("Words: " + wordCount);
        System.out.println("Vowels: " + vowels);
        System.out.println("Consonants: " + consonants);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first string: ");
        String str1 = sc.nextLine();

        System.out.print("Enter second string: ");
        String str2 = sc.nextLine();

        System.out.print("Enter a character: ");
        char ch = sc.next().charAt(0);

        System.out.println("\n--- Operations ---");
        System.out.println("Case changed: " + changeCase(str1));
        System.out.println("Reversed: " + reverseString(str1));
        compareStrings(str1, str2);

        System.out.print("Enter position to insert second string into first: ");
        int pos = sc.nextInt();
        System.out.println("After insertion: " + insertString(str1, str2, pos));

        convertCases(str1);
        checkCharacter(str1, ch);
        checkPalindrome(str1);
        countWordsVowelsConsonants(str1);

        sc.close();
    }
}