package com.sreesagar;
public class Isogram {
	
	/**
	 * word that has no repeating letters, consecutive or non-consecutive in java
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println(" Resultant::"+ isIsogram("Dermatoglyphics"));
		System.out.println(" Resultant::"+ isIsogram("moose"));
		System.out.println(" Resultant::"+ isIsogram("aba"));
	  }
    public static boolean  isIsogram(String str) {
        return str.length() == str.toLowerCase().chars().distinct().count();
    }
}
