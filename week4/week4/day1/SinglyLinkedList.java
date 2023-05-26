package week4.day1;

public class SinglyLinkedList {

	  public static void main(String[] args) {
	   LinkedList ll = new LinkedList();
	   ll.add("5");
	   System.out.println(ll);
	  }
	}

	
class LinkedList{
	
	// A node consisit of data and reference to next node
	class Node{		
		String data=null;
		Node next=null;
	}
	//A linked consist of start and its size
	Node start = null;
	int size=0;
	
	
	void add(String data) {
		Node node= new Node();
		
		node.data=data;
		// We need to handle two conditons
		// If start is null which means no data in linked list add the node as start
		if(start==null) {
			start=node;
		}
		// else make the current mode as start
		else {
			Node current=start;
			
			while(current.next !=null) {
				current =current.next;
			}
			current.next=node;
		}
		size++;
	}
	 void insert(int index, String data) {
		 
		 //To handle index size greater than size or index <1
		 if(index>size+1 || index<1) {
			 throw new IndexOutOfBoundsException("Index : "+ index+" size: "+ size);
		 }
		 
		 Node node= new Node();
		 node.data=data;
		 //If the index is 1
		 if(index==1) {
			 node.next=start;
			 start=node;
			 size++;
			 return;
		 }
		 
		 int count=1;
		 Node current=start;
		 while(count<index-1) {
			 current =current.next;
			 count++;
		 }
		 node.next=current.next;
		 current.next=node;
		 size++;
		 
	 }
	
	 void removeElement(String number) {
		 //remove the element if it present in start positions. There 
		 while(start!=null && start.data.equals(number)) {
			 start=start.next;
			 size--;
		 }
		 
		 if(start == null || start.next == null) {
		      return;
		    }
		 
	 }
	@Override
	public String toString() {
		
		StringBuffer sb=new StringBuffer();
		sb.append("[");
		Node current=start;
		while(current!=null) {
			sb.append(current.data+", ");
			current=current.next;
		}
		sb.append("]");
		return sb.toString();
		
		
	}
	
}