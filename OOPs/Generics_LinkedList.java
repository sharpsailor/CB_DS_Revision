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
	public int getFirst() throws E 
}
