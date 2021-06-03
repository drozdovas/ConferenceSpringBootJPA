package com.drozdovas.conference.dto;

public class RegistrationReportDto {
    private String Name;
    private String courseName;
    private String courseDescription;

    public RegistrationReportDto(String name, String courseName, String courseDescription) {
        Name = name;
        this.courseName = courseName;
        this.courseDescription = courseDescription;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public String getCourseDescription() {
        return courseDescription;
    }

    public void setCourseDescription(String courseDescription) {
        this.courseDescription = courseDescription;
    }
}
