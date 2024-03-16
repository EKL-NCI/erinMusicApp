/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package musicapplication;

/**
 *
 * @author erink
 */
public class PlaylistNode {
    private Song song;
    private PlaylistNode next;
    private PlaylistNode prev;

    public PlaylistNode(Song song) {
        this.song = song;
        this.next = null;
        this.prev = null;
    }

    public PlaylistNode getNext() {
        return next;
    }

    public void setNext(PlaylistNode next) {
        this.next = next;
    }

    public PlaylistNode getPrev() {
        return prev;
    }

    public void setPrev(PlaylistNode prev) {
        this.prev = prev;
    }

    public Song getSong() {
        return song;
    }

    public void setSong(Song song){
        this.song = song;
    }

    protected void linkNext(PlaylistNode node) {
        this.next = node;
        if (node != null) {
            node.prev = this;
        }
    }

    protected void linkPrev(PlaylistNode node) {
        this.prev = node;
        if (node != null) {
            node.next = this;
        }
    }

    protected void unlinkNext() {
        if (this.next != null) {
            this.next.prev = null;
            this.next = null;
        }
    }

    protected void unlinkPrev() {
        if (this.prev != null) {
            this.prev.next = null;
            this.prev = null;
        }
    }
}