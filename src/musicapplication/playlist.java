/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package musicapplication;

/**
 *
 * @author erink
 */
public class playlist implements LinearListInterface{
   
    private playlistNode head;
    private playlistNode last;
    private playlistNode current;
    private int i;
    
    playlistNode(){
        head = null;
        last = null;
        current = head;
        i = 0;
    }
    
    public boolean isEmpty(){
        return (i == 0);
    }
    
    public int size(){
        return i;
    }
    
    public void add(){
        
    }
    
    public void remove(){
        
    }
    
    
}
