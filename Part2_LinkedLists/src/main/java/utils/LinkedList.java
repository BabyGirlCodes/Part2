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


}