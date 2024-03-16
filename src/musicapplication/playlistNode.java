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
    
    public playlistNode(Song inSong, playlistNode inNext, playlistNode inPrev){
        this.song = inSong;
        this.next = inNext;
        this.prev = inPrev;
    }

    public playlistNode getNext() {
        return next;
    }

    public void setNext(playlistNode inNext) {
        next = inNext;
    }

    public playlistNode getPrev() {
        return prev;
    }

    public void setPrev(playlistNode inPrev) {
        prev = inPrev;
    }
    
    public Song getSong() {
        return song;
    }

    public void setSong(Song inSong){
        song = inSong;
    }
    
}
