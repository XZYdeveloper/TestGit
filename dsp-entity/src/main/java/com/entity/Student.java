package com.entity;


import java.io.Serializable;

/**
 * <p>
 * 
 * </p>
 *
 * @author xzy
 * @since 2020-01-20
 */


public class Student implements Serializable {

    private static final long serialVersionUID = 1L;

    private String name;

    private Integer age;

    private Integer grade;

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Integer getGrade() {
        return grade;
    }

    public void setGrade(Integer grade) {
        this.grade = grade;
    }
}
