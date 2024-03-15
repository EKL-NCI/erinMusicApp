/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package musicapplication;

/**
 *
 * @author erink
 */
public class playlistNode {
    private Song song;
    private playlistNode next;
    private playlistNode prev;
    
    public playlistNode(Song song){
        this.song = song;
        this.next = null;
        this.prev = null;
    }

    public Song getSong() {
        return song;
    }

    public void setSong(Song song) {
        this.song = song;
    }

    public playlistNode getNext() {
        return next;
    }

    public void setNext(playlistNode next) {
        this.next = next;
    }

    public playlistNode getPrev() {
        return prev;
    }

    public void setPrev(playlistNode prev) {
        this.prev = prev;
    }
    
    
}
