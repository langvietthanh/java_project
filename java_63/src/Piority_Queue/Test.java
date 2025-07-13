package Piority_Queue;

import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Scanner;


/*
 * method same queue

 */

public class Test {
	public static void main(String[] args) {
		PriorityQueue<Integer> pq = new PriorityQueue<>((Collections.reverseOrder()));
		Scanner inp = new Scanner(System.in);
		int n = inp.nextInt();
		while (n>0) {
			int num = inp.nextInt();
			pq.offer(num);
			n--;
		}
		while(!pq.isEmpty()) {
			System.out.println(pq.poll());
		}
	}
}
