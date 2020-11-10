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
public class Challenge extends CSCI260Assignment2ArrayList {

    public void j() {
        Scanner keyboard = new Scanner(System.in);
        LinkedList<String> students = new LinkedList<String>();
        String userInput = "Y";
        boolean x = true;
        System.out.println("Enter five names of students in Classroom 1");
        students.add(keyboard.nextLine());
        students.add(keyboard.nextLine());
        students.add(keyboard.nextLine());
        students.add(keyboard.nextLine());
        students.add(keyboard.nextLine());
        System.out.println("Classroom 1: " + students);
        System.out.println("What names would you like to remove from the list?");
        students.remove(keyboard.nextLine());
        System.out.println("Anymore names would you like to remove from the list? Y/N");
        userInput = keyboard.next();
        while (x) {
            if (userInput.equals("Y") || userInput.equals("y")) {
                System.out.println("Remove a name");
                students.remove(keyboard.next());
                System.out.println("Anymore names would you like to remove from the list? Y/N");
                userInput = keyboard.next();
            } else if (userInput.equals("N") || userInput.equals("n")) {
                System.out.println("Classroom 1: " + students);
                x = false;
            }
        }

    }

}
