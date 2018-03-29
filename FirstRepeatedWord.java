package test;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.OutputStreamWriter;
import java.util.Scanner;

public class FirstRepeatedWord {
	public static void main(String[] args) {
		String s = "He had; had: quite enough of this non-sense.kk";
		
		String[] strarr = s.split(" |;|:|,|\\.|-");
		String pre = "";
		for (String string : strarr) {
			System.out.println(string);
			if(pre.equals(string)){
				System.out.println(pre);
			}
			pre = string;
		}
	    
	}
	
}
