package com.mycompany.seassignment1;

import org.joda.time.DateTime;
import java.util.ArrayList;

/**
 *
 * @author Eoghan
 */
public class Driver {
    public static void main(String[] args){
        ArrayList<Student> students = new ArrayList<Student>();
        ArrayList<Module> modules = new ArrayList<Module>();
        ArrayList<Course> courses = new ArrayList<Course>();
        
        students.add(new Student("Eoghan", 21, new DateTime(1997, 6, 22, 0, 0), 15310661));
        students.add(new Student("Neil", 23, new DateTime(1994, 11, 21, 0, 0), 12435233));
        students.add(new Student("Colm", 26, new DateTime(1991, 11, 12, 0, 0), 10998534));
        students.add(new Student("David", 22, new DateTime(1996, 10, 10, 0, 0), 15239856));
        students.add(new Student("Eamonn", 24, new DateTime(1994, 8, 31, 0, 0), 12967435));
        
        modules.add(new Module("Programming", "CT417"));
        modules.add(new Module("Telecomms", "EE453"));
        modules.add(new Module("Electromagnetics", "EE348"));
        modules.add(new Module("English", "AL443"));
        modules.add(new Module("Film Studies", "AL475"));
        modules.add(new Module("Economics", "BA421"));
        modules.add(new Module("Physics", "SC456"));
        modules.add(new Module("Business", "BA453"));
        modules.add(new Module("Mathematics", "MA451"));
        modules.add(new Module("Chemistry", "SC435"));
        
        courses.add(new Course("Computer Science", new DateTime(2018, 9, 10, 0, 0), new DateTime(2019, 5, 10, 0, 0)));
        courses.add(new Course("Engineering", new DateTime(2018, 9, 10, 0, 0), new DateTime(2019, 5, 10, 0, 0)));
        courses.add(new Course("Film Studies", new DateTime(2018, 9, 10, 0, 0), new DateTime(2019, 5, 10, 0, 0)));
        courses.add(new Course("Business Studies", new DateTime(2018, 9, 10, 0, 0), new DateTime(2019, 5, 10, 0, 0)));
        courses.add(new Course("General Science", new DateTime(2018, 9, 10, 0, 0), new DateTime(2019, 5, 10, 0, 0)));
                
    }
}
