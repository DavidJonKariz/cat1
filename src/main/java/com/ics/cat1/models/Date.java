package com.ics.cat1.models;

public class Date {
    private Long id;
    private Student student;
    private Match match;
    private Requested requested;
    private String reason;

    private Date() {}

    public Date(Student student, Match match) {
        this.student = student;
        this.match = match;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    public Match getMatch() {
        return match;
    }

    public void setMatch(Match match) {
        this.match = match;
    }

    public Requested getRequested() {
        return requested;
    }

    public void setRequested(Requested requested) {
        this.requested = requested;
    }

    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }

    @Override
    public String toString() {
        return "Date{" +
                "id=" + id +
                ", student=" + student +
                ", match=" + match +
                ", requested='" + requested + '\'' +
                ", reason='" + reason + '\'' +
                '}';
    }
}
