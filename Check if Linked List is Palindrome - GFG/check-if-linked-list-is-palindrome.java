//{ Driver Code Starts
import java.util.*;

class Node
{
	int data;
	Node next;
	
	Node(int d)
	{
		data = d;
		next = null;
	}
}

class Is_LinkedList_Palindrom
{
	 Node head;  
	 Node tail;
	
	/* Function to print linked list */
    void printList(Node head)
    {
        Node temp = head;
        while (temp != null)
        {
           System.out.print(temp.data+" ");
           temp = temp.next;
        }  
        System.out.println();
    }
	
 
    /* Inserts a new Node at front of the list. */
    public void addToTheLast(Node node) 
	{

		if (head == null) 
		{
			head = node;
			tail = node;
		} else 
		{
		    tail.next = node;
		    tail = node;
		}
    }
	
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		 
		while(t>0)
        {
			int n = sc.nextInt();
			//int k = sc.nextInt();
			Is_LinkedList_Palindrom llist = new Is_LinkedList_Palindrom();
			//int n=Integer.parseInt(br.readLine());
			int a1=sc.nextInt();
			Node head= new Node(a1);
            Node tail = head;
            for (int i = 1; i < n; i++) 
			{
				int a = sc.nextInt(); 
			    tail.next = new Node(a);
			    tail = tail.next;
			}
			
			Solution g = new Solution();
			if(g.isPalindrome(head) == true)
			    System.out.println(1);
		    else
			    System.out.println(0);
			t--;
		}
		
	}
}




// } Driver Code Ends


/* Structure of class Node is
class Node
{
	int data;
	Node next;
	
	Node(int d)
	{
		data = d;
		next = null;
	}
}*/

class Solution
{
    //Function to check whether the list is palindrome.
    boolean isPalindrome(Node head) 
    {
       /*if(head==null&& head.next==null) return true;
       
       Node midNode=findmid(head);
       
       // reverse 2nd half
       
       Node prev=null;
       Node curr=midNode;
       Node next;
       while(curr!=null){
           next=curr.next;
           curr.next=prev;
           prev=curr;
           curr=next;
       }
       Node right=prev;
       Node left=head;
       
       while(right!=null){
           if(left.data!=right.data){
               return false;
           }
           left=left.next;
           right=right.next;
       }
       return true;
       
    }  
    public Node findmid(Node head){
        Node slow=head;
        Node fast=head;
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        return slow;
        */ 
      Node fast=head , slow=head;
      while(fast != null && fast.next!=null){
         fast=fast.next.next;
         slow=slow.next;
      }
      //if(fast!=null) slow=slow.next;
      
      slow=reverse(slow);
      fast=head;
      while(slow!=null){
        if(fast.data!=slow.data) 
          return false;
        fast=fast.next;
        slow=slow.next;
      }
      return true;
    }
        
    public Node reverse(Node head){
    Node prev=null;
    while(head!=null){
      Node temp=head.next;
      head.next =prev;
      prev=head;
      head=temp;
    }
    return prev;
  }
}

