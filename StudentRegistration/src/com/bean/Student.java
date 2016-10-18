/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bean;

import java.io.Serializable;

public class Student implements Serializable, Common {

    public String name;
    public String college;
    public int rollNo;
    public int age;
    public String metaName;//filename

    public String getMetaName() {
        return metaName;
    }

    public void setMetaName(String metaName) {
        this.metaName = metaName;
    }

    public Student(String name, int rollNo, int age, String college) {
        this.name = name;
        this.college = college;
        this.rollNo = rollNo;
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public String getCollege() {
        return college;
    }

    public String getName() {
        return name;
    }

    public int getRollNo() {
        return rollNo;
    }
}
