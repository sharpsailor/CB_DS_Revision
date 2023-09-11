package OOPs;

public class Generics_LinkedList<T> {
	public class Node{
		T data ;
		Node next ;
		public Node(T data) {
			this.data = data;
		}
	}
	private Node head;
	private int size;
	private Node tail;
	public void addFirst(T item) {
		Node nn = new Node(item);
		if(this.size == 0) {
			this.head = nn;
			this.tail = nn;
			this.size++;
		}
		else {
			nn.next = this.head;
			this.head = nn;
			this.size++;			
		}
	}
	public void addLast(T item) {
		if(this.size==0) {
			addFirst(item);
		}else {
			Node nn = new Node(item);
			this.tail.next = nn;
			nn= this.tail;
			this.size++;
		}
	}
	public void addAtIndex(T item , int k ) throws Exception{
		if(k<0|| k>size) {
			throw new Exception("Index out of Bound");
		}
		if(k==0) {
			addFirst(item);
		}else if(k==size) {
			addLast(item);
		}else {
			Node nn =  new Node(item);
			Node K_1th = GetNode(k-1);
			nn.next = K_1th.next;
			K_1th.next = nn;
			this.size++;
			
		}
	}
	public T getFirst() throws Exception{
		if(this.head==null) {
			throw new Exception("Baklol Linkedlist Khali hai");
		}
		return this.head.data;
	}
	public T getLast() throws Exception{
		if(this.head==null) {
			throw new Exception ("Baklol Linkedlist khali hai");
		}
		return this.tail.data;
	}
	public Node GetNode(int k) throws Exception{
		if(k<0||k>size) {
			throw new Exception("Baklool LinkedList Kahli hai No Node possbile ");
		}
		Node temp = head;
		for(int i =1;i<=k;i++) {
			temp = temp.next ;
		}
		return temp;
		
	}
	public T removeFirst() throws Exception{
		if(this.head==null) {
			throw new Exception("Baklol Linked List Khali hai");
		}
		Node temp = null;
		temp.next = head.next;
		head.next = null;
		this.size--;
		return temp.next.data;
	}
	public T removeLast() throws Exception{
		if(this.head == null) {
			throw new Exception(" Bakolo LinkedList Khali hai");
		}
		if(this.size == 1) {
			return removeFirst();
		}
		Node temp = GetNode(this.size-2);
		T rv = tail.data;
		this.tail = temp;
		this.tail.next = null;
		this.size--;
		return rv;
	}
	public T removeAtIndex(int k) throws Exception {
		if(k<0||k>size) {
			throw new Exception("Baklol Outof Bound Error");
		}
		if(k==0) {
			return removeFirst();
		}
		else if(k==size) {
			return removeLast();
		}else {
			Node K_1th = GetNode(k-1);
			Node kth = GetNode(k);
			K_1th.next = kth.next;
			kth.next = null;
			this.size --;
			return kth.data;
		}
	}
}
