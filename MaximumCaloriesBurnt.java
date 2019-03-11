import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class MaximumCaloriesBurnt {
	public static void main(String args[] ){
    	Scanner sc = new Scanner(System.in);
	    Integer testCaseCount = sc.nextInt();
		if(testCaseCount >= 1 && testCaseCount <=1000){ 
	    	for (int n = 0; n < testCaseCount; n++) {
		    	Integer noOfDays = sc.nextInt();
		    	List<Integer> kmsList = new ArrayList<>();
			    if(noOfDays >= 1 && noOfDays <= 100000){
		    		for (int i=0;i<noOfDays;i++) {
			    		kmsList.add(sc.nextInt());
					}	
			    	Collections.sort(kmsList,Collections.reverseOrder());
			    	int previousDayKms = 0;
			    	int maxCal = 0;
			    	for (Integer todaysKm : kmsList) {
			    		if(todaysKm >= 1 && todaysKm <= 100000){
							Integer todaysCal = 2*previousDayKms+todaysKm;
							maxCal = maxCal + todaysCal;
							previousDayKms = previousDayKms + todaysKm;
			    		}
					}
			    	System.out.println(maxCal);
			    }
		    }	   
		}
	    sc.close();
    }
}
