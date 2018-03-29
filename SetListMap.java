package test;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Set;
import java.util.Stack;
import java.util.TreeMap;
import java.util.TreeSet;

public class SetListMap {
	public static void compareSetListMap(){
		  Stack<String> stack = new Stack<String>();
		  stack.add("1");
		  stack.add("4");
		  stack.add("3");
		  stack.add("2");
		  stack.add("11");
		  stack.add("14");
		  stack.add("13");
		  stack.add("12");
		  stack.add("21");
		  stack.add("24");
		  stack.add("23");
		  stack.add("22");
		  
		  System.out.println("stack"+stack);
		  
		  List<String> l = new ArrayList<>();
		  l.add("1");
		  l.add("4");
		  l.add("3");
		  l.add("2");
		  l.add("11");
		  l.add("14");
		  l.add("13");
		  l.add("12");
		  l.add("21");
		  l.add("24");
		  l.add("23");
		  l.add("22");
		  
		  System.out.println("arrayList:"+l);
		  
		  List<String> l1 = new LinkedList<>();
		  l1.add("1");
		  l1.add("4");
		  l1.add("3");
		  l1.add("2");
		  l1.add("11");
		  l1.add("14");
		  l1.add("13");
		  l1.add("12");
		  l1.add("21");
		  l1.add("24");
		  l1.add("23");
		  l1.add("22");
		  System.out.println("linkedList:"+l1);
		  
		  Set<String> s1 = new HashSet<>();
		  
		  s1.add("1");
		  s1.add("4");
		  s1.add("3");
		  s1.add("2");
		  s1.add("11");
		  s1.add("14");
		  s1.add("13");
		  s1.add("12");
		  s1.add("21");
		  s1.add("24");
		  s1.add("23");
		  s1.add("22");
		  System.out.println("hashSet:"+s1);
		  
		  Set<String> s2 = new TreeSet<>();
		  
		  s2.add("1");
		  s2.add("4");
		  s2.add("3");
		  s2.add("2");
		  s2.add("11");
		  s2.add("14");
		  s2.add("13");
		  s2.add("12");
		  s2.add("21");
		  s2.add("24");
		  s2.add("23");
		  s2.add("22");
		  System.out.println("treeSet:"+s2);
		  
		  Set<String> s3 = new LinkedHashSet<>();
		  
		  s3.add("1");
		  s3.add("4");
		  s3.add("3");
		  s3.add("2");
		  s3.add("11");
		  s3.add("14");
		  s3.add("13");
		  s3.add("12");
		  s3.add("21");
		  s3.add("24");
		  s3.add("23");
		  s3.add("22");
		  System.out.println("linkedHashSet"+s3);
		  
		  //---------------------------Map------------------------------------//
		  
		  Map<String,String> map1 = new HashMap<>();
		  
		  map1.put("1","1");
		  map1.put("4","4");
		  map1.put("3","3");
		  map1.put("2","2");
		  map1.put("11","11");
		  map1.put("14","14");
		  map1.put("13","13");
		  map1.put("12","12");
		  map1.put("21","21");
		  map1.put("24","24");
		  map1.put("23","23");
		  map1.put("22","22");
		  System.out.println("hashmap:"+map1);
		  
		  Map<String,String> map2 = new TreeMap<>();
		  
		  map2.put("1","1");
		  map2.put("4","4");
		  map2.put("3","3");
		  map2.put("2","2");
		  map2.put("11","11");
		  map2.put("14","14");
		  map2.put("13","13");
		  map2.put("12","12");
		  map2.put("21","21");
		  map2.put("24","24");
		  map2.put("23","23");
		  map2.put("22","22");
		  System.out.println("treemap:"+map2);
		  
		  Map<String,String> map3 = new LinkedHashMap<>();
		  
		  map3.put("1","1");
		  map3.put("4","4");
		  map3.put("3","3");
		  map3.put("2","2");
		  map3.put("11","11");
		  map3.put("14","14");
		  map3.put("13","13");
		  map3.put("12","12");
		  map3.put("21","21");
		  map3.put("24","24");
		  map3.put("23","23");
		  map3.put("22","22");
		  System.out.println("linkedHashMap"+map3);
		  
		  
		  
		  
	  }
}
