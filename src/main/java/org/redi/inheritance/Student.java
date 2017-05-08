package org.redi.inheritance;

/**
 * Created by redi on 5/8/17.
 */
public class Student extends Person {
    private String attendentCourse;

    public String getAttendentCourse() {
        return attendentCourse;
    }

    public void setAttendentCourse(String attendentCourse) {
        this.attendentCourse = attendentCourse;
    }
}
