package week5.day2;

class ListNode {

	int val;
	ListNode next;
	
	ListNode() {}
	
	ListNode(int val) { 
		this.val = val; }
	
	ListNode(int val, ListNode next) { 
		this.val = val; this.next = next; }

}

public class F_MergeTwoSortedList {
	

	public static void main(String[] args) {

		 ListNode n31= new ListNode(4,null);
		 ListNode n21= new ListNode(2,n31);
		 ListNode l1= new ListNode(1,n21);
		 
		 ListNode n32= new ListNode(4,null);
		 ListNode n22= new ListNode(3,n32);
		 ListNode l2= new ListNode(1,n22);
		 
		 ListNode temp=mergeTwoLists(l1,l2);
		 
		 System.out.print("[");
		 while(temp!=null) {
			 System.out.print(temp.val+", ");
			 temp=temp.next;
		 }
		 System.out.print("]");
	}
	public static ListNode mergeTwoLists(ListNode list1, ListNode list2) {
		

		ListNode output= new ListNode(0);
		ListNode temp=output;
		while(list1!=null && list2!=null) {
			if(list1.val<=list2.val) {
				output.next=list1;
				list1=list1.next;}
			else {
				output.next=list2;
				list2=list2.next;}
			output=output.next;
			}
		if(list1 == null) {
			output.next = list2;
	    }else {
	    	output.next = list1;
	    }
		return temp.next;
		}
		
		
	}


