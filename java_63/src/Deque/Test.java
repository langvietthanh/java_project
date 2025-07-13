package Deque;

import java.util.Deque;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

/*
 * method
 add(First/Last), offer(First/Last)
 remove(First/Last), poll(First/Last)
 get(First/Last), peek(First/Last)
 isEmpty
 size
 clear
 iterator 
 descendingIterator
 */


public class Test {
	public static void main(String[] args) {
		Deque<String> dq = new LinkedList<String>();
		Scanner inp = new Scanner(System.in);
		String name;
		do {
			name="";
			name=inp.nextLine();
			dq.add(name);
			
		}while(name.compareTo("") != 0);

		Iterator<String> it = dq.iterator();
        while (it.hasNext()) {
            String element = it.next();
            System.out.println("Phần tử: " + element);
        }
		while(dq.isEmpty() == false) {
			String top,back;
			top = dq.getFirst();
			back = dq.peekLast(); // == dq.peek()
			System.out.println("top: "+ top+" back: " + back);
			dq.pollFirst();
			dq.pollLast();
		}
	}
}
