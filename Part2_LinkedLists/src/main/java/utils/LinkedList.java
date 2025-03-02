package utils;


import business.Song;

import java.util.NoSuchElementException;

/**
 * @author michelle
 */
public class LinkedList {
    private Node first;
    private Node last;
    private int numElements;
    private String checkArtist;

    public LinkedList() {
        this.first = null;
        this.last = null;
        this.numElements = 0;
        this.checkArtist = null;
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
        Node current = first;

        for (int i = 0; i < numElements; i++) {
            if (current.song.equals(song)) {
                return i;
            }
            current =current.next;
        }
        return -1;

    }
    /**
     * Adds a Song to the end of the list.
     *
     * @param song The Song to add.
     */
    public void add(Song song) {
//        VALIDATION
        if (song == null) {
            throw new IllegalArgumentException("Null cannot be added to the List");
        }
        if (!song.getArtist().toLowerCase().equals(this.checkArtist)){
            throw new IllegalArgumentException("The song artist must match the list's artist");
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
            throw new NoSuchElementException("List cannot be empty");
        }
        return last.song;
    }

    /**
     * Removes the first instance of the specified Song from the list.
     *  The remove method is to remove the first instance of a song found in the list.Validations are in place for null values coming in, and if the list is empty to start with. If the song is found in the first space,
     *  the first and last are both set to null. If it is found in the middle, the current skips over the position to be deleted
     *  automatically deleting the middle one, and setting the current one to the last.
     *
     * @param song The Song to remove.
     * @return True if the Song was removed, false otherwise.
     */
    public boolean remove(Song song) {
        if (song == null) {
            throw new IllegalArgumentException("Song to remove cannot be null.");
        }

        if (isEmpty()) {
            return false;
        }

        if (first.song.equals(song)) {
            first = first.next;
            if (first == null) {
                last = null;
            }
            numElements--;
            return true;
        }

        Node current = first;
        while (current.next != null) {
            if (current.next.song.equals(song)) {
                current.next = current.next.next;
                if (current.next == null) {
                    last = current; // Update last if last element was removed
                }
                numElements--;
                return true;
            }
            current = current.next;
        }
        return false; // Song not found
    }
}