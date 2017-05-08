package org.redi.inheritance;

/**
 * Created by redi on 5/8/17.
 */
public class Teacher extends Person {
    private String teachingCourse;

    public String getTeachingCourse() {
        return teachingCourse;
    }

    public void setTeachingCourse(String teachingCourse) {
        this.teachingCourse = teachingCourse;
    }
}
