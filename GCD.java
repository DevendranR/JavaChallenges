package test;

import java.util.ArrayList;
import java.util.List;

public class GCD {
public static void main(String[] args) {
	int[] array = {84,91,126};
	int smallestValue = array[0];
	for (int i=0;i<array.length-1;i++) {
		if(array[i]>array[i+1]){
			smallestValue=array[i+1];
		}
	}
	List<Integer> arrayList = new ArrayList<>();
	int hcfValue = 1;	
	for(int i=2;i<smallestValue;i++){
		int count =0;
		for (int arrayValue : array) {
			if(arrayValue%i==0){
				count++;
				arrayList.add(arrayValue/i);
			}else{
				arrayList.add(arrayValue);
			}
		}
		for (int k = 0 ;k<arrayList.size();k++) {
			array[k] = arrayList.get(k);
			arrayList = new ArrayList<Integer>();
		}
		if(count==3){
			hcfValue = hcfValue*i;
		}
		
	}
	
	System.out.println(hcfValue);
}
}
