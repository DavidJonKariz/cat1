package com.ics.cat1.models;

public class Match {
    private Long id;
    private String name;
    private String gender;
    private String description;

    private Match () {}

    public Match(String name, String gender, String description) {
        this.name = name;
        this.gender = gender;
        this.description = description;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "Match{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", gender='" + gender + '\'' +
                ", description='" + description + '\'' +
                '}';
    }
}
