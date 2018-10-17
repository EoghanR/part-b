package com.mycompany.seassignment1;

import org.joda.time.DateTime;

/**
 *
 * @author Eoghan
 */
public class Driver {
    public static void main(String[] args){
        Student student1 = new Student("Eoghan", 21, new DateTime(1997, 6, 22, 0, 0), 15310661);
        Student student2 = new Student("Neil", 23, new DateTime(1994, 11, 21, 0, 0), 12435233);
        Student student3 = new Student("Colm", 26, new DateTime(1991, 11, 12, 0, 0), 10798534);
        
        System.out.println(student1.getUsername());
        System.out.println(student2.getUsername());
        System.out.println(student3.getUsername());
    }
}
