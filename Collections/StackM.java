package collections;
import java.util.*;
public class StackM {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Stack<Integer>s=new Stack<>();
		s.push(2);
		s.push(3);
		System.out.println(s.pop());
		//System.out.println(s.pop());
		//System.out.println(s.peek());
		System.out.println(s.empty());
		System.out.println(s.search(2));
		sc.close();
	}

}
