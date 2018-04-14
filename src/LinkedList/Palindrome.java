
/**
 * Check if the LinkedList is a palindrome or not
 */

package LinkedList;
import java.util.*;

/**
 * 
 * @author kunal
 *
 */
public class Palindrome extends LinkedList{

	
	static int n;
	static Palindrome list = new Palindrome();
	static Scanner sc = new Scanner(System.in);
	Node midnode, secondhalf;  
	
	// midnode - the middle node if list has odd no.of elements
	// secondhalf = the starting node of second half of list
	
	public boolean isPalindrome()
	{
		Node fast = head; // used to traverse list two nodes at a time
		Node slow = head; // used to traverse list one node at a time
		
		
		while(fast!=null && fast.link!=null)
		 {
			 fast = fast.link.link;
			 slow = slow.link;
			 
		 }
		//Even no.of elements- fast = null & slow points to starting element of secondhalf of list
		//Odd no.of elements - fast != null & slow points to the middle element
		 
		 if(fast!=null) //if list contains odd no.of elements
		 {
			 midnode = slow;
			 secondhalf = slow.link;
		 }
		 
		 else
			 secondhalf = slow;
			
		 
		
		
		Node prev = null;
		Node current = list.head;
		Node next = list.head.link;
		
		reverse(prev,current,next); //to reverse the first half of linked list
		
		//Check if the first half(reversed) and second half of list are same
		
		Node tnode1 = head;
		Node tnode2 = secondhalf;
		
		while(tnode1!=null)
		{
			if(tnode1.data!= tnode2.data)
				return false;
			tnode1 = tnode1.link;
			tnode2 = tnode2.link;
		}
		
		return true;
		
	
	}
	
	public void reverse(Node prev, Node current, Node next)
	{
		//reverse the first half of list
		if(next!=secondhalf && next!=midnode)
		{
			next = current.link;
			current.link = prev;
			prev = current;
			current = next;
			reverse(prev,current,next);
			
		}
		else
		{
			head = prev;
			
		}
	}
	
	public static void main(String args[])
	{
		
		System.out.println("Enter no.of nodes");
		n = sc.nextInt();
		System.out.println("Enter the elements");
		for(int i=0;i<n;i++) 
			list.push(sc.nextInt());
		 
		list.display();
		 
		boolean res = list.isPalindrome();
		
		if(res)
			System.out.println("LinkedList is a Palindrome");
		
		else
			System.out.println("LinkedList is not a Palindrome");
		 
		
		
	}

}
