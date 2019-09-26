package com.ics.cat1.models;

public class Student {
    private Long id;
    private String firstName;
    private Integer studentNumber;
    private Integer score;
    private String attachment;

    private Student() {}

    public Student(Integer studentNumber,String firstName) {
        this.firstName = firstName;
        this.studentNumber = studentNumber;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public Integer getStudentNumber() {
        return studentNumber;
    }

    public void setStudentNumber(Integer studentNumber) {
        this.studentNumber = studentNumber;
    }

    public Integer getScore() {
        return score;
    }

    public void setScore(Integer score) {
        this.score = score;
    }

    public String getAttachment() {
        return attachment;
    }

    public void setAttachment(String attachment) {
        this.attachment = attachment;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", studentNumber=" + studentNumber +
                ", score=" + score +
                ", attachment='" + attachment + '\'' +
                '}';
    }
}
