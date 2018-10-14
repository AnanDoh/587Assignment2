package trees;

import static org.junit.Assert.assertEquals;
import org.junit.Test;
import java.util.ArrayList;

public class TreeOperationsTest {

    @Test
    public void depthTest() {

        Node<Integer> rootNode;
        int currentTreeNum;

        currentTreeNum = 1;
        rootNode = getNodeTree(currentTreeNum);
        assertEquals(getDepth(currentTreeNum),TreeOperations.maxDepth(rootNode));

        currentTreeNum = 2;
        rootNode = getNodeTree(currentTreeNum);
        assertEquals(getDepth(currentTreeNum),TreeOperations.maxDepth(rootNode));

        currentTreeNum = 3;
        rootNode = getNodeTree(currentTreeNum);
        assertEquals(getDepth(currentTreeNum),TreeOperations.maxDepth(rootNode));

        currentTreeNum = 4;
        rootNode = getNodeTree(currentTreeNum);
        assertEquals(getDepth(currentTreeNum),TreeOperations.maxDepth(rootNode));

        currentTreeNum = 5;
        rootNode = getNodeTree(currentTreeNum);
        assertEquals(getDepth(currentTreeNum),TreeOperations.maxDepth(rootNode));

        currentTreeNum = 6;
        rootNode = getNodeTree(currentTreeNum);
        assertEquals(getDepth(currentTreeNum),TreeOperations.maxDepth(rootNode));
    
    }

    @Test
    public void contentTest() 
    {
    	Node<Integer> rootNode;
    	ArrayList<Node<Integer>> nodeList;
    	ArrayList<Integer> integerList;
		ArrayList<Integer> treeIntegerList;

    	rootNode = getNodeTree(1);
    	nodeList = TreeOperations.bfs(rootNode);
        integerList = convertToContentList(nodeList);
        treeIntegerList = getIntegerList(1);
        assertEquals(true, testContentEquality(integerList, treeIntegerList));
    }

    private int getDepth(int depthNum)
    {
    	switch (depthNum) {
    		case 1:
    			return 0;
    		case 2:
    			return 1;
    		case 3:
    			return 2;
    		case 4:
    			return 2;
    		case 5:
    			return 1;
    		case 6:
    			return 4;
    	}
    	return 0;
    }

    private ArrayList<Integer> getIntegerList(int arrayNum)
    {
    	ArrayList<Integer> integerList = new ArrayList<> ();

	    switch(arrayNum) {
			case 1:
			{
		    	integerList.add(5);

		    	// depth is 0
		    	// contents are 5
		    	//    5
		    	//  /   \
		    	return integerList;
	    	}

	    	case 2:
	    	{
	    		Node<Integer> rootNode = new Node(5,null,null);
	    		rootNode = new Node(10,rootNode,null);
		    	// depth is 1
		    	// contents are 5, 10
		    	//    10
		    	//  /   \
		    	// 5   
		    	return integerList;
	    	}

	    	case 3:
	    	{
	    		Node<Integer> rootNode = new Node(5,null,null);
	    		rootNode = new Node(10,rootNode,null);
	    		rootNode = new Node(7,rootNode,null);
	    		// depth is 2
		    	// contents are 7, 10, 5
		    	//     7
		    	//   /   \
		    	//  10
		    	//  /
		    	// 5 
		    	return integerList;
	    	}

	    	case 4:
	    	{
	    		Node<Integer> rootNode = new Node(5,null,null);
	    		rootNode = new Node(10,rootNode,rootNode);
	    		rootNode = new Node(10,rootNode,null);
	    		// depth is 2
		    	// contents are 10, 10, 5, 5
		    	//     10
		    	//   /   \
		    	//  10
		    	// /  \
		    	// 5  5
		    	return integerList;
	    	}

	    	case 5:
	    	{
	    		Node<Integer> rootNode = new Node(5,null,null);
	    		Node<Integer> otherNode = new Node(10,null,null);
	    		rootNode = new Node(10,otherNode,rootNode);
	    		// depth is 1
		    	// contents are 10, 10, 5
		    	//     10
		    	//   /   \
		    	//  10	 5
		    	// /  \ / \
		    	return integerList;
	    	}

	    	case 6:
	    	{
	    		Node<Integer> rootNode = new Node(5,null,null);
	    		rootNode = new Node(5,rootNode,null);
	    		rootNode = new Node(10,rootNode,rootNode);
	    		rootNode = new Node(10,rootNode,null);

	    		// depth is 2
		    	// contents are 10, 10, 5, 5
		    	//     10
		    	//   /   \
		    	//  10   
		    	// /  \
		    	// 5  5
		    	// /
		    	// 5
	    		Node<Integer> copyNode = new Node(5,null,null);
	    		copyNode = new Node(10,copyNode,copyNode);
	    		copyNode = new Node(10,copyNode,null);

	    		// depth is 2
		    	// contents are 10, 10, 5, 5
		    	//     10
		    	//   /   \
		    	//  10
		    	// /  \
		    	// 5  5

		    	rootNode = new Node(15,rootNode,copyNode);
		    	// depth is 4
		    	// contents are 15, 10, 10, 10, 10, 5, 5, 5, 5, 5
		    	//        15  
		    	//      /    \
		    	//     10    10
		    	//   /   \	 / \
		    	//  10      10  5
		    	// /  \     /
		    	// 5  5     5
		    	// /
		    	// 5

		    	return integerList;
    		}

    	}

    	return null;
    }

    private Node<Integer> getNodeTree(int treeNum)
    {

    	Node<Integer> rootNode;

    	switch(treeNum) {
    		case 1:
    		{
		    	rootNode = new Node(5,null,null);
		    	// depth is 0
		    	// contents are 5
		    	//    5
		    	//  /   \
		    	return rootNode;
	    	}

	    	case 2:
	    	{
	    		rootNode = new Node(5,null,null);
	    		rootNode = new Node(10,rootNode,null);
		    	// depth is 1
		    	// contents are 5, 10
		    	//    10
		    	//  /   \
		    	// 5   
		    	return rootNode;
	    	}

	    	case 3:
	    	{
	    		rootNode = new Node(5,null,null);
	    		rootNode = new Node(10,rootNode,null);
	    		rootNode = new Node(7,rootNode,null);
	    		// depth is 2
		    	// contents are 7, 10, 5
		    	//     7
		    	//   /   \
		    	//  10
		    	//  /
		    	// 5 
		    	return rootNode;
	    	}

	    	case 4:
	    	{
	    		rootNode = new Node(5,null,null);
	    		rootNode = new Node(10,rootNode,rootNode);
	    		rootNode = new Node(10,rootNode,null);
	    		// depth is 2
		    	// contents are 10, 10, 5, 5
		    	//     10
		    	//   /   \
		    	//  10
		    	// /  \
		    	// 5  5
		    	return rootNode;
	    	}

	    	case 5:
	    	{
	    		rootNode = new Node(5,null,null);
	    		Node<Integer> otherNode = new Node(10,null,null);
	    		rootNode = new Node(10,otherNode,rootNode);
	    		// depth is 1
		    	// contents are 10, 10, 5
		    	//     10
		    	//   /   \
		    	//  10	 5
		    	// /  \ / \
		    	return rootNode;
	    	}

	    	case 6:
	    	{
	    		rootNode = new Node(5,null,null);
	    		rootNode = new Node(5,rootNode,null);
	    		rootNode = new Node(10,rootNode,rootNode);
	    		rootNode = new Node(10,rootNode,null);

	    		// depth is 2
		    	// contents are 10, 10, 5, 5
		    	//     10
		    	//   /   \
		    	//  10   
		    	// /  \
		    	// 5  5
		    	// /
		    	// 5
	    		Node<Integer> copyNode = new Node(5,null,null);
	    		copyNode = new Node(10,copyNode,copyNode);
	    		copyNode = new Node(10,copyNode,null);

	    		// depth is 2
		    	// contents are 10, 10, 5, 5
		    	//     10
		    	//   /   \
		    	//  10
		    	// /  \
		    	// 5  5

		    	rootNode = new Node(15,rootNode,copyNode);
		    	// depth is 4
		    	// contents are 15, 10, 10, 10, 10, 5, 5, 5, 5, 5
		    	//        15  
		    	//      /    \
		    	//     10    10
		    	//   /   \	 / \
		    	//  10      10  5
		    	// /  \     /
		    	// 5  5     5
		    	// /
		    	// 5

		    	return rootNode;
	    	}

    	}
    	return null;
    }

    private boolean testContentEquality(ArrayList<Integer> array1, ArrayList<Integer> array2)
    {
    	if (array1.size() == array2.size())
    	{
    		for (int i = 0; i < array1.size(); i++)
    		{
    			if (array1.get(i) != array2.get(i))
    				return false;
    		}

    		return true;
    	}
    	return false;
    }

    private ArrayList<Integer> convertToContentList(ArrayList<Node<Integer>> originalList)
    {
    	ArrayList<Integer> newList = new ArrayList<> ();
    	for (int i = 0; i < originalList.size(); i++)
    	{
    		newList.add(originalList.get(i).contents);
    	}
    	return newList;
    }

    private void printIntegerArrayList(ArrayList<Integer> originalList)
    {
    	for (int i = 0; i < originalList.size(); i++)
    	{
    		System.out.println(originalList.get(i));
    	}
    }
}
