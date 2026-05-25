package collections;
import java.util.*;
public class Iterator1 {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	ArrayList<String>a=new ArrayList<>();
	int n=sc.nextInt();
	for(int i=0;i<n;i++) {
		a.add(sc.next());
	}
	Iterator<String> it=a.iterator();
	for(String k : a) {

        System.out.print(k+" ");
    }
	while(it.hasNext()) {
		//System.out.println(it.next());
		String s = it.next();

        if(s.equals("sai")) {

            it.remove();
        }
        

	}
	
	System.out.println(a);
	/*
	ListIterator<String> it=a.listIterator(a.size());
	while(it.hasPrevious()) {
		System.out.println(it.previous());
	}*/
	sc.close();
}
}
