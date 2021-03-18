
/** Required package class namespace */
package collections;

/** Required imports */
import java.io.Serializable;

/**
 * Queue.java - a Queue ADT using generics. It is a collection of entities that 
 * are maintained in a sequence and can be modified by the addition of entities 
 * at one end of the sequence and removal from the other end of the sequence. 
 * By convention, the end of the sequence at which elements are added is called 
 * the back, tail, or rear of the queue and the end at which elements are 
 * removed is called the head or front of the queue, analogously to the words 
 * used when people line up to wait for goods or services. It can be 
 * visualized as:
 * 
 *   Add items (enqueue)                      Remove items (dequeue)
 *   back (or tail, rear)                     front (or head)
 *    |                                         |
 *    V                                         V
 *   item  item  item  item  item  item  item  item  
 *                                             (null indicates empty queue)
 *
 * @author Mr. Wachs
 * @param <T> the generic object used in this class
 * @since Feb. 27, 2020, 10:03:47 a.m.
 */
public class Queue <T> implements Serializable
{

    /** Node reference to the first node in the queue */
    private Node head;
    
    /** Node reference to the last node in the queue */
    private Node tail;    
    
    /** The number of nodes in the stack */
    private int length;
    
    /**
     * Default constructor, set class properties
     */
    public Queue() {
        finalize();
    }
    
    /**
     * Frees up all memory used by this object
     */
    @Override
    public final void finalize() {
        head = tail = null;                     // references set to nulls
        length = 0;                             // length set to zero
        System.gc();                            // garbage collector called
    }
   
    /**
     * Determines if the stack is empty or not
     * 
     * @return empty stack (true) or not (false)
     */
    public boolean isEmpty() {
        return (length == 0);
    }
    
    /**
     * The number of items in the stack
     * 
     * @return the length of the stack
     */
    public int size() {
        return length;
    }
    
    /**
     * String representation of this object
     *
     * @return The object represented as a String
     */
    @Override
    public String toString() {
        if (isEmpty()) return "Empty Queue";            // no nodes to display
        else {
            String text = "Queue front ->[";            // starting character
            Node current = head;                        // start at top node
            while (current.next != null) {              // traverse stack
                text += current.toString() + ",";       // append data
                current = current.next;                 // move to next node
            }            
            return text + current.toString() + "]<- back"; // append end 
        }
    }
    
    
}
