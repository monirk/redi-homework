package org.redi.inheritance;

import java.util.Date;

/**
 * Created by redi on 5/8/17.
 */
public class Student extends Person {
    private String attendentCourse;
    public Student(String firstName, String lastName,Date dateOfBirth,String email,String attendentCourse){
        super(firstName,lastName,dateOfBirth,email);
        this.attendentCourse=attendentCourse;

    }

    public String getAttendentCourse() {
        return attendentCourse;
    }

    public void setAttendentCourse(String attendentCourse) {
        this.attendentCourse = attendentCourse;
    }
}
