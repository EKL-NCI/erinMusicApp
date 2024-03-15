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
    public Object get(int iIndex);
    public void remove(int iIndex);
    public void add(Object element, int iIndex);
    public void add(Object element);
    public String printList();
    public String printListBwd();
}
