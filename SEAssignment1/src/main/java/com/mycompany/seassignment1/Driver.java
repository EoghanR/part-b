package com.mycompany.seassignment1;

import org.joda.time.DateTime;
import java.util.ArrayList;

/**
 *
 * @author Eoghan
 */
public class Driver {
    public static void main(String[] args){
        ArrayList<Student> students = new ArrayList<>();
        ArrayList<Module> modules = new ArrayList<>();
        ArrayList<Course> courses = new ArrayList<>();
        
        students.add(new Student("Eoghan", 21, new DateTime(1997, 6, 22, 0, 0), 15310661)); //0
        students.add(new Student("Neil", 23, new DateTime(1994, 11, 21, 0, 0), 12435233));  //1
        students.add(new Student("Colm", 26, new DateTime(1991, 11, 12, 0, 0), 10998534));  //2
        students.add(new Student("David", 22, new DateTime(1996, 10, 10, 0, 0), 15239856)); //3
        students.add(new Student("Eamonn", 24, new DateTime(1994, 8, 31, 0, 0), 12967435)); //4
        
        modules.add(new Module("Programming", "CT417"));        //0
        modules.add(new Module("Telecomms", "EE453"));          //1
        modules.add(new Module("Electromagnetics", "EE348"));   //2
        modules.add(new Module("English", "AL443"));            //3
        modules.add(new Module("Film Studies", "AL475"));       //4
        modules.add(new Module("Economics", "BA421"));          //5
        modules.add(new Module("Physics", "SC456"));            //6
        modules.add(new Module("Business", "BA453"));           //7
        modules.add(new Module("Mathematics", "MA451"));        //8
        modules.add(new Module("Chemistry", "SC435"));          //9
        
        courses.add(new Course("Computer Science", new DateTime(2018, 9, 10, 0, 0), new DateTime(2019, 5, 10, 0, 0)));  //0
        courses.add(new Course("Engineering", new DateTime(2018, 9, 10, 0, 0), new DateTime(2019, 5, 10, 0, 0)));       //1
        courses.add(new Course("Film Studies", new DateTime(2018, 9, 10, 0, 0), new DateTime(2019, 5, 10, 0, 0)));      //2
        courses.add(new Course("Business Studies", new DateTime(2018, 9, 10, 0, 0), new DateTime(2019, 5, 10, 0, 0)));  //3
        courses.add(new Course("Medicine", new DateTime(2018, 9, 10, 0, 0), new DateTime(2019, 5, 10, 0, 0)));          //4
        
        //Add to Computer Science Course#
        courses.get(0).addStudent(students.get(3));
        courses.get(0).addModule(modules.get(0));
        courses.get(0).addModule(modules.get(6));
        courses.get(0).addModule(modules.get(8));
        
        //Add to Engineering
        courses.get(1).addStudent(students.get(0));
        courses.get(1).addModule(modules.get(0));
        courses.get(1).addModule(modules.get(1));
        courses.get(1).addModule(modules.get(2));
        courses.get(1).addModule(modules.get(6));
        courses.get(1).addModule(modules.get(8));
        
        //Add to Film Studies
        courses.get(2).addStudent(students.get(2));
        courses.get(2).addModule(modules.get(3));
        courses.get(2).addModule(modules.get(4));
        
        //Add to Business Studies
        courses.get(3).addStudent(students.get(1));
        courses.get(3).addModule(modules.get(0));
        courses.get(3).addModule(modules.get(3));
        courses.get(3).addModule(modules.get(5));
        courses.get(3).addModule(modules.get(7));
        
        //Add to Medicine
        courses.get(4).addStudent(students.get(4));
        courses.get(4).addModule(modules.get(3));
        courses.get(4).addModule(modules.get(6));
        courses.get(4).addModule(modules.get(8));
        courses.get(4).addModule(modules.get(9));
        
        //Prints Students and Modules relating to Course
        System.out.println("Courses");
        for(Course x : courses){
            System.out.println("\n" + x.getName() + "\nStudents: ");
            for(Student y : x.getStudents()){
                System.out.println(y.getName());
            }
            System.out.println("\nModules: ");
            for(Module y : x.getModules()){
                System.out.println(y.getModuleName());
            }
        }
        
        //Prints Courses and Students relating to Module
        System.out.println("\nModules");
        for(Module x : modules){
            System.out.println("\n" + x.getModuleName() + " - " + x.getModuleId() + "\nStudents: ");
            for(Student y : x.getStudents()){
                System.out.println(y.getName());
            }
            System.out.println("\nCourses: ");
            for(Course y : x.getCourses()){
                System.out.println(y.getName());
            }
        }
        
        //Prints Course and Modules relating to Student
        System.out.println("\nStudents");
        for(Student x : students){
            System.out.println("\n" + x.getName() + " - " + x.getID() + " - " + x.getUsername() + "\nCourse: " + x.getCourse().getName());
            System.out.println("\nModules: ");
            for(Module y : x.getModules()){
                System.out.println(y.getModuleName() + " - " + y.getModuleId());
            }
        }
    }
}
