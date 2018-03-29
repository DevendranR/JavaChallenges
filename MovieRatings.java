package test;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class MovieRatings {
public static void main(String[] args) {
	int[] ratings = {9,-1,-3,4,5};
	int maxRating = 0;
	List<Integer> list = new ArrayList<>();
	int neg = 0;
	for (int i=0 ;i<ratings.length; i++) {
				
			if(ratings[i]<0){
				list.add(ratings[i]);
			}else{
				maxRating = maxRating+ratings[i];
			}
	}
	int val = 0;
	val = Collections.max(list);
	int odd=0;
	int even = 0;
	for (int i=0;i<list.size();i++) {
		if(i%2==0){
			odd = odd+list.get(i);
		}else{
			even = even+list.get(i);
		}
	}
	if(odd>even){
		maxRating = maxRating+odd;
	}else{
		maxRating = maxRating+even;
	}
	System.out.println(maxRating);
}

static int maximizeRatings(int[] ratings) {
	int maxRating = 0;
	int[] list = new int[ratings.length];
	int neg = 0;
	for (int i=0 ;i<ratings.length; i++) {
				
			if(i<0){
				list[i] = ratings[i];
			}else{
				maxRating = maxRating+ratings[i];
			}
	}
	for (int i=0;i<list.length-1;i++) {
		for (int j=0;j<list.length-1;j++) {
		if(list[j]>list[j+1]){
			int temp = list[j+1];
			list[j+1] = list[j];
			list[j] = temp;
		}
		}
	}
	
	
	
	return maxRating-list[0];
}
}
