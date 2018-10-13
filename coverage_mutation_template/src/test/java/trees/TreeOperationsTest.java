package trees;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class TreeOperationsTest {
    @Test
    public void bogusTest() {
        // illustrates how to write a test
        // assertEquals(expected, expression_being_tested)
        assertEquals(2, 1 + 1);
        Node rootNode = new Node(5,null,null);
        assertEquals(0,TreeOperations.maxDepth(rootNode));
    
    }
}
