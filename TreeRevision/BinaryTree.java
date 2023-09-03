package TreeRevision;
import java.util.*;

public class BinaryTree {
	
	Scanner sc = new Scanner(System.in);
	public class Node{
		int data ;
		Node left ;
		Node right;
		
	}
	private Node root;
	public BinaryTree() {
		// TODO Auto-generated constructor stub
		this.root = CreateTree();
	}
	private Node CreateTree() {
		// TODO Auto-generated method stub
		int item = sc.nextInt();
		Node nn = new Node();
		nn.data = item;
		boolean hlc = sc.nextBoolean();
		if(!hlc) {
			nn.left= CreateTree();
		}
		boolean hrc = sc.nextBoolean();
		if(!hrc) {
			nn.right = CreateTree();
		}
		return nn;
	}
	private void Display() {
		Display(this.root);
	}
	
	public void Display(Node nn) {
		String str = "";
		str= str+nn.data;
		str= "<--"+str+"-->";
		if(nn.left!=null) {
			str = nn.left.data+str;
		}else {
			str = "."+str;
		}
		if(nn.right!=null) {
			str =str+nn.right.data;
		}else {
			str = str+".";
		}
		System.out.println(str);
		Display(nn.left);
		Display(nn.right);  
	}
	public int max () {
		return max(this.root);
	}
	
	private int max(Node node) {
		if(node == null) {
			return Integer.MIN_VALUE;
		}
		int lmax =max(node.left);
		int rmax =max(node.right);
		return Math.max(node.data, Math.max(rmax,lmax));
	}
	
	public boolean find(Node node,int item) {
		if(node == null) {
			return false;
		}
		if(node.data == item) {
			return true;
		}
		boolean hlf = find(node.left,item);
		boolean rlf = find(node.right,item);
		return hlf||rlf;
	}
	public int Height() {
		return Height(this.root);
	}
	private int Height(Node node) {
		// TODO Auto-generated method stub
		if(node== null) {
			return -1;
		}
		int lh = Height(node.left);
		int rh = Height(node.right);
		return Math.max(lh,rh)+1;
		
	}
	public static void main(String[] args) {
		BinaryTree bt = new BinaryTree();
		bt.Display();
	}
	
}
  