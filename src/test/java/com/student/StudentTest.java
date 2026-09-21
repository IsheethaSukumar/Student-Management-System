package com.student;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
public class StudentTest {
    @Test
    public void testStudentCreation() {
        Student student =
                new Student(101, "Isheetha", "CSE", 8.8);
        assertEquals(101, student.getId());
        assertEquals("Isheetha", student.getName());
        assertEquals("CSE", student.getDepartment());
        assertEquals(8.8, student.getCgpa());
    }
    @Test
    public void testStudentName() {
        Student student =
                new Student(102, "Anu", "IT", 9.0);
        assertEquals("Anu", student.getName());
    }
}