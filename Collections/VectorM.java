package collections;
import java.util.*;
public class VectorM {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	Vector<Integer> v=new Vector<>();
	v.add(sc.nextInt());
	v.add(sc.nextInt());
	v.add(sc.nextInt());
	v.add(sc.nextInt());
	v.add(sc.nextInt());
	System.out.println(v.firstElement());
	System.out.println(v.lastElement());
	//System.out.println(v.elementAt(3));
	//System.out.println(v);
	sc.close();
}
}
