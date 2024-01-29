package com.example.UnitTestingApplication;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class StudentMockTest {

    @Test
    void findTotal(){
        StudentDAO studentDAOMock = mock(StudentDAO.class);
        when(studentDAOMock.getMarks()).thenReturn(new int[] {7, 4, 5});

        StudentService studentService = new StudentService(studentDAOMock);
        int total = studentService.findTotal();
        assertEquals(16, total);
    }

    @Test
    void findTotalEmptySet(){
        StudentDAO studentDAOMock = mock(StudentDAO.class);
        when(studentDAOMock.getMarks()).thenReturn(new int[] {});
        StudentService studentService = new StudentService(studentDAOMock);
        int result = studentService.findTotal();
        assertEquals(0, result);
    }
}
