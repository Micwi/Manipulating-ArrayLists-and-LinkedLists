/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package csci.pkg260.assignment.pkg2.arraylist;
import java.util.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author louiejr.
 */
public class arraylist2 extends CSCI260Assignment2ArrayList{
    
    public void list2() throws IOException {
        BufferedReader userInput = new BufferedReader(new InputStreamReader(System.in));
        
        ArrayList<String> myArr = new ArrayList<String>();
        myArr.add("Italian Riviera");
        myArr.add("Jersey Shore");
        myArr.add("Puerto Rico");
        myArr.add("Los Cabos Corridor");
        myArr.add("Lubmin");
        myArr.add("Coney Island");
        myArr.add("Karlovy Vary");
        myArr.add("Bourbon-1 'Archambault");
        myArr.add("Walt Disney World Resort");
        myArr.add("Barbados");
        
        System.out.println("Vacation Resort Advisor");
        System.out.println("Enter your name: ");
        
        String name = userInput.readLine();
        Integer nameLength = name.length();
        
        if(nameLength == 0){
            System.out.println("Empty name entered");
            return;
        }
        Integer vacationIndex = nameLength % myArr.size();
        
        System.out.println("\nYour name is " + name + ", its length is " + nameLength + " characters, \n" + "thats why we suggest you to go to " + myArr.get(vacationIndex));
    }
}
