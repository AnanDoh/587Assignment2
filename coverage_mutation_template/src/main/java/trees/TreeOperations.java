package trees;
import java.util.Queue; 
import java.util.LinkedList; 
import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class TreeOperations {

    public static ArrayList<Node> bfs(final Node root)
    {
    	Queue<Node> nodeQueue = new LinkedList<> (); 
    	ArrayList<Node> nodes = new ArrayList<> ();

    	if (root == null)
    		return nodes;

    	if (root.left != null)
    	{
    		nodeQueue.add(root.left);
    	}

    	if (root.right != null)
    	{
    		nodeQueue.add(root.right);
    	}

    	while (!nodeQueue.isEmpty())
    	{
    		Node newNode = nodeQueue.remove();
    		nodes.add(newNode);

    		/*
    		if (newNode.contents == target.contents)
    			return true;
    		*/

	    	if (newNode.left != null)
	    	{
	    		nodeQueue.add(newNode.left);
	    	}

	    	if (newNode.right != null)
	    	{
	    		nodeQueue.add(newNode.right);
	    	}
    	};

    	return nodes;
    }

    public static ArrayList<Node> preorderTravseral(final Node root)
    {
		ArrayList<Node> nodes = new ArrayList<> ();
		Stack<Node> nodeStack = new Stack<> ();
		nodeStack.push(root);
		dfs(nodes, nodeStack);
		return nodes;
    }

    public static void dfs(ArrayList<Node> nodes, Stack<Node> nodeStack)
    {
    	Node currentNode = nodeStack.pop();
    	nodes.add(currentNode);

    	if (currentNode.left != null)
    	{
    		nodeStack.push(currentNode.left);
    		dfs(nodes, nodeStack);
    	}

    	if (currentNode.right != null)
    	{
    		nodeStack.push(currentNode.right);
    		dfs(nodes, nodeStack);
    	}

    }

}
