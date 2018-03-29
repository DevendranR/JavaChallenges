package test;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class HashTest {

	public static void main(String[] args) {
        Set<Employee> hset = new HashSet<Employee>();    
        Scanner s = new Scanner(System.in);
        String inputValues = s.nextLine();
        
        String[] values = inputValues.split("\\s");
        for (String v: values) {
        	hset.add(new Employee(Integer.parseInt(v)));
        }

        System.out.println(hset.size());      
        
        s.close();
	}

}
