package test;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BalloonsShootOrder {
public static void main(String[] args) {
	Scanner in = new Scanner(System.in);
	int finalValue = 0;
	int arrSize = 0;
    arrSize = Integer.parseInt(in.nextLine().trim());
    int[] arr = new int[arrSize];
    List<Integer> list = new ArrayList<>();
    int arrItem;
    String[] strArr = in.nextLine().trim().split(" ");
    for(int i = 0; i < arrSize; i++) {
        arrItem = Integer.parseInt(strArr[i]);
        arr[i] = arrItem;
        list.add(i, arrItem);
    }

    while(list.size()>2){
    	finalValue = finalValue+(list.get(list.size()-1)*list.get(list.size()-3));
    	list.remove(list.size()-2);
    }
    finalValue = finalValue+list.get(list.size()-1);
    
    finalValue = finalValue+list.get(0);
    
    System.out.println(finalValue);
}
}
