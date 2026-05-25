package collections;
import java.util.*;
public class Map1 {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	LinkedHashMap<String,Integer> m =new LinkedHashMap<>();
//	m.put(1, "java");
//	m.put(2, "rava");
//	m.put(3, "sai");
//	m.put(4, "rava");
//	m.put(5, "pova");
//	m.put(6, "gova");
//	m.put(7, "java");

	String s="java rava pova java lava rava";
	 
	String[] w=s.split(" ");
	for(String k:w) {
		m.put(k,m.getOrDefault(k, 0)+1);
	}
	
	
	System.out.println(m);
	sc.close(); 
	
}
}
