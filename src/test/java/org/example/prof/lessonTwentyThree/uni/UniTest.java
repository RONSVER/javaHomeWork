package org.example.prof.lessonTwentyThree.uni;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class UniTest {

    Uni uni;

    @BeforeEach
    public void init() {
        uni = new Uni();
    }

    @Test
    public void testAddStudentElementsMoreThanTen() {
        for (int i = 0; i < 10; i++) {
            uni.addStudent(new Student(i, "Student" + i, 20 + i, Degree.Master));
        }
        assertThrows(IllegalStateException.class, () -> uni.addStudent(new Student(10, "Alex", 35, Degree.Master)));
    }

    @Test
    public void testAddStudentThereAreIdenticalElements() {
        uni.addStudent(new Student(0, "Petr", 10, Degree.Master));
        assertThrows(IllegalStateException.class, () -> uni.addStudent(new Student(0, "Alex", 35, Degree.Master)));
    }

    @Test
    public void testAddStudent() {
        uni.addStudent(new Student(0, "Petr", 10, Degree.Master));
        uni.addStudent(new Student(1, "Alex", 35, Degree.Bachelor));
        assertEquals(2, uni.getCountStudents());
    }

    @Test
    public void testExcludeStudentWhenEmpty() {
        assertThrows(IllegalStateException.class, () -> uni.excludeStudent(3));
    }

    @Test
    public void testExcludeStudentWhenDontHaveId() {
        uni.addStudent(new Student(0, "Petr", 10, Degree.Master));
        assertThrows(IllegalStateException.class, () -> uni.excludeStudent(3));
    }

    @Test
    public void testExcludeStudent() {
        uni.addStudent(new Student(0, "Petr", 10, Degree.Master));
        uni.excludeStudent(0);
        assertEquals(0, uni.getCountStudents());
    }

    @Test
    public void testExcludeStudentReturn() {
        uni.addStudent(new Student(0, "Petr", 10, Degree.Master));
        Student excludedStudent = uni.excludeStudent(0);
        assertEquals(new Student(0, "Petr", 10, Degree.Master), excludedStudent);
    }

    @Test
    public void testGetAllStudentsWhenEmpty() {
        assertThrows(IllegalStateException.class, () -> uni.getAllStudents());
    }

    @Test
    public void testGetAllStudentsReturn() {
        uni.addStudent(new Student(0, "Petr", 10, Degree.Master));
        List<Student> students = uni.getAllStudents();
        assertEquals(1, students.size());
        assertTrue(students.contains(new Student(0, "Petr", 10, Degree.Master)));
    }

    @Test
    public void testGetAllStudentByDegree() {
        uni.addStudent(new Student(0, "Petr", 10, Degree.Master));
        uni.addStudent(new Student(1, "Nikolai", 40, Degree.Bachelor));
        uni.addStudent(new Student(2, "Grischa", 50, Degree.Master));
        uni.addStudent(new Student(3, "Katya", 60, Degree.Bachelor));

        List<Student> bachelorStudents = uni.getAllStudents(Degree.Bachelor);
        assertEquals(2, bachelorStudents.size());
        assertTrue(bachelorStudents.contains(new Student(1, "Nikolai", 40, Degree.Bachelor)));
        assertTrue(bachelorStudents.contains(new Student(3, "Katya", 60, Degree.Bachelor)));
    }

    @Test
    public void testGetAllStudentByDegreeWhenEmpty() {
        uni.addStudent(new Student(0, "Petr", 10, Degree.Master));
        uni.addStudent(new Student(2, "Grischa", 50, Degree.Master));
        assertThrows(IllegalStateException.class, () -> uni.getAllStudents(Degree.Bachelor));
    }

    @Test
    public void testGetCountStudents() {
        assertEquals(0, uni.getCountStudents());
        uni.addStudent(new Student(0, "Petr", 10, Degree.Master));
        assertEquals(1, uni.getCountStudents());
    }

    @Test
    public void testGetCountStudentsByDegree() {
        uni.addStudent(new Student(0, "Petr", 10, Degree.Master));
        uni.addStudent(new Student(1, "Nikolai", 40, Degree.Bachelor));
        uni.addStudent(new Student(2, "Grischa", 50, Degree.Master));
        uni.addStudent(new Student(3, "Katya", 60, Degree.Bachelor));

        assertEquals(2, uni.getCountStudents(Degree.Bachelor));
    }

    @Test
    public void testGetSumAgeAllStudents() {
        uni.addStudent(new Student(0, "Petr", 10, Degree.Master));
        uni.addStudent(new Student(1, "Nikolai", 40, Degree.Bachelor));
        uni.addStudent(new Student(2, "Grischa", 50, Degree.Master));
        uni.addStudent(new Student(3, "Katya", 60, Degree.Bachelor));

        assertEquals(160, uni.getSumAgeAllStudents());
    }

    @Test
    public void testGetSumAgeAllStudentsWhenEmpty() {
        assertThrows(IllegalStateException.class, () -> uni.getSumAgeAllStudents());
    }

    @Test
    public void testGetSumAgeAllStudentsByDegree() {
        uni.addStudent(new Student(0, "Petr", 10, Degree.Master));
        uni.addStudent(new Student(1, "Nikolai", 40, Degree.Bachelor));
        uni.addStudent(new Student(2, "Grischa", 50, Degree.Master));
        uni.addStudent(new Student(3, "Katya", 60, Degree.Bachelor));

        assertEquals(60, uni.getSumAgeAllStudents(Degree.Master));
    }

    @Test
    public void testGetSumAgeAllStudentsByDegreeWhenEmpty() {
        uni.addStudent(new Student(1, "Nikolai", 40, Degree.Bachelor));
        uni.addStudent(new Student(3, "Katya", 60, Degree.Bachelor));
        assertThrows(IllegalStateException.class, () -> uni.getSumAgeAllStudents(Degree.Master));
    }

    @Test
    public void testGetAverageAgeStudent() {
        uni.addStudent(new Student(0, "Petr", 10, Degree.Master));
        uni.addStudent(new Student(1, "Nikolai", 20, Degree.Bachelor));
        uni.addStudent(new Student(2, "Grischa", 70, Degree.Master));
        uni.addStudent(new Student(3, "Katya", 30, Degree.Bachelor));
        assertEquals(32.5, uni.getAverageAgeStudent());
    }

    @Test
    public void testGetAverageAgeStudentWhenEmpty() {
        assertThrows(IllegalStateException.class, () -> uni.getAverageAgeStudent());
    }
}