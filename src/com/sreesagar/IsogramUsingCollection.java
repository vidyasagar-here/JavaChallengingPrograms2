package com.sreesagar;
import java.util.*;
public class IsogramUsingCollection {
	public static void main(String[] args) {
		System.out.println(" Resultant::"+ isIsogram("Dermatoglyphics"));
    System.out.println(" Resultant::"+ isIsogram("moose"));
    System.out.println(" Resultant::"+ isIsogram("aba"));
	  }
    public static boolean  isIsogram(String str) {
        String [] strAry = str.split("");
        Set<String> strMap = new HashSet (Arrays.asList(strAry));
        if(str.length()==strMap.size())
        return true;
        else
        return false;
    } 

}
