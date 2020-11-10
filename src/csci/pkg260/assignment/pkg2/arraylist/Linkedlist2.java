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
public class Linkedlist2 extends CSCI260Assignment2ArrayList{

    public void list4() {
        LinkedList<String> lList = new LinkedList<String>();

        lList.add("1");
        lList.add("2");
        lList.add("3");
        lList.add("4");
        lList.add("5");

        System.out.println("Linkedlist contains: " + lList);

        Object object = lList.removeFirst();
        System.out.println(object + " has been removed from the first index of LinkedList");
        System.out.println("LinkedList now contains: " + lList);

        object = lList.removeLast();
        System.out.println(object + " has been removed from the last index of LinkedList");
        System.out.println("LinkedList now contains: " + lList);

    }
}
