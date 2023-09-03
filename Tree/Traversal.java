package Tree;
import java.util.*;
import Tree.BinaryTree.Node;

public class Traversal {
	Scanner sc = new Scanner(System.in);
	public class Node {
		int data;
		Node left ;
		Node right;
	}
	private Node root;
	public Traversal() {
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
	
	public void preOrder() { // Root -> Left-> right
		preOrder(this.root);
	}
	private void preOrder(Node root) {
		// TODO Auto-generated method stub
		if(root==null) {
			return;
		}
		System.out.println(root.data+" ");
		preOrder(root.left);
		preOrder(root.right);
	}
	public void inorder() {
		inorder(this.root);//left->root->right
	}
	private void inorder(Node node) {
		if(node==null) {
			return;
		}
		inorder(node.left);
		System.out.println(node.data);
		inorder(node.right);
	}
	public void postorder() {
		postorder(this.root); // left->right->root
	}
	private void postorder(Node node) {
		// TODO Auto-generated method stub
		if(node==null) {
			return;
		}
		postorder(node.left);
		postorder(node.right);
		System.out.println(node.data+" ");
		
	}
	public void levelOrder() {
		levelOrder(this.root);
	}
	private void levelOrder(Node root) {
		// TODO Auto-generated method stub // root -> remove -> print -> left child add -> right child add
		LinkedList<Node> que = new LinkedList<>();
		que.add(this.root);
		while(!que.isEmpty()) {
			Node rv = que.remove();
			System.out.println(rv.data+" ");
			if(rv.left!=null) {
				que.add(rv.left);
			}
			if(rv.right!=null) {
				que.add(rv.right);
			}
		}
		System.out.println();
	}
}
