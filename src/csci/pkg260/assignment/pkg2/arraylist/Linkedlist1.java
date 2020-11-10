/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package csci.pkg260.assignment.pkg2.arraylist;

import java.util.*;

/**
 *
 * @author louiejr.
 */
public class Linkedlist1 extends CSCI260Assignment2ArrayList{

    public void list3() {
        LinkedList<String> linkedlist = new LinkedList<String>();

        linkedlist.add("Item1");
        linkedlist.add("Item5");
        linkedlist.add("Item3");
        linkedlist.add("Item6");
        linkedlist.add("Item2");

        System.out.println("LinkedList Content: " + linkedlist);

        linkedlist.addFirst("First Item");
        linkedlist.addLast("Last Item");
        System.out.println("LinkedList Content after addition: " + linkedlist);

        Object firstvar = linkedlist.get(0);
        System.out.println("First element: " + firstvar);
        linkedlist.set(0, "Changed first item");
        Object firstvar2 = linkedlist.get(0);
        System.out.println("First element after update by set method: " + firstvar2);

        linkedlist.removeFirst();
        linkedlist.removeLast();
        System.out.println("LinkedList after deletion of first and last element: " + linkedlist);

        linkedlist.add(0, "Newly added item");
        linkedlist.remove(2);
        System.out.println("Final Content:" + linkedlist);

    }

}
