package DEMO;
import java.util.Stack;
public class IterativePostorder {
	static class Node{
		int data;
		Node right;
		Node left;
		Node (int data){
			this.data = data;
		}
	} 
	static void postorder(Node root) {
		if(root == null) {
			return;
		}
		Stack<Node> stack1= new Stack<>(); 
		Stack<Node> stack2 = new Stack<>();
		//start with root
		stack1.push(root);
		while(!stack1.isEmpty()) {
			//remove from stack1
			Node current =stack1.pop();
			//put into stack2
			stack2.push(current);
		}
	}

}
