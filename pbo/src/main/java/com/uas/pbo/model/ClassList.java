package com.uas.pbo.model;

import jakarta.persistence.Column; // <-- ADD THIS IMPORT
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "class_list")
public class ClassList {

    @Id
    @Column(name = "COURSE_CODE") // <-- ADD THIS LINE
    private String courseCode;

    // It is best practice to map all columns explicitly
    @Column(name = "COURSE_NAME") // <-- ADD THIS LINE
    private String courseName;

    @Column(name = "CREDITS") // <-- ADD THIS LINE
    private int credits;

    @Column(name = "SEMESTER") // <-- ADD THIS LINE
    private String semester;

    @Column(name = "CLASSROOM") // <-- ADD THIS LINE
    private String classroom;

    @Column(name = "LECTURER") // <-- ADD THIS LINE
    private String lecturer;

    public ClassList() {}
    
    // Getters and Setters
    public String getCourseCode() {
        return courseCode;
    }
    public void setCourseCode(String courseCode) {
        this.courseCode = courseCode;
    }

    public String getCourseName() {
        return courseName;
    }
    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public int getCredits() {
        return credits;
    }
    public void setCredits(int credits) {
        this.credits = credits;
    }

    public String getSemester() {
        return semester;
    }
    public void setSemester(String semester) {
        this.semester = semester;
    }

    public String getClassroom() {
        return classroom;
    }
    public void setClassroom(String classroom) {
        this.classroom = classroom;
    }

    public String getLecturer() {
        return lecturer;
    }
    public void setLecturer(String lecturer) {
        this.lecturer = lecturer;
    }

    public ClassList(String courseCode, String courseName, int credits,
                   String semester, String classroom, String lecturer) {
        this.courseCode = courseCode;
        this.courseName = courseName;
        this.credits = credits;
        this.semester = semester;
        this.classroom = classroom;
        this.lecturer = lecturer;
    }
}