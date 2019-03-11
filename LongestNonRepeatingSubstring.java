import java.util.HashSet;

public class LongestNonRepeatingSubstring {
    public static String subString(String input){

        HashSet<Character> set = new HashSet<Character>();

        String longestOverAll = "";
        String longestTillNow = "";
        
     
        for (int i = 0; i < input.length(); i++) {
        	for (int j = i+1; j < input.length(); j++) {
        		char c = input.charAt(j);
        		
        		if(set.contains(input.charAt(i))){
        			longestTillNow ="";
        			set.clear();
        			break;
        		}
        		set.add(c);
    			longestTillNow += c;
	             if (longestTillNow.length() > longestOverAll.length()) {
	                 longestOverAll = longestTillNow;
	             }
        	}
        }

        return longestOverAll;
    }

    public static void main(String[] args) {
        String input = "stackchangeseverything";
        System.out.println(subString(input));
    }
}
