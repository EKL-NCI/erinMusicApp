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
    private int iSize;
    
    playlist(){
        head = null;
        last = null;
        current = head;
        iSize = 0;
    }
    
    public boolean isEmpty(){
        return (iSize == 0);
    }
    
    public int size(){
        return iSize;
    }
    
    private void setCurrent(int inIndex){
        current = head;
        for(int iCount = 1; iCount < inIndex; iCount++){
            current = current.getNext();
        }
    }
    
    public Song get(int iIndex) {
        setCurrent(iIndex);
        return current.getSong();
    }
    
    public void add(int iIndex, Song inSong){
        playlistNode newNode = new playlistNode(inSong, null, null);
        
        if(iSize == 0){
            head = newNode;
            last = newNode;
        }else{
            if (iIndex == 1){
                newNode.setNext(head);
                head.setPrev(newNode);
                head = newNode;
            }else if(iIndex == iSize + 1){
                newNode.setPrev(last);
                last.setNext(newNode);
                last = newNode;
            }else{
                setCurrent(iIndex);
                newNode.setNext(current);
                playlistNode prev = current.getPrev();
                newNode.setPrev(prev);
                prev.setNext(newNode);
                current.setPrev(newNode);
            }
        }
        iSize++;
    }
    
    public void remove(int iIndex){
        if(iSize > 0){
            if(iIndex == 1){
                head = head.getNext();
                head.setPrev(null);
            }else if(iIndex == iSize){
                last = last.getPrev();
                last.setNext(null);
            }else{
                setCurrent(iIndex);
                playlistNode prev = current.getPrev();
                playlistNode next = current.getNext();
                prev.setNext(next);
                next.setPrev(prev);
            }
            current = null;
            iSize--;
        }else{
            System.out.println("This playlist is Empty.");
        }
    }
    
    public String printList() {
        String allItems = new String();
        for (playlistNode aNode = head; aNode != null; aNode = aNode.getNext()) {
            String oneItem = (aNode.getSong()).toString();
            allItems = allItems + oneItem + ", ";
        }
        return allItems;
    }
}
