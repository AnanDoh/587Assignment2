package trees;
import java.util.Queue; 
import java.util.LinkedList; 

public class TreeOperations {
    // TODO: write any needed code here
    Boolean breadthfirstSearch(Node target, Node head)
    {
    	Queue<Node> nodeQueue = new LinkedList<> (); 
    	if (head == null)
    		return false;

    	if (head.left != null)
    	{
    		nodeQueue.add(head.left);
    	}

    	if (head.right != null)
    	{
    		nodeQueue.add(head.right);
    	}

    	while (!nodeQueue.isEmpty())
    	{
    		Node newNode = nodeQueue.remove();

    		if (newNode.contents == target.contents)
    			return true;

	    	if (newNode.left != null)
	    	{
	    		nodeQueue.add(head.left);
	    	}

	    	if (newNode.right != null)
	    	{
	    		nodeQueue.add(head.right);
	    	}
    	};

    	return false;
    }
}
