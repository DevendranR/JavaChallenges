package test;

import java.util.HashSet;
import java.util.Set;

public class DuplicateElement {
	public static void main(String[] args) {
		int[] numbers = {1,3,3,2,3,2,5,1,6};
		
		Set<Integer> set = new HashSet<>();
		
		for (int i = 0; i < numbers.length; i++) {
			for (int j = 0; j < numbers.length-1; j++) {
				if(numbers[i]==numbers[j]&&i!=j){
					set.add(numbers[i]);
				}
			}
		}
		System.out.println(set.size());
	}
}
