package com.prog.kompare;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TestCompare {
    public static void main(String[] args) {

        List<Dog> list = new ArrayList<>();

        list.add(new Dog("Lily", 3));
        list.add(new Dog("Sara", 2));
        list.add(new Dog("Sakura", 5));

        //Collections.sort（list，排序方法）
        Collections.sort(list, new SortDogAge());
        System.out.println(list);

        Collections.sort(list, new SortDogName());
        System.out.println(list);
/********************************************************************************/

        List<Student> studentList = new ArrayList<>();
        Student s1 = new Student("Lee", 28);
        Student s2 = new Student("Jacky", 29);
        Student s3 = new Student("Jacky", 22);
        Student s4 = new Student("Lee", 21);

        studentList.add(s1);
        studentList.add(s2);
        studentList.add(s3);
        studentList.add(s4);


        Collections.sort(studentList);
        System.out.println(studentList);
        //[Jacky_22, Jacky_29, Lee_21, Lee_28]

        StudentComparator tc = new StudentComparator();
        Collections.sort(studentList, tc);
        //Collections.sort(studentList, new StudentComparator());

        System.out.println(studentList);
        //[Jacky_22, Jacky_29, Lee_21, Lee_28]

    }
}
