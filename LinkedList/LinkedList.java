package LinkedList;

public class LinkedList {
	public class Node {
		int data;
		Node next;

		public Node(int data) {
			// TODO Auto-generated constructor stub
			this.data = data;

		}
	}

	private Node head;
	private int size;
	private Node tail;

	public void addFirst(int item) {
		Node nn = new Node(item);
		if (this.size == 0) {
			this.head = nn;
			this.tail = nn;
			this.size++;
		}else {
			nn.next = this.head;
			this.head= nn;
			this.size++;
		}
	}
	public void addLast(int item) {
		Node nn = new Node(item);
		if(this.size==0) {
			this.head=nn;
			this.tail=nn;
			this.size++;
		}
		else {
			this.tail.next=nn;
			this.tail= nn;
			this.size++;
		}
	}
	public void addAtIndex(int item ,int k) throws Exception {
		if(k<0||k>size) {
			throw new Exception("Index Out Of Bound");
		}
		if(k==0) {
			addFirst(item);
		}else if(k==size) {
			addLast(item);
		}else {
			Node nn = new Node(item);
			 Node K_1th= getNode(k-1);
			 nn.next  = K_1th.next;
			 K_1th.next= nn;
			 this.size++;
		}
	}
	public int getFirst() throws Exception {
		if(head==null) {
			throw new Exception("pgl LinkedList is Empty");
		}
		return this.head.data;
	}
	public int getlast() throws Exception {
		if(this.head==null) {
			throw new Exception("pgl LinkedList is Empty");
		}
		return this.tail.data;
	}
	public int getAtIndex(int k) throws Exception {
		return getNode(k).data;
	}
	private Node getNode(int k) throws Exception {
		if(k<0||k>=size) {
			throw new Exception("Index Out Of Bound");
		}
		Node temp = head;
		for(int i =1;i<=k;i++) {
			temp=temp.next;
		}
		return temp;
	}
	public int removeAtIndex(int k) throws Exception {
		if(k<0||k>=size) {
			throw new Exception("Index Out Of Bound");
		}
		if(k==0) {
			return removeFirst();
		}else if(k==size-1) {
			return removeLast();
		}else {
			Node Kth = getNode(k);
			Node K_1th= getNode(k-1);
			 K_1th.next=Kth.next;
			Kth.next=null;
			this.size--;	
			return Kth.data;
		}		
	}
	public int removeFirst() throws Exception {
		if(this.head==null) {
			throw new Exception("LinkedList is Empty");
		}
		Node temp = this.head;
		this.head= head.next;
		temp.next= null;
		this.size--;
		return temp.data;
	}
	public int removeLast() throws Exception{
		if(this.head==null) {
			throw new Exception("LinkedList is Empty");
		}
		if(this.size==1) {
			return removeFirst();
		}
		Node temp = getNode(this.size-2);
		int rv = tail.data;
		this.tail= temp;
		this.tail.next = null;
		return rv;
	} 
	public void Display() {
		Node temp = this.head;
		while(temp!=null) {
			System.out.print(temp.data+"-->");
			temp= temp.next;
		}
		System.out.println(".");
	}
	public static void main(String[] args) {
		LinkedList ll = new LinkedList();
		ll.addFirst(1);
		ll.addFirst(2);
		ll.addFirst(3);
		ll.Display();
	}
}
