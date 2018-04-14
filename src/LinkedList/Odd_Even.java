
/**
 * Segreagate odd and even nodes in LinkedList and put all the odd nodes at the end
 */

package LinkedList;

import java.util.*;

/**
 * 
 * @author kunal
 *
 */

public class Odd_Even extends LinkedList {

	public void odd_even() {

		Node lnode = head; // lnode - the last node
		while (lnode.link != null) // move lnode to the last node
			lnode = lnode.link;

		Node tlnode = lnode; // temporary lnode

		Node curr = head;
		Node prev = null;
		while (true) {

			if (curr.data % 2 != 0) // if odd node
			{
				lnode.link = curr; // append the node to the last
				if (prev != null) // if even node has been traversed
					prev.link = curr.link;
				else
					head = curr.link; // set the next node as head
				lnode = curr;

			} else {
				prev = curr; // set prev to current node

			}
			if (curr == tlnode) // if current node is the last node of original list
				break;
			else
				curr = curr.link;
		}
		lnode.link = null;

	}

	static Scanner sc = new Scanner(System.in);
	static Odd_Even list = new Odd_Even();
	static int n;

	public static void main(String args[]) {

		System.out.println("Enter no.of nodes");
		n = sc.nextInt();
		System.out.println("Enter elements");

		for (int i = 0; i < n; i++)
			list.push(sc.nextInt());

		list.odd_even();

		list.display();

	}

}
