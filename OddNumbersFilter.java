package test;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class OddNumbersFilter {
public static void main(String[] args) {
	try{
	Scanner in = new Scanner(System.in);
    final String fileName = System.getenv("OUTPUT_PATH");
    BufferedWriter bw = new BufferedWriter(new FileWriter(fileName));
    int[] res;
    int _l;
    _l = Integer.parseInt(in.nextLine().trim());
    
    int _r;
    _r = Integer.parseInt(in.nextLine().trim());
    
    res = oddNumbers(_l, _r);
    for(int res_i=0; res_i < res.length; res_i++) {
        bw.write(String.valueOf(res[res_i]));
        bw.newLine();
    }
    
    bw.close();
	}
	catch(Exception e){
		
	}
}

static int[] oddNumbers(int l, int r) {
	
	
	List<Integer> list = new ArrayList<>();
	for(int i =l;i<=r;i++){
		if(i%2!=0){
			list.add(i);
		}
	}
	int[] arr = new int[list.size()];
	for (int i=0;i<list.size() ; i++) {
		arr[i] = list.get(i);
	}
	return arr;
}
}
