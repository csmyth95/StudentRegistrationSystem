package com.nuig.studentregistrationdriver;

import com.nuig.registrationbuilder.*;
import org.joda.time.LocalDate;

/**
 *
 * @author conor
 */
public class RegistrationDriver {
    public static void main(String[] args){
        
        Student alice = new Student("Alice Carter", 25, new LocalDate(1991, 2, 15));
        Student david = new Student("David Smith", 21, new LocalDate(1995, 12, 10));
        Student enda = new Student("Enda Walsh", 32, new LocalDate(1984, 3, 1));
        
        Module ct417 = new Module("Software Engineering III", "CT417");
        ct417.addStudent(alice);
        ct417.addStudent(enda);
        
        Module ct475 = new Module("Machine Learning & Data Mining", "CT475");
        ct475.addStudent(david);
        ct475.addStudent(alice);
        
        Module ct436 = new Module("Advanced Professional Skills", "CT436");
        ct436.addStudent(alice);
        ct436.addStudent(david);
        ct436.addStudent(enda);
        
        Course bct1 = new Course("Computer Science & IT", new LocalDate(2013, 9, 1), new LocalDate(2017, 5, 31));
        bct1.addModule(ct436);
        bct1.addModule(ct475);
        bct1.addModule(ct417);
        
        // List of Students with associated modules and course
        System.out.println("Course: "+bct1.getName());
        System.out.println("Modules in the course: ");
        for (Module m : bct1.getModules()){
            System.out.println("- Module: "+ m.getName());
            for (Student s: m.getStudents()){
                System.out.println("- - Student: " + s.getName());
            }
        }
        
    }
}
