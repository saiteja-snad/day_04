package collections;
import java.util.*;

public class Map2 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		LinkedHashMap<String,Integer>m=new LinkedHashMap<>();
		for(int i=0;i<n;i++) {
			m.put(sc.next(), sc.nextInt());
		}
		System.out.println(m);
		System.out.println(m.get(sc.next()));
		sc.close();
	}

}
