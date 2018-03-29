package test;

public class DecimalLength {
public static void main(String[] args) {
	float a = 5;
	float b = 3;
	
	float c = a/b;
	
	System.out.println(c);
	
	String s = c+"";
	String s2[] = s.split("\\.");
	if(!s2[1].equals("0")){

		System.out.println(s2[1].length());
	}
	
}
}
