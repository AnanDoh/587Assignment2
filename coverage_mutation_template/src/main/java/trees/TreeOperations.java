package trees;
import java.util.Queue; 
import java.util.LinkedList; 
import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class TreeOperations {

    public static <A> ArrayList<Node<A>> bfs(final Node<A> root)
    {
    	Queue<Node<A>> nodeQueue = new LinkedList<> (); 
    	ArrayList<Node<A>> nodes = new ArrayList<> ();

    	if (root != null)
    		nodeQueue.add(root);

    	while (!nodeQueue.isEmpty())
    	{
    		Node<A> newNode = nodeQueue.remove();
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

    public static <A> ArrayList<Node<A>> preorderTraversal(final Node<A> root)
    {
		ArrayList<Node<A>> nodes = new ArrayList<> ();
		Stack<Node<A>> nodeStack = new Stack<> ();
		if (root != null)
		{
			nodeStack.push(root);
			dfs(nodes, nodeStack);
		}
		return nodes;
    }

    public static <A> void dfs(ArrayList<Node<A>> nodes, Stack<Node<A>> nodeStack)
    {
    	Node<A> currentNode = nodeStack.pop();
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


    public static <A> int maxDepth(final Node<A> root)
    {
    	int depth = 0;
    	int unexploredNodesInLayer = 0;
    	int nodesInNextLayer = 0;

    	Queue<Node<A>> nodeQueue = new LinkedList<> (); 
    	ArrayList<Node<A>> nodes = new ArrayList<> ();

    	if (root != null)
    	{
    		nodeQueue.add(root);
    		unexploredNodesInLayer++;
    	}

    	while (!nodeQueue.isEmpty())
    	{
    		Node<A> newNode = nodeQueue.remove();
    		nodes.add(newNode);

    		/*
    		if (newNode.contents == target.contents)
    			return true;
    		*/

	    	if (newNode.left != null)
	    	{
	    		nodeQueue.add(newNode.left);
	    		nodesInNextLayer++;

	    	}

	    	if (newNode.right != null)
	    	{
	    		nodeQueue.add(newNode.right);
	    		nodesInNextLayer++;
	    	}

	    	unexploredNodesInLayer--;
    		if (unexploredNodesInLayer == 0)
    		{
    			depth++;
    			unexploredNodesInLayer = nodesInNextLayer;
    			nodesInNextLayer = 0;
    		}
    	};

    	return depth;
    }

}
