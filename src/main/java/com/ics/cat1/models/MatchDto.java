package com.ics.cat1.models;

public class MatchDto {
    private Long id;
    private Long studentId;
    private String reason;

    public MatchDto(Long studentId, String reason) {
        this.studentId = studentId;
        this.reason = reason;
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
        return "MatchDto{" +
                "id=" + id +
                ", studentId=" + studentId +
                ", reason='" + reason + '\'' +
                '}';
    }
}
