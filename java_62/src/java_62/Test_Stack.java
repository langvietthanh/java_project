package java_62;

import java.util.Scanner;
import java.util.Stack;


public class Test_Stack {
	public static void main(String[] args) {
		Scanner inp = new Scanner(System.in);
		/*
		 * method: 
		 push
		 pop
		 peek == top
		 clear 
		 empty
		 search(x) trả về vị trí của x 
		 
		 */
		
		// dec to bin
		int num = inp.nextInt();
		Stack st = new Stack();
		while (num!=0) {
			st.push(num%2);
			num =  num/2;
		}
		while(st.empty()!=true) {	
			System.out.print(st.peek());
			st.pop();
		}
		
	}
}
