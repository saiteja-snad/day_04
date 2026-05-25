package collections;
import java.util.*;
public class LinkedlistM {
	public static void main(String[] args) {	
Scanner sc=new Scanner(System.in);
LinkedList<String> l=new LinkedList<>();
l.add("A");
l.addFirst("ram");
l.remove("A");
l.removeLast();
System.out.println(l);
sc.close();
}
}