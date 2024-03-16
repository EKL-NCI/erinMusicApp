/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package musicapplication;

/**
 *
 * @author erink
 */
public class Playlist implements LinearListInterface {
    private PlaylistNode head;
    private PlaylistNode last;
    private int size;

    public Playlist() {
        head = null;
        last = null;
        size = 0;
    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    @Override
    public int size() {
        return size;
    }

    private PlaylistNode getNodeAt(int index) {
        PlaylistNode currentNode = head;
        for (int count = 1; count < index; count++) {
            currentNode = currentNode.getNext();
        }
        return currentNode;
    }

    @Override
    public Song get(int index) {
        if (index >= 1 && index <= size) {
            PlaylistNode currentNode = getNodeAt(index);
            return currentNode.getSong();
        }
        return null;
    }

    @Override
    public void add(int index, Song song) {
        if (index < 1 || index > size + 1) {
            throw new IndexOutOfBoundsException("Index: " + index + ", Size: " + size);
        }
        PlaylistNode newNode = new PlaylistNode(song);
        if (isEmpty()) {
            head = newNode;
            last = newNode;
        } else if (index == 1) {
            newNode.linkNext(head); // Use linkNext method
            head = newNode;
        } else if (index == size + 1) {
            last.linkNext(newNode); // Use linkNext method
            last = newNode;
        } else {
            PlaylistNode currentNode = getNodeAt(index);
            newNode.linkNext(currentNode); // Use linkNext method
            currentNode.getPrev().linkNext(newNode); // Use linkNext method
        }
        size++;
    }


    @Override
    public void remove(int index) {
        if (index < 1 || index > size) {
            throw new IndexOutOfBoundsException("Index: " + index + ", Size: " + size);
        }
        PlaylistNode toRemove = getNodeAt(index);
        if (toRemove == head) {
            head = toRemove.getNext();
            if (head != null) {
                head.unlinkPrev(); // Use unlinkPrev method
            } else {
                last = null; // List is now empty
            }
        } else if (toRemove == last) {
            last = toRemove.getPrev();
            if (last != null) {
                last.unlinkNext(); // Use unlinkNext method
            } else {
                head = null; // List is now empty
            }
        } else {
            toRemove.getPrev().linkNext(toRemove.getNext()); // Use linkNext method to link prev node to next
        }
        toRemove.unlinkNext(); // Use unlinkNext method
        toRemove.unlinkPrev(); // Use unlinkPrev method
        size--;
    }

    public void clear() {
        head = null;
        last = null;
        size = 0;
    }
}
