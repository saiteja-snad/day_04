package collections;
import java.util.*;
public class Pro1 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		ArrayList<Integer> a=new ArrayList<>();
		ArrayList<Integer>o=new ArrayList<>();
		for(int i=0;i<n;i++)
		{
			
			a.add(sc.nextInt());
			if(!(o.contains(a.get(i)))) {
				o.add(a.get(i));
			}
		}
		
		
		//HashSet<Integer>s=new HashSet<>();
		/*for(int k:a) {
			s.add(k);
		}*/
		
		
		System.out.print(o);
		sc.close();
	}

}
