
/** required package class namespace */
package collections;

/** required imports */
import java.io.Serializable;
import java.lang.reflect.Array;

 
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
public class Queue <T extends Comparable<T>> implements Serializable
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
     * Constructor sets class data to the parameter 
     * 
     * @param list the LinkedList to set the queue to
     */
    public Queue(LinkedList<T> list) {
        finalize();                                     // wipe any current data
        for (int i = 0; i < list.size(); i++) {         // traverse list
            enqueue((T)list.get(i));                    // get data, push in queue
        }
    }
    
    /**
     * Constructor sets class data to the parameter 
     * 
     * @param array the array to set the stack to
     */
    public Queue(T[] array) {
        finalize();                                     // wipe any current data
        for (int i = 0; i < array.length; i++) {        // traverse array
            T data = (T)array[i];                       // retrieve data
            enqueue(data);                              // push onto stack
        }
    }
    
    /**
     * Turns the stack into a ADT LinkedList object
     * 
     * @return the Stack as a ADT LinkedList
     */
    public LinkedList<T> toLinkedList() {
        LinkedList<T> list = new LinkedList<>();        // create new list
        Node current = head;                            // start at first node        
        while (current != null) {                       // traverse queue   
            T data = (T)current.data;                   // retrieve data
            list.add(data);                             // add to list
            current = current.previous;                 // move to next node
        }
        return list;                                    // return list
    }
    
    /**
     * Returns an array that contains the same data as the list
     * 
     * @param array the data type array
     * @return an array of generic type T
     */
    public T[] toArray(T[] array) {
        array = (T[])(Array.newInstance(
                array.getClass().getComponentType(), 
                length));                               // create array 
        Node current = head;                            // start at top node 
        for (int i = 0; i < length; i++) {              // traverse array
            array[i] = (T)current.data;                 // retrieve data
            current = current.previous;                 // move to next node
        }
        return array;                                   // return array
    }
    
    /**
     * Removes an item from the tail of the queue
     * 
     * @return the generic data in the queue
     */
    public T dequeue() {
        if (isEmpty()) return null;
        else {
            length--;
            T data = (T)tail.data;
            if (head == tail) finalize();
            else {
                tail = tail.previous;
                tail.next.previous = null;
                tail.next = null;
                System.gc();
            }
            return data;
        }
    }
        
    /**
     * Adds data to the head of the queue
     * 
     * @param data the generic data to add
     * @return the operation was successful (true) or not (false)
     */
    public boolean enqueue(T data) {
        if (data == null) return false;                 // empty queue
        Node node = new Node<T>(data);                  // create node
        if (isEmpty()) head = tail = node;              // add first node
        else {                                          // add subsequent nodes
            node.next = head;                           // adjust references
            head.previous = node;
            head = node;
        }
        length++;                                       // increase length
        return true;                                    // operation successful
    }
    
    /**
     * Just "peeks" at front of the queue without mutating the structure
     * 
     * @return the data at the front
     */
    public T front() {
        if (isEmpty()) return null;                     // no nodes in stack
        return (T)tail.data;
    }
    
    /**
     * Just "peeks" at back of the queue without mutating the structure
     * 
     * @return the data at the back
     */
    public T back() {
        if (isEmpty()) return null;                     // no nodes in stack
        return (T)head.data;
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
        return length == 0;
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
            String text = "Queue = [";                  // starting character
            Node current = head;                        // start at top node
            while (current.previous != null) {          // traverse stack
                text += current.toString() + ",";       // append data
                current = current.previous;             // move to next node
            }            
            return text + current.toString() + "]";     // append end character
        }
    }
    
    /**
     * Deep comparison, determines if two objects are "equal" in this context
     *
     * @param object the object to compare to
     * @return the objects are "equal" (true) or not (false)
     */
    @Override
    public boolean equals(Object object) {
        if (!(object instanceof Queue)) return false;   // check object type
        try {                                           // error trap
            Queue<T> q1 = this.clone();                 // clone this queue
            Queue<T> q2 = ((Queue<T>)object).clone();   // clone/cast parameter
            if (q1.size() != q2.size()) return false;   // queues not same size          
            while (!q1.isEmpty()) {                     // traverse queues
                T data1 = (T)q1.dequeue();              // retrieve data
                T data2 = (T)q2.dequeue();
                if (!data1.equals(data2)) return false; // compare data              
            }
            return true;                                // all tests passed
        }
        catch (ClassCastException | NullPointerException e) { 
            return false;                               // cannot cast, or null
        }
    }
        
    /**
     * a Deep clone, creates a duplicate object using new memory
     *
     * @return a "clone" of the object using new memory
     */
    @Override
    public Queue clone() {
        Queue<T> q = new Queue<>();                     // new empty queue
        Node current = head;                            // start at first node
        while (current != null) {                       // traverse queue
            T data = (T)current.data;                   // get data
            q.enqueue(data);                            // enqueue to new queue
            current = current.previous;                 // move to next node
        }        
        return q;                                       // return clone
    }

}
