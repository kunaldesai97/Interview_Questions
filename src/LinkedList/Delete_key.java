
/**
 * Delete all the occurrences of a particular element
 */

package LinkedList;

import java.util.*;

/**
 * 
 * @author kunal
 *
 */

public class Delete_key extends LinkedList {

	public void delete(int a) {
		Node curr = head;
		Node prev = null;

		while (curr != null) {
			if (curr.data == a) // if element is found
			{
				if (prev == null) // if there's no previous node
					head = head.link;
				else
					prev.link = curr.link;
			} else
				prev = curr;

			curr = curr.link;

		}
	}

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter no.of nodes");
		int n = sc.nextInt();

		Delete_key list = new Delete_key();

		System.out.println("Enter the elements");

		for (int i = 0; i < n; i++)
			list.push(sc.nextInt());

		System.out.println("Enter key to be deleted");
		int a = sc.nextInt();

		list.delete(a);
		list.display();
	}

}
