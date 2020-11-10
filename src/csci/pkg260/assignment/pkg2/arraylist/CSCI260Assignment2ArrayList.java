/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package csci.pkg260.assignment.pkg2.arraylist;

import java.io.IOException;
import java.util.*;

/**
 *
 * @author louiejr.
 */
public class CSCI260Assignment2ArrayList {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {

        System.out.println();

        System.out.println("#1");
        System.out.println();
        arraylist1 x = new arraylist1();
        x.list();
        System.out.println();

        System.out.println("#2");
        System.out.println();

        arraylist2 y = new arraylist2();
        y.list2();
        System.out.println();

        System.out.println("#3");
        System.out.println();
        Linkedlist1 z = new Linkedlist1();
        z.list3();
        System.out.println();

        System.out.println("#4");
        System.out.println();
        Linkedlist2 a = new Linkedlist2();
        a.list4();
        System.out.println();

        System.out.println("Challenge");
        System.out.println();

        Challenge b = new Challenge();
        b.j();

    }

}
