package org.redi.inheritance;

import java.util.Date;

/**
 * Created by redi on 5/12/17.
 */
public class ConstructorTest {
    public static  void main(String[] args){
    Person person1=new Person();

        person1.setFirstName("Monir");
        System.out.print("the name of the guy is "+person1.getFirstName());
        Person person2=new Person("Monir","lastname",new Date(),"mkashkoul");
        Student student1=new Student("Monir","kashkoul",new Date(),"mkash","javacourse");
        System.out.print("the name of the student"+student1.getFirstName());
    }

}
