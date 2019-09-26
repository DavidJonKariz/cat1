package com.ics.cat1.models;

public class DateTo {
    private Long id;
    private Long studentId;
    private String reason;

    public DateTo(Long studentId, String reason) {
        this.studentId = studentId;
        this.reason = reason;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getStudentId() {
        return studentId;
    }

    public void setStudentId(Long studentId) {
        this.studentId = studentId;
    }

    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }

    @Override
    public String toString() {
        return "DateTo{" +
                "id=" + id +
                ", studentId=" + studentId +
                ", reason='" + reason + '\'' +
                '}';
    }
}
