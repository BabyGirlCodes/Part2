package utils;


import business.Song;

/**
 * @author michelle
 */
public class LinkedList {
    private Node first;
    private Node last;
    private int numElements;

    public LinkedList() {
        this.first = null;
        this.numElements = 0;
    }

    private static class Node {

        private final Song song;
        private Node next;

        public Node(Song song) { // Changed constructor
            this.song = song;
            this.next = null;
        }


    }

    /**
     * @return the size of the elements in the list
     */
    public int size() {
        return numElements;
    }


    /**
     * @return true if there are no elements in the list, false otherwise.
     */
    public boolean isEmpty() {
        return numElements == 0;

    }

    /**
     * @param pos The position that contains the data to be retrieved
     * @return The data(Song) present in the position specified
     */
    public Song get(int pos) {
//        VALIDATION
        if (isEmpty() || pos < 0 || pos >= numElements) {
            throw new IndexOutOfBoundsException("Position to be found must be between " + "0 and " + (numElements - 1) +
                    ". Position provided: " + pos + "is not within this range");

        }
        Node current = first;
        for (int i = 0; i < pos; i++) {
            current = current.next;
        }
        return current.song;
    }

    /**
     * @param song The Song to be found in the list.
     * @return The index of the Song in the list, or -1 if not found.
     */
    public int indexOf(Song song) {
//        VALIDATION
        if(song == null){
            throw new IllegalArgumentException("List cannot handle null elements.");
        }
        Node newNode = new Node(song);
        Node current = newNode;
        while (current.next != null) {
            current = current.next;
        }
        current.next = newNode;
        for (int i = 0; i < numElements; i++) {
            if (current.equals(song)) {
                return i;
            }
        }
        return -1;

    }
    /**
     * Adds a Song to the end of the list.
     *
     * @param song The Song to add.
     */
    public void add(Song song) {
        if (song == null) {
            throw new IllegalArgumentException("Null cannot be added to the List");
        }
        Node newNode = new Node(song);
        if (isEmpty()) {
            first = newNode;
            last = newNode;
        } else {
            last.next = newNode;
            last = newNode;
        }
        numElements++;
    }
    /**
     * Returns the last element in the list.
     *
     * @return The last Song in the list, or null if the list is empty.
     */
    public Song tail() {
        if (isEmpty()) {
            throw new IllegalArgumentException("This list cannot be empty");
        }
        return last.song;
    }
}