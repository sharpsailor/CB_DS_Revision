package Tree;

import java.util.*;

import Tree.Traversal.Node;

public class LevelOrderBuildTree {
	Scanner sc= new Scanner(System.in);
	public class Node {
		int data ;
		Node left ;
		Node right;
	}
	
	private Node root;
	public LevelOrderBuildTree() {
		// TODO Auto-generated constructor stub
		CreateTree();
	}
	private void CreateTree() {
		// TODO Auto-generated method stub
		Queue<Node> que = new LinkedList<>();
		int item = sc.nextInt();
		Node nn = new Node();
		nn.data = item;
		this.root = nn;
		que.add(nn);
		while(!que.isEmpty()) {
			Node rv = que.remove();
			int c1 = sc.nextInt();
			int c2 = sc.nextInt();
			if(c1!=-1) {
				Node n = new Node();
				n.data = c1;
				rv.left= n;
				que.add(n);
			}
			if(c2!=-1) {
				Node n = new Node();
				n.data = c2;
				rv.right= n;
				que.add(n);
			}
		}
	}
	public void preOrder() { // Root -> Left-> right
		preOrder(this.root);
	}
	private void preOrder(Node root) {
		// TODO Auto-generated method stub
		if(root==null) {
			return;
		}
		System.out.print(root.data+" ");
		preOrder(root.left);
		preOrder(root.right);
	}
//	1 2 3 4 5 -1 6 -1 -1 -1 -1 -1 -1
	public static void main(String[] args) {
		LevelOrderBuildTree lt = new LevelOrderBuildTree();
		lt.preOrder();
	}
}
