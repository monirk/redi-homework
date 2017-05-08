package org.redi.inheritance;

import java.util.Date;

/**
 * Created by redi on 5/8/17.
 */
public class App {
    public static void main(String[] args){
        System.out.print("Hallo Inheritance");
        Student student=new Student();
        student.setFirstName("Monir");
        student.setDateOfBirth(new Date());
        student.setLastName("kashkoul");
        Teacher teacher=new Teacher();
        teacher.setFirstName("Mohamed");

        System.out.print("Student name is:"+ student.getFirstName() + "last name ist"+ student.getLastName());
    }
}
