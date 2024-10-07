/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Muhammad_Umar
 */
public class leetcode3 {
     public void fintTheDifference(String s,String t) {
        int[] count = new int[26];
        for (char c : t.toCharArray()) {
            count[c - 'a']++;
        }
        for (char c : s.toCharArray()) {
            count[c - 'a']--;
        }
        for (int i = 0; i < 26; i++) {
            if (count[i] == 1) {
                System.out.println((char) (i + 'a') + " " + count[i]);
            }
        }
    }
    public static void main(String[] args) {
        leetcode3 f = new leetcode3();
        f.fintTheDifference("abcd", "abcdf");

    }
}
