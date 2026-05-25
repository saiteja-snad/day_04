package collections;
import java.util.*;
public class Pro2 {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	ArrayList<String> l=new ArrayList<>();
	int n=sc.nextInt();
	sc.nextLine();
	for(int i=1;i<=n;i++) {
		l.add(sc.nextLine());
	}
//	l.set(4, "sam");
//	Collections.reverse(l);
	System.out.println(Collections.frequency(l, "sai"));
//	l.remove(3);
//	l.remove("sai");
//	System.out.println(l.size());
//	System.out.println(l);
//	System.out.print(l.contains("sam"));
	sc.close();
}
}
