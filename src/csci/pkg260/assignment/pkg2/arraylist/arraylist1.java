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
public class arraylist1 extends CSCI260Assignment2ArrayList{

    public void list() {
        ArrayList<String> obj = new ArrayList<String>();

        obj.add("smith");
        obj.add("jones");
        obj.add("Jameson");
        obj.add("harrison");
        obj.add("white");
        obj.add("brown");
        
        System.out.println("Currently the array list has the following elements: " + obj);

        /*obj.add(4, "Ann");
        obj.add(1, "Tim");

        obj.remove("Charles");
        obj.remove("Harry");

        System.out.println("Current array list is: " + obj);

        obj.remove(1);

        System.out.println("Current array list is: " + obj);
*/
    }

}
