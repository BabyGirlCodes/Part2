package utils;



/**
 *
 * @author michelle
 */
public class LinkedList
{
    private Node first;
    private Node last;
    private int numElements;

    public LinkedList() {
        this.first = null;
        this.numElements = 0;
    }

    private static class Node {
        private String data;
        private Node next;


        public Node(String data) {
            this.data = data;
            this.next = null;
        }

    }

    /**
     * @return the size of the elements in the list
     */
    public int size() {
        return numElements;
    }
    public boolean isEmpty(){
        return numElements==0;

    }

    /**
     * @param pos The position that contains the data to be retrieved
     * @return The data(Song) present in the position specified
     */
    public String get(int pos){
//        VALIDATION
        if (isEmpty()|| pos < 0|| pos>= numElements){
            throw new IndexOutOfBoundsException("Position to be found must be between " + "0 and " + (numElements - 1) +
                    ". Position provided: " +pos+ "is not within this range");

        }
        Node current = first;
        for (int i = 0; i <  pos; i++) {
            current = current.next;
        }
            return current.data;
    }


}