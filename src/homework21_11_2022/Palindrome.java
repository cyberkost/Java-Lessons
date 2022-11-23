package homework21_11_2022;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class Palindrome {
    public static void main(String[] args) {
        String s = "abba";
        List<Character> characters = new ArrayList<>();
        for (int i = 0; i < s.length(); i++) {
            characters.add(s.charAt(i));
        }
        ListIterator<Character> listIterator = characters.listIterator();
        ListIterator<Character> listReverse = characters.listIterator(characters.size());
        System.out.println(listIterator.hasNext());
        System.out.println(listReverse.hasPrevious());
        while (listIterator.hasNext() != listReverse.hasPrevious()) {
            System.out.println("False");
        }
        if (listIterator.next().equals(listIterator.previous())) {
            System.out.println("True");
        }
    }
}


