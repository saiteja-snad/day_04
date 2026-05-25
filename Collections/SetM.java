package collections;

import java.util.HashSet;
import java.util.Scanner;

public class SetM {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		String t="Snad sAi snad java sai";
		String k=t.toLowerCase();
		//String n=sc.nextLine();
		String[] words=k.split(" ");
		HashSet<String>s=new HashSet<>();
		
		for(String n:words) {
			s.add(n);
		}
		System.out.println(s);
		System.out.println(s.size());
		sc.close();
	}

}
