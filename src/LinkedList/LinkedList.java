package LinkedList;



public class LinkedList {
	
	Node head;
	Node tnode;
	
	class Node{
		Node link;
		int data;
		Node(int data)
		{
			this.data = data;
			this.link = null;
		}
	}
	
	public void push(int data)
	{
		Node new_node = new Node(data);
		if(head==null) //If yes, make the new node as head
		{
			head = new_node;
			head.link = null;
			tnode = head;
		}
		else //else, add the new node tp the end
		{
			tnode.link = new_node;
			tnode = new_node;
			tnode.link = null;
		}
		
	}
	
	public void display()
	{
		Node tnode = head;
		
		while(tnode!=null)
		{
			System.out.print(tnode.data+"-->");
			tnode = tnode.link;
		}
		
		System.out.println("NULL");
	}
	
	
}