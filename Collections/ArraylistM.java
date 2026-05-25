package collections;
import java.util.*;
public class ArraylistM {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	ArrayList<String> l=new ArrayList<>();
	l.add("sai");
	l.add(1,"java");
	//System.out.println(l.get(0));
	l.set(1, "ram");
	l.remove(0);
	l.clear();
	System.out.println(l.isEmpty());
	//System.out.println(l.contains("sai"));
	System.out.println(l);
	sc.close();
}
}
