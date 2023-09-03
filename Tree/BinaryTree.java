package Tree;

import java.util.Scanner;

public class BinaryTree {
	Scanner sc = new Scanner(System.in);
	public class Node {
		int data;
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
		nn.data = item ;
		boolean hlc = sc.nextBoolean();
		if(hlc) {
			nn.left = CreateTree();
		} 
		boolean hlr= sc.nextBoolean();
		if(hlr) {
			nn.right = CreateTree();
		}
		return nn;
	}
	public void Display() {
		Display(this.root);
	}
	private void Display(Node nn ) {
		if(nn == null) {
			return ;
		}
		String str = "";
		str="<--"+str+"-->";
		if(nn.left!=null) {
			str = nn.left.data+str;
		}else {
			str= "."+str;
		}
		if(nn.right!=null) {
			str =str+nn.right.data;
		}else {
			str=str+".";
		}
		System.out.println(str);
		Display(nn.left);
		Display(nn.right);
	}
	public int max() {
		return max(this.root);
	}
	private int max(Node node) {
		// TODO Auto-generated method stub
		if(node==null) {
			return Integer.MIN_VALUE;
		}
		int lmax = max(node.left);
		int rmax = max(node.right);
		return Math.max(lmax,Math.max(node.data, rmax));
	}
	public boolean find(int item) {
		return find(this.root,item);
	}
	private boolean find(Node nn, int item) {
		// TODO Auto-generated method stub
		if(nn==null) {
			return false;
		}
		if(nn.data== item) {
			return true;
		}
		boolean lfind = find(nn.left,item);
		boolean rfind = find(nn.right,item);
		return lfind|| rfind;
	}
	public int height() {
		return height(this.root);
	}
	
	private int height(Node root) {
		// TODO Auto-generated method stub
		if(root==null) {
			return 0; // 0-> single node ht = 1 aur agr -1 toh single node ki ht 0
		}
		int lheight = height(root.left);
		int rheight = height(root.right);
		return Math.max(lheight, rheight)+1;
	}
}
