/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package musicapplication;

/**
 *
 * @author erink
 */
public interface LinearListInterface {

    public boolean isEmpty();

    public int size();

    public Song get(int Index);
    
    public void add(int Index, Song inSong);

    public void remove(int Index);

}
