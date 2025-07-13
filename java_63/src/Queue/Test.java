package Queue;

import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Test {
	public static void main(String[] args) {
		/*
		 * method
		 add, offer
		 remove, poll
		 element, peek
		 clear
		 size
		 isEmpty
		 contains
		 */
		Scanner inp = new Scanner(System.in);
		Queue<String> q = new LinkedList<String>();
		String name;
		do {
			name="";
			name=inp.nextLine();
			q.add(name);
			
		}while(name.compareTo("")!=0);
		if (q.peek() != null)System.out.println(q.peek());
		else System.out.println("NULL");
	}
}
